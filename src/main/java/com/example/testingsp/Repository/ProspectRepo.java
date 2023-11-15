package com.example.testingsp.Repository;

import com.example.testingsp.Entite.Prospect;
import com.example.testingsp.Entite.TestingSP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProspectRepo extends JpaRepository<Prospect,Integer> {
}
