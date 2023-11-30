package com.example.testingsp.Controller;


import com.example.testingsp.DTO.ConsultantDTO;
import com.example.testingsp.DTO.ConsultantSaveDTO;
import com.example.testingsp.DTO.ProspectDTO;
import com.example.testingsp.Entite.Consultant;
import com.example.testingsp.Entite.Prospect;
import com.example.testingsp.Service.ConsultantService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/consultant")
public class ConsultantCont {

    @Autowired
    public ConsultantService consultantService ;

    @GetMapping(path = "consultant")
    public List<ConsultantDTO> showCons(){
        List<ConsultantDTO> allConsultant = consultantService.showConsultant();
        return  allConsultant ;
    }

    @PostMapping("add")
    public  String saveconsultant (@RequestBody ConsultantSaveDTO consultantSaveDTO){
        String id = consultantService.addConsultant(consultantSaveDTO);
        return id ;
    }

    @DeleteMapping (path="/delete/{id}")
    public String deleteConsultant(@PathVariable(value = "id")int id)
    {
        boolean deleteConsultant = consultantService.deleteConsultant(id);
        return "Supprimer";
    }

    @GetMapping("/{consultantid}")
    public ResponseEntity<ConsultantDTO> getProspectbyId(@PathVariable int consultantid) {
        try {
            Consultant consultant = consultantService.getConsultantbyId(consultantid);
            ConsultantDTO consultantDTO = convertToDTO(consultant);
            return ResponseEntity.ok(consultantDTO);
        } catch (EntityNotFoundException ex) {
            return ResponseEntity.notFound().build();
        } catch (Exception ex) {
            // Log the exception for further analysis
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    private ConsultantDTO convertToDTO(Consultant consultant){
        ConsultantDTO consultantDTO = new ConsultantDTO(
                consultant.getConsultantid(),
                consultant.getConsultantname(),
                consultant.getStatus(),
                consultant.getConsultantcin(),
                consultant.getConsultantbirthdate(),
                consultant.getExperiencepro(),
                consultant.getSecteuractivite(),
                consultant.getEmail(),
                consultant.getCompetencemetier(),
                consultant.getTJM(),
                consultant.getMobile(),
                consultant.getMission()
        ) ;
        return consultantDTO ;
    }


    @GetMapping(value = "/name/{consultantId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> getConsultantName(@PathVariable int consultantId) {
        String consultantName = consultantService.getConsultantName(consultantId);
        if (consultantName != null) {
            // Create a response map with the consultantName
            Map<String, String> response = new HashMap<>();
            response.put("consultantName", consultantName);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
