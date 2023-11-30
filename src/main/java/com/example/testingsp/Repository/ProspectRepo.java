package com.example.testingsp.Repository;

import com.example.testingsp.DTO.MajProsDTO;
import com.example.testingsp.DTO.ProsDto;
import com.example.testingsp.Entite.Prospect;
import com.example.testingsp.Entite.TestingSP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProspectRepo extends JpaRepository<Prospect,Integer> {
    @Query("SELECT new com.example.testingsp.DTO.ProsDto(p.SECTEURACTIVITE," +
            " COUNT(p)) FROM Prospect p where p.SECTEURACTIVITE !='Non renseigné'" +
            "GROUP BY p.SECTEURACTIVITE")
    List<ProsDto> getChartData();

    @Query("SELECT new com.example.testingsp.DTO.MajProsDTO(p.MAJCV," +
            " COUNT(p)) FROM Prospect p where p.MAJCV is not null AND p.MAJCV !=''" +
            "GROUP BY p.MAJCV")
    List<MajProsDTO>  getMajData();

}
