package rc.bootsecurity.controller;

import java.io.IOException;
import java.io.OutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rc.bootsecurity.ZXingHelper;
import rc.bootsecurity.model.Equipment;
import rc.bootsecurity.service.EquipmentService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
public class equipmentControler {
    @Autowired
    private EquipmentService equipmentService;

    @RequestMapping(value ="/equipments" , method = RequestMethod.GET)

    private List<Equipment>getallequipment(){return equipmentService.findall();}




    @RequestMapping(value ="/equipmentsbyid/{refrence}" , method = RequestMethod.GET)

    private Optional<Equipment> getaequipmentbyid(@PathVariable Long refrence){return equipmentService.findbyid(refrence);}



    @RequestMapping(value ="/equipmentsbyname/{name}" , method = RequestMethod.GET)

    private Optional<Equipment> getaequipmentbyname(@PathVariable String name){return equipmentService.findbyusername(name);}




    @RequestMapping(value ="/addequipment" ,method= RequestMethod.POST)

    private void addequipment(@RequestBody Equipment var, HttpServletResponse response) throws IOException {
        equipmentService.saveequipment(var);
        response.setContentType("image/png");
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();}

        outputStream.write( ZXingHelper.getQRCodeImage(var.getUsername(), 200, 200));
}




    @RequestMapping(value ="/updateeq" ,method = RequestMethod.PUT )
    private void updateequipment(@RequestBody Equipment var){equipmentService.updateequipment(var);}





    @RequestMapping(value ="/deleteeq/{refrence}" ,method = RequestMethod.DELETE )
    private void deleteequipment(@PathVariable Long refrence){equipmentService.deleteequipment(refrence);}


}
