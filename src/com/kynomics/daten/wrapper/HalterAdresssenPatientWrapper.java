/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.wrapper;

import com.kynomics.daten.Halter;
import com.kynomics.daten.Halteradresse;
import com.kynomics.daten.Patient;
import java.io.Serializable;

/**
 *
 * @author dboehm
 */
public class HalterAdresssenPatientWrapper implements Serializable {

    private static final long serialVersionUID = 1L;
    private Halter halter;
    private Halteradresse halteradresse;
    private Patient patient;

    public Halter getHalter() {
        return halter;
    }

    public void setHalter(Halter halter) {
        this.halter = halter;
    }

    public Halteradresse getHalteradresse() {
        return halteradresse;
    }

    public void setHalteradresse(Halteradresse halteradresse) {
        this.halteradresse = halteradresse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
