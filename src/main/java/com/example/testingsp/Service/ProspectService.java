package com.example.testingsp.Service;

import com.example.testingsp.DTO.ProspectDTO;

import java.util.List;

public interface ProspectService {
    String addProspect(ProspectDTO prospectDTO);

    List showProspect();


}
