package rc.bootsecurity.controller;

import org.springframework.web.bind.annotation.*;
import rc.bootsecurity.model.Post;
import rc.bootsecurity.service.PostSevice;

import java.util.List;
import java.util.Optional;

@RestController
public class PostsController {
    private PostSevice postservice;

    @RequestMapping(value = "/posts", method = RequestMethod.GET  )
    public List<Post> getall(){
        List<Post> tab= postservice.findall();
        return  tab ;
    }

    @RequestMapping(value ="/pojectsbyid/{id}" , method = RequestMethod.GET)

    private Optional<Post> getaequipmentbyid(@PathVariable Long id){return postservice.findById(id);}



    @RequestMapping(value ="postsbyname/{name}" , method = RequestMethod.GET)

    private Post getaequipmentbyname(@PathVariable String name){return (Post) postservice.findbyname(name);}




    @RequestMapping(value ="/addpo" ,method= RequestMethod.POST)

    private void addequipment(@RequestBody Post var){postservice.save(var);}





    @RequestMapping(value ="/updatepo" ,method = RequestMethod.PUT )
    private void updateequipment(@RequestBody Post var){postservice.deletepost(var.getId());
        postservice.save(var);}





    @RequestMapping(value ="/deletepo/{id}" ,method = RequestMethod.DELETE )
    private void deleteequipment(@PathVariable Long id){postservice.deletepost(id);}


}






