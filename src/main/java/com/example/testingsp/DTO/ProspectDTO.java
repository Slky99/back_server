package com.example.testingsp.DTO;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class ProspectDTO {
    private int IDTIERS ;
    private String ADRESSE ;
    private String EMAIL ;
    private String  NOM ;
    private String PAYSRESIDENCE ;
    private String  SECTEURACTIVITE ;
    private long TELEPHONE ;
    private String CIN ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateNaissance;

    private String PROFESSION ;
    private String SEXE ;
    private long ANNEEEXPERIENCE ;
    private String COMPETENCEMETIER ;
    private String COMPETENCETECHNIQUE ;
    private String DISPONIBILITE ;
    private String EXPERIENCEPROFESSIONNELLE ;
    private String FORMATION;
    private String LANGUE;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate MAJCV;

    private String MOTCLE ;
    private String NIVEAUACADEMIQUE ;

    public ProspectDTO(int IDTIERS, String ADRESSE, String EMAIL, String NOM, String PAYSRESIDENCE, String SECTEURACTIVITE, long TELEPHONE, String CIN, LocalDate dateNaissance,  String PROFESSION, String SEXE, long ANNEEEXPERIENCE, String COMPETENCEMETIER, String COMPETENCETECHNIQUE, String DISPONIBILITE, String EXPERIENCEPROFESSIONNELLE, String FORMATION, String LANGUE, LocalDate MAJCV, String MOTCLE, String NIVEAUACADEMIQUE) {
        this.IDTIERS = IDTIERS;
        this.ADRESSE = ADRESSE;
        this.EMAIL = EMAIL;
        this.NOM = NOM;
        this.PAYSRESIDENCE = PAYSRESIDENCE;
        this.SECTEURACTIVITE = SECTEURACTIVITE;
        this.TELEPHONE = TELEPHONE;
        this.CIN = CIN;
        this.dateNaissance = dateNaissance;

        this.PROFESSION = PROFESSION;
        this.SEXE = SEXE;
        this.ANNEEEXPERIENCE = ANNEEEXPERIENCE;
        this.COMPETENCEMETIER = COMPETENCEMETIER;
        this.COMPETENCETECHNIQUE = COMPETENCETECHNIQUE;
        this.DISPONIBILITE = DISPONIBILITE;
        this.EXPERIENCEPROFESSIONNELLE = EXPERIENCEPROFESSIONNELLE;
        this.FORMATION = FORMATION;
        this.LANGUE = LANGUE;
        this.MAJCV = MAJCV;
        this.MOTCLE = MOTCLE;
        this.NIVEAUACADEMIQUE = NIVEAUACADEMIQUE;
    }

    public int getIDTIERS() {
        return IDTIERS;
    }

    public void setIDTIERS(int IDTIERS) {
        this.IDTIERS = IDTIERS;
    }

    public String getADRESSE() {
        return ADRESSE;
    }

    public void setADRESSE(String ADRESSE) {
        this.ADRESSE = ADRESSE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public String getPAYSRESIDENCE() {
        return PAYSRESIDENCE;
    }

    public void setPAYSRESIDENCE(String PAYSRESIDENCE) {
        this.PAYSRESIDENCE = PAYSRESIDENCE;
    }

    public String getSECTEURACTIVITE() {
        return SECTEURACTIVITE;
    }

    public void setSECTEURACTIVITE(String SECTEURACTIVITE) {
        this.SECTEURACTIVITE = SECTEURACTIVITE;
    }

    public long getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(long TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


    public String getPROFESSION() {
        return PROFESSION;
    }

    public void setPROFESSION(String PROFESSION) {
        this.PROFESSION = PROFESSION;
    }

    public String getSEXE() {
        return SEXE;
    }

    public void setSEXE(String SEXE) {
        this.SEXE = SEXE;
    }

    public long getANNEEEXPERIENCE() {
        return ANNEEEXPERIENCE;
    }

    public void setANNEEEXPERIENCE(long ANNEEEXPERIENCE) {
        this.ANNEEEXPERIENCE = ANNEEEXPERIENCE;
    }

    public String getCOMPETENCEMETIER() {
        return COMPETENCEMETIER;
    }

    public void setCOMPETENCEMETIER(String COMPETENCEMETIER) {
        this.COMPETENCEMETIER = COMPETENCEMETIER;
    }

    public String getCOMPETENCETECHNIQUE() {
        return COMPETENCETECHNIQUE;
    }

    public void setCOMPETENCETECHNIQUE(String COMPETENCETECHNIQUE) {
        this.COMPETENCETECHNIQUE = COMPETENCETECHNIQUE;
    }

    public String getDISPONIBILITE() {
        return DISPONIBILITE;
    }

    public void setDISPONIBILITE(String DISPONIBILITE) {
        this.DISPONIBILITE = DISPONIBILITE;
    }

    public String getEXPERIENCEPROFESSIONNELLE() {
        return EXPERIENCEPROFESSIONNELLE;
    }

    public void setEXPERIENCEPROFESSIONNELLE(String EXPERIENCEPROFESSIONNELLE) {
        this.EXPERIENCEPROFESSIONNELLE = EXPERIENCEPROFESSIONNELLE;
    }

    public String getFORMATION() {
        return FORMATION;
    }

    public void setFORMATION(String FORMATION) {
        this.FORMATION = FORMATION;
    }

    public String getLANGUE() {
        return LANGUE;
    }

    public void setLANGUE(String LANGUE) {
        this.LANGUE = LANGUE;
    }

    public LocalDate getMAJCV() {
        return MAJCV;
    }

    public void setMAJCV(LocalDate MAJCV) {
        this.MAJCV = MAJCV;
    }

    public String getMOTCLE() {
        return MOTCLE;
    }

    public void setMOTCLE(String MOTCLE) {
        this.MOTCLE = MOTCLE;
    }

    public String getNIVEAUACADEMIQUE() {
        return NIVEAUACADEMIQUE;
    }

    public void setNIVEAUACADEMIQUE(String NIVEAUACADEMIQUE) {
        this.NIVEAUACADEMIQUE = NIVEAUACADEMIQUE;
    }

    @Override
    public String toString() {
        return "ProspectDTO{" +
                "IDTIERS=" + IDTIERS +
                ", ADRESSE='" + ADRESSE + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", NOM='" + NOM + '\'' +
                ", PAYSRESIDENCE='" + PAYSRESIDENCE + '\'' +
                ", SECTEURACTIVITE='" + SECTEURACTIVITE + '\'' +
                ", TELEPHONE=" + TELEPHONE +
                ", CIN='" + CIN + '\'' +
                ", dateNaissance=" + dateNaissance +
                 ", PROFESSION='" + PROFESSION + '\'' +
                ", SEXE='" + SEXE + '\'' +
                ", ANNEEEXPERIENCE=" + ANNEEEXPERIENCE +
                ", COMPETENCEMETIER='" + COMPETENCEMETIER + '\'' +
                ", COMPETENCETECHNIQUE='" + COMPETENCETECHNIQUE + '\'' +
                ", DISPONIBILITE='" + DISPONIBILITE + '\'' +
                ", EXPERIENCEPROFESSIONNELLE='" + EXPERIENCEPROFESSIONNELLE + '\'' +
                ", FORMATION='" + FORMATION + '\'' +
                ", LANGUE='" + LANGUE + '\'' +
                ", MAJCV=" + MAJCV +
                ", MOTCLE='" + MOTCLE + '\'' +
                ", NIVEAUACADEMIQUE='" + NIVEAUACADEMIQUE + '\'' +
                '}';
    }
}
