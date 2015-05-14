package com.kynomics.daten.finder;

import com.kynomics.daten.Rasse;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author teilnehmer
 */
public class Patiententreffer implements Serializable{

    private Integer patientId;
    private String patientName;
    private String patientRuf;
    private String patientChip;
    private Date patientGeb;
    private String patientZuchtbuchnr;
    private String patientTatoonr;
    private Rasse rasse;

    public Patiententreffer() {
    }

    /*
     only set the constructor with the unique Id attribute, the details can be later 
    identified by this Id
     */
    public Patiententreffer(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientRuf() {
        return patientRuf;
    }

    public void setPatientRuf(String patientRuf) {
        this.patientRuf = patientRuf;
    }

    public String getPatientChip() {
        return patientChip;
    }

    public void setPatientChip(String patientChip) {
        this.patientChip = patientChip;
    }

    public Date getPatientGeb() {
        return patientGeb;
    }

    public void setPatientGeb(Date patientGeb) {
        this.patientGeb = patientGeb;
    }

    public String getPatientZuchtbuchnr() {
        return patientZuchtbuchnr;
    }

    public void setPatientZuchtbuchnr(String patientZuchtbuchnr) {
        this.patientZuchtbuchnr = patientZuchtbuchnr;
    }

    public String getPatientTatoonr() {
        return patientTatoonr;
    }

    public void setPatientTatoonr(String patientTatoonr) {
        this.patientTatoonr = patientTatoonr;
    }

    public Rasse getRasse() {
        return rasse;
    }

    public void setRasse(Rasse rasse) {
        this.rasse = rasse;
    }

}
