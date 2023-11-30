package com.example.testingsp.Service;

import com.example.testingsp.DTO.*;
import com.example.testingsp.Entite.Consultant;
import com.example.testingsp.Entite.Prospect;
import com.example.testingsp.Repository.ConsultantRepo;
import com.example.testingsp.Repository.ProspectRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProspectIMPL implements  ProspectService{

    @Autowired
    public ProspectRepo prospectRepo ;
    @Autowired
    private ConsultantRepo consultantRepo;

    @Override
    public String addProspect(ProspectSaveDTO prospectSaveDTO){

        Prospect prospect = new Prospect(
                prospectSaveDTO.getEMAIL(),
                prospectSaveDTO.getNOM(),
                prospectSaveDTO.getStatus(),
                prospectSaveDTO.getPAYSRESIDENCE(),
                prospectSaveDTO.getSECTEURACTIVITE(),
                prospectSaveDTO.getTELEPHONE(),
                prospectSaveDTO.getCIN(),
                prospectSaveDTO.getDateNaissance(),
                prospectSaveDTO.getPROFESSION(),
                prospectSaveDTO.getSEXE(),
                prospectSaveDTO.getANNEEEXPERIENCE(),
                prospectSaveDTO.getCOMPETENCEMETIER(),
                prospectSaveDTO.getCOMPETENCETECHNIQUE(),
                prospectSaveDTO.getDISPONIBILITE(),
                prospectSaveDTO.getEXPERIENCEPROFESSIONNELLE(),
                prospectSaveDTO.getFORMATION(),
                prospectSaveDTO.getLANGUE(),
                prospectSaveDTO.getMAJCV(),
                prospectSaveDTO.getMOTCLE(),
                prospectSaveDTO.getNIVEAUACADEMIQUE()
         );
    prospectRepo.save(prospect);
    return prospect.getNOM();
    }


@Override
    public List showProspect(){

    List<Prospect> showprospect = prospectRepo.findAll();
    List<ProspectDTO> prospectDTOList = new ArrayList<>();

    for (Prospect i : showprospect){

        ProspectDTO prospectDTO = new ProspectDTO(
                i.getIDTIERS(),
                i.getEMAIL(),
                i.getNOM(),
                i.getStatus(),
                i.getPAYSRESIDENCE(),
                i.getSECTEURACTIVITE(),
                i.getTELEPHONE(),
                i.getCIN(),
                i.getDateNaissance(),
                i.getPROFESSION(),
                i.getSEXE(),
                i.getANNEEEXPERIENCE(),
                i.getCOMPETENCEMETIER(),
                i.getCOMPETENCETECHNIQUE(),
                i.getDISPONIBILITE(),
                i.getEXPERIENCEPROFESSIONNELLE(),
                i.getFORMATION(),
                i.getLANGUE(),
                i.getMAJCV(),
                i.getMOTCLE(),
                i.getNIVEAUACADEMIQUE()
        );
        prospectDTOList.add(prospectDTO);
    }
    return prospectDTOList ;
    }


    public  String updateProspect(ProspectUpDTO prospectUpDTO){
        if (prospectRepo.existsById(prospectUpDTO.getIDTIERS())){
            Prospect prospect = prospectRepo.getById(prospectUpDTO.getIDTIERS());


            prospect.setPROFESSION(prospectUpDTO.getPROFESSION());
            prospect.setSEXE(prospectUpDTO.getSEXE());
            prospect.setNOM(prospectUpDTO.getNOM());
            prospect.setStatus(prospectUpDTO.getStatus());
            prospect.setTELEPHONE(prospectUpDTO.getTELEPHONE());
            prospect.setSECTEURACTIVITE(prospectUpDTO.getSECTEURACTIVITE());
            prospect.setNIVEAUACADEMIQUE(prospectUpDTO.getNIVEAUACADEMIQUE());
            prospect.setMOTCLE(prospectUpDTO.getMOTCLE());
            prospect.setMAJCV(prospectUpDTO.getMAJCV());
            prospect.setLANGUE(prospectUpDTO.getLANGUE());
            prospect.setANNEEEXPERIENCE(prospectUpDTO.getANNEEEXPERIENCE());
            prospect.setFORMATION(prospectUpDTO.getFORMATION());
            prospect.setDISPONIBILITE(prospectUpDTO.getDISPONIBILITE());
            prospect.setEMAIL(prospectUpDTO.getEMAIL());
            prospect.setEXPERIENCEPROFESSIONNELLE(prospectUpDTO.getEXPERIENCEPROFESSIONNELLE());
            prospect.setDateNaissance(prospectUpDTO.getDateNaissance());
            prospect.setCOMPETENCETECHNIQUE(prospectUpDTO.getCOMPETENCETECHNIQUE());
            prospect.setPAYSRESIDENCE(prospectUpDTO.getPAYSRESIDENCE());
            prospect.setCOMPETENCEMETIER(prospectUpDTO.getCOMPETENCEMETIER());
            prospect.setCIN(prospectUpDTO.getCIN());


            prospectRepo.save(prospect);
            return "Prospect updated successfully";
        }
        else  {
            System.out.println("Id introuvable");
        }
        return null ;
    }

    public Prospect getProspectbyId(int idtiers){
        Optional<Prospect> optionalProspect = prospectRepo.findById(idtiers);

        if (optionalProspect.isPresent()) {
            return  optionalProspect.get();
        }
        else {
            throw  new EntityNotFoundException(("Prospect introuvable"+ idtiers));
        }

    }

    @Override
    public Consultant convertToConsultant(int idtiers) {
        Prospect prospect = prospectRepo.findById(idtiers).orElseThrow(()
                -> new EntityNotFoundException("Prospect not found with id: " + idtiers));


        if (!"Prospect".equals(prospect.getStatus())) {
            throw new IllegalStateException("Person is not a prospect.");}
        // Creation de nouveau consultant a partir de l'entité  prospect
        Consultant consultant = new Consultant();
        consultant.setConsultantname(prospect.getNOM());
        consultant.setConsultantbirthdate(prospect.getDateNaissance());
        consultant.setConsultantcin((prospect.getCIN()));

        consultant.setStatus("Consultant");

        consultant = consultantRepo.save(consultant);
        //   Status de prospect => Consultant
        prospect.setStatus("Consultant");
        prospectRepo.save(prospect);


        return consultant ;

    }

    @Override
    public boolean deleteProspect(int id) {

        if(prospectRepo.existsById(id)) {
            prospectRepo.deleteById(id);

        }
        else{
            System.out.println("Prospect id introuvable");
        }
        return true;
    }

    @Override
    public List<ProsDto> getChartData() {
        return prospectRepo.getChartData();
    }

    @Override
    public List<MajProsDTO> getMajData() {
        return prospectRepo.getMajData();
    }

    /*public List<MajProsDTO>  getMajData() {
        List<Object[]> result = prospectRepo.getMajData();
        List<MajProsDTO>  Charts = new ArrayList<>();

        for (Object row : result) {
            Object[] rowData = (Object[]) row;
            MajProsDTO majProsDTO = new MajProsDTO(
                    (String) rowData[0],
                    ((long) rowData[1])
            );
           Charts.add(majProsDTO);
        }

        return  Charts;
    }*/
}
