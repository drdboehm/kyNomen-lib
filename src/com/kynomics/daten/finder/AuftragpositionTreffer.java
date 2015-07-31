/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.finder;

import com.kynomics.daten.Adresstyp;
import com.kynomics.daten.Auftrag;
import com.kynomics.daten.Halter;
import com.kynomics.daten.Patient;
import com.kynomics.daten.Untersuchung;
import java.io.Serializable;

/**
 *
 * @author teilnehmer
 */
public class AuftragpositionTreffer implements Serializable {

    /*
     the searchable fields
     */
   private static final long serialVersionUID = 1L;
    private Integer auftragpositionId;
    private Integer auftragpositionNr;
    private Patient patientId;
    private Auftrag auftragId;
    private Untersuchung untersuchungId;

    public AuftragpositionTreffer() {
    }

    /*
     only set the constructor with the unique Id attribute, the details can be later 
     identified by this Id
     */
    public AuftragpositionTreffer(Integer auftragpositionId) {
        this.auftragpositionId = auftragpositionId;
    }

    public Integer getAuftragpositionId() {
        return auftragpositionId;
    }

    public void setAuftragpositionId(Integer auftragpositionId) {
        this.auftragpositionId = auftragpositionId;
    }

    public Integer getAuftragpositionNr() {
        return auftragpositionNr;
    }

    public void setAuftragpositionNr(Integer auftragpositionNr) {
        this.auftragpositionNr = auftragpositionNr;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    public Auftrag getAuftragId() {
        return auftragId;
    }

    public void setAuftragId(Auftrag auftragId) {
        this.auftragId = auftragId;
    }

    public Untersuchung getUntersuchungId() {
        return untersuchungId;
    }

    public void setUntersuchungId(Untersuchung untersuchungId) {
        this.untersuchungId = untersuchungId;
    }

    @Override
    public String toString() {
        return "AuftragpositionTreffer{" + "auftragpositionId=" + auftragpositionId + ", auftragpositionNr=" + auftragpositionNr + ", patientId=" + patientId + ", auftragId=" + auftragId + ", untersuchungId=" + untersuchungId + '}';
    }

   

}
