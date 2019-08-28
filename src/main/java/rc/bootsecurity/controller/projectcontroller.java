package rc.bootsecurity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rc.bootsecurity.model.Project;
import rc.bootsecurity.service.projectService;

import java.util.List;
import java.util.Optional;

@RestController
public class projectcontroller {
    @Autowired
    private projectService projectService;

    @RequestMapping(value ="/projects" , method = RequestMethod.GET)

    private List<Project>getallequipment(){return projectService.findAll();}




    @RequestMapping(value ="/projectsbyid/{refrence}" , method = RequestMethod.GET)

    private Optional<Project> getaequipmentbyid(@PathVariable Long refrence){return projectService.findById(refrence);}



    @RequestMapping(value ="/probyname/{name}" , method = RequestMethod.GET)

    private Project getaequipmentbyname(@PathVariable String name){return projectService.findbyname(name);}




    @RequestMapping(value ="/addpro" ,method= RequestMethod.POST)

    private void addequipment(@RequestBody Project var){projectService.saveproject(var);}





    @RequestMapping(value ="/updatepro" ,method = RequestMethod.PUT )
    private void updateequipment(@RequestBody Project var){projectService.delete(var.getId());
    projectService.saveproject(var);}





    @RequestMapping(value ="/deletepro/{id}" ,method = RequestMethod.DELETE )
    private void deleteequipment(@PathVariable Long id){projectService.delete(id);}


}
