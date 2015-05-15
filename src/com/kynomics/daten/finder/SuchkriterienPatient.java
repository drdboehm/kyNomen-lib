/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.finder;

import java.io.Serializable;

/**
 *
 * @author teilnehmer
 */
public class SuchkriterienPatient extends Patiententreffer implements Serializable {

    /*
     default constructor - let attributes be null in case no search entry
     */
    public SuchkriterienPatient() {
    }

    /*  
     the getters ans setters are in the family class
     */
    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
        if (super.getPatientId() != null) {
            where.or("p.patientId = " + super.getPatientId());
        }

        if (super.getPatientName() != null && super.getPatientName().length() != 0) {
            where.or("UPPER(p.patientName) LIKE '%"
                    + super.getPatientName().toUpperCase() + "%'");
        }
        if (super.getPatientRuf() != null && super.getPatientRuf().length() != 0) {
            where.or("UPPER(p.patientRuf) LIKE '%"
                    + super.getPatientRuf().toUpperCase() + "%'");
        }

        if (super.getPatientChip() != null && super.getPatientChip().length() != 0) {
            where.or("UPPER(p.patientChip) LIKE '%"
                    + super.getPatientChip().toUpperCase() + "%'");
        }

        if (super.getPatientTatoonr() != null && super.getPatientTatoonr().length() != 0) {
            where.or("UPPER(p.patientTatoonr) LIKE '%"
                    + super.getPatientTatoonr().toUpperCase() + "%'");
        }

        if (super.getPatientZuchtbuchnr() != null && super.getPatientZuchtbuchnr().length() != 0) {
            where.or("UPPER(p.patientZuchtbuchnr) LIKE '%"
                    + super.getPatientZuchtbuchnr().toUpperCase() + "%'");
        }
        return where.toString();
    }
}
