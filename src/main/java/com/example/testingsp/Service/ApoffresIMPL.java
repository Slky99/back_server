package com.example.testingsp.Service;


import com.example.testingsp.DTO.ApoffresDTO;
import com.example.testingsp.DTO.AppoffresSaveDTO;
import com.example.testingsp.Entite.Apoffres;
import com.example.testingsp.Repository.ApoffresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApoffresIMPL implements  ApoffresService{

    @Autowired
    public ApoffresRepo apoffresRepo ;


    @Override
    public String addOffres(AppoffresSaveDTO appoffresSaveDTO){
        Apoffres apoffres = new Apoffres(
                appoffresSaveDTO.getMissions(),
                appoffresSaveDTO.getClient(),
                appoffresSaveDTO.getD_administratif(),
                appoffresSaveDTO.getD_financier(),
                appoffresSaveDTO.getCv_formater(),
                appoffresSaveDTO.getConsultation_date(),
                appoffresSaveDTO.getHeure(),
                appoffresSaveDTO.getConsultation()
        );
        apoffresRepo.save(apoffres) ;
        return  apoffres.getMissions();
    }

    @Override
    public List showOffres(){
        List<Apoffres> showoffres = apoffresRepo.findAll();
        List<ApoffresDTO> apoffresDTOList =new ArrayList<>();

        for (Apoffres i: showoffres){
            ApoffresDTO apoffresDTO = new ApoffresDTO(
                    i.getId_offres(),
                    i.getMissions(),
                    i.getClient(),
                    i.getD_administratif(),
                    i.getD_financier(),
                    i.getCv_formater(),
                    i.getConsultation_date(),
                    i.getHeure(),
                    i.getConsultation()
            );
            apoffresDTOList.add(apoffresDTO);
        }
        return apoffresDTOList ;
    }
}
