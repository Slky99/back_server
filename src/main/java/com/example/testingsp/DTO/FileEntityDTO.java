package com.example.testingsp.DTO;

public class FileEntityDTO {

    private Long id;

    private String fileName;

    private String prospectId;



    public FileEntityDTO(Long id, String fileName, String prospectId) {
        this.id = id;
        this.fileName = fileName;
        this.prospectId = prospectId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getProspectId() {
        return prospectId;
    }

    public void setProspectId(String prospectId) {
        this.prospectId = prospectId;
    }

    @Override
    public String toString() {
        return "FileEntityDTO{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", prospectId='" + prospectId + '\'' +
                '}';
    }
}
