/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.finder;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author teilnehmer
 */
public class SuchkriterienPatient extends Patiententreffer implements Serializable {

    /*
     default constructor - let attributes be null in case no serach entry
     */
    public SuchkriterienPatient() {
    }

    
    /*  
    the getters ans setters are in the family class
     */
    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
        if (this.getPatientId() != null) {
            where.or("p.patientId = " + this.getPatientId());
        }

        if (this.getPatientName() != null && this.getPatientName().length() != 0) {
            where.or("UPPER(p.patientName) LIKE '%"
                    + this.getPatientName().toUpperCase() + "%'");
        }
        if (this.getPatientRuf() != null && this.getPatientRuf().length() != 0) {
            where.or("UPPER(p.patientRuf) LIKE '%"
                    + this.getPatientRuf().toUpperCase() + "%'");
        }
        return where.toString();
    }
}
