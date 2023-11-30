package com.example.testingsp.DTO;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String prospectId;

    public FileEntity() {
    }

    public FileEntity(String fileName, String prospectId) {
        this.fileName = fileName;
        this.prospectId = prospectId;
    }
}
