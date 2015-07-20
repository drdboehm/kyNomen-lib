/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.finder;

import com.kynomics.daten.Haltertyp;
import java.io.Serializable;

/**
 *
 * @author teilnehmer
 */
public class Haltertreffer implements Serializable {

    public Integer halterId;
    public String halterName;
    private String halterBemerkung;
    private Haltertyp haltertypId;

    
    
    public Haltertreffer() {
    }
    
     /*
     only set the constructor with the unique Id attribute, the details can be later 
    identified by this Id
     */
    public Haltertreffer(Integer halterId) {
        this.halterId = halterId;
    }

    @Override
    public String toString() {
        return "Haltertreffer{" + "halterId=" + halterId + ", halterName=" + halterName + ", halterBemerkung=" + halterBemerkung + ", haltertypId=" + haltertypId + '}';
    }


    public Integer getHalterId() {
        return halterId;
    }

    public void setHalterId(Integer halterId) {
        this.halterId = halterId;
    }

    public String getHalterName() {
        return halterName;
    }

    public void setHalterName(String halterName) {
        this.halterName = halterName;
    }

    public String getHalterBemerkung() {
        return halterBemerkung;
    }

    public void setHalterBemerkung(String halterBemerkung) {
        this.halterBemerkung = halterBemerkung;
    }

    public Haltertyp getHaltertypId() {
        return haltertypId;
    }

    public void setHaltertypId(Haltertyp haltertypId) {
        this.haltertypId = haltertypId;
    }

    

    

}
