package com.example.testingsp.DTO;

import java.security.Timestamp;
import java.util.Date;

public class AppoffresSaveDTO {

    private String missions ;
    private int Client ;
    private Boolean D_administratif;
    private Boolean D_financier ;
    private Boolean Cv_formater ;
    private Date consultation_date ;
    private Timestamp heure ;
    private String  consultation ;

    public AppoffresSaveDTO() {
    }

    public AppoffresSaveDTO(String missions, int client, Boolean d_administratif, Boolean d_financier, Boolean cv_formater, Date consultation_date, Timestamp heure, String consultation) {
        this.missions = missions;
        Client = client;
        D_administratif = d_administratif;
        D_financier = d_financier;
        Cv_formater = cv_formater;
        this.consultation_date = consultation_date;
        this.heure = heure;
        this.consultation = consultation;
    }

    public String getMissions() {
        return missions;
    }

    public void setMissions(String missions) {
        this.missions = missions;
    }

    public int getClient() {
        return Client;
    }

    public void setClient(int client) {
        Client = client;
    }

    public Boolean getD_administratif() {
        return D_administratif;
    }

    public void setD_administratif(Boolean d_administratif) {
        D_administratif = d_administratif;
    }

    public Boolean getD_financier() {
        return D_financier;
    }

    public void setD_financier(Boolean d_financier) {
        D_financier = d_financier;
    }

    public Boolean getCv_formater() {
        return Cv_formater;
    }

    public void setCv_formater(Boolean cv_formater) {
        Cv_formater = cv_formater;
    }

    public Date getConsultation_date() {
        return consultation_date;
    }

    public void setConsultation_date(Date consultation_date) {
        this.consultation_date = consultation_date;
    }

    public Timestamp getHeure() {
        return heure;
    }

    public void setHeure(Timestamp heure) {
        this.heure = heure;
    }

    public String getConsultation() {
        return consultation;
    }

    public void setConsultation(String consultation) {
        this.consultation = consultation;
    }

    @Override
    public String toString() {
        return "AppoffresSaveDTO{" +
                "missions='" + missions + '\'' +
                ", Client=" + Client +
                ", D_administratif=" + D_administratif +
                ", D_financier=" + D_financier +
                ", Cv_formater=" + Cv_formater +
                ", consultation_date=" + consultation_date +
                ", heure=" + heure +
                ", consultation='" + consultation + '\'' +
                '}';
    }
}
