package com.example.testingsp.Service;

import com.example.testingsp.DTO.ProspectDTO;
import com.example.testingsp.Entite.Prospect;
import com.example.testingsp.Repository.ProspectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProspectIMPL implements  ProspectService{

    @Autowired
    public ProspectRepo prospectRepo ;

    @Override
    public String addProspect(ProspectDTO prospectDTO){

        Prospect prospect = new Prospect(
                prospectDTO.getNOM(),
                prospectDTO.getEMAIL(),
                prospectDTO.getADRESSE(),
                prospectDTO.getPAYSRESIDENCE(),
                prospectDTO.getSECTEURACTIVITE(),
                prospectDTO.getTELEPHONE(),
                prospectDTO.getCIN(),
                prospectDTO.getDateNaissance(),
                prospectDTO.getPROFESSION(),
                prospectDTO.getSEXE(),
                prospectDTO.getANNEEEXPERIENCE(),
                prospectDTO.getCOMPETENCEMETIER(),
                prospectDTO.getCOMPETENCETECHNIQUE(),
                prospectDTO.getDISPONIBILITE(),
                prospectDTO.getEXPERIENCEPROFESSIONNELLE(),
                prospectDTO.getFORMATION(),
                prospectDTO.getLANGUE(),
                prospectDTO.getMAJCV(),
                prospectDTO.getMOTCLE(),
                prospectDTO.getNIVEAUACADEMIQUE()
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
                i.getNOM(),
                i.getEMAIL(),
                i.getADRESSE(),
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




}
