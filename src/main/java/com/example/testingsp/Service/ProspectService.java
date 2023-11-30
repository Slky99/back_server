package com.example.testingsp.Service;

import com.example.testingsp.DTO.*;
import com.example.testingsp.Entite.Consultant;
import com.example.testingsp.Entite.Prospect;

import java.util.List;

public interface ProspectService {
    String addProspect(ProspectSaveDTO prospectSaveDTO);

    List showProspect();


    Prospect getProspectbyId(int idtiers);

    String updateProspect(ProspectUpDTO prospectUpDTO);

    Consultant convertToConsultant(int idtiers);

    boolean deleteProspect(int id);

    List<ProsDto> getChartData();

    List<MajProsDTO> getMajData();
}
