package com.example.testingsp.Repository;

import com.example.testingsp.Entite.UsersAuth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersAuthRepo extends JpaRepository<UsersAuth, Integer> {
    boolean existsByEmailAndPassword(String email, String password);
}
