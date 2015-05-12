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
public class Haltertreffer implements Serializable {

    public Integer halterId;
    public String halterName;
    private String halterBemerkung;

    public Haltertreffer(Integer halterId, String halterName, String halterBemerkung) {
        this.halterId = halterId;
        this.halterName = halterName;
        this.halterBemerkung = halterBemerkung;
        
    }

    @Override
    public String toString() {
        return "Haltertreffer{" + "halterId=" + halterId + ", halterName=" + halterName + ", halterBemerkung=" + halterBemerkung + '}';
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

    

    

}
