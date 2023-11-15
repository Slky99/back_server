package com.example.testingsp.Controller;


import com.example.testingsp.DTO.ProspectDTO;
import com.example.testingsp.DTO.TestingspDTO;
import com.example.testingsp.Service.ProspectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/prospect")
public class ProspectCont {

@Autowired
private ProspectService prospectService ;


    @PostMapping(path = "add")
    public String savepros (@RequestBody ProspectDTO prospectDTO){
        String id = prospectService.addProspect(prospectDTO);
        return id ;
    }



    @GetMapping(path = "prospect")
public List<ProspectDTO> showProspect(){
    List<ProspectDTO> allProspect = prospectService.showProspect();
    return allProspect ;
}


}
