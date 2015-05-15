/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.finder;

import com.kynomics.daten.Adresstyp;
import com.kynomics.daten.Halter;
import java.io.Serializable;

/**
 *
 * @author teilnehmer
 */
public class HalteradresseTreffer implements Serializable {

    /*
     the searchable fields
     */
    private Integer halteradresseId;
    private String halterPlz;
    private String halterOrt;
    private String halterStrasse;
    private String halterTel;
    private String email;
    private Adresstyp adresstypId;
    private Halter halterId;

    public HalteradresseTreffer() {
    }

    /*
     only set the constructor with the unique Id attribute, the details can be later 
     identified by this Id
     */
    public HalteradresseTreffer(Integer halteradresseId) {
        this.halteradresseId = halteradresseId;
    }

    public Integer getHalteradresseId() {
        return halteradresseId;
    }

    public void setHalteradresseId(Integer halteradresseId) {
        this.halteradresseId = halteradresseId;
    }

    public String getHalterPlz() {
        return halterPlz;
    }

    public void setHalterPlz(String halterPlz) {
        this.halterPlz = halterPlz;
    }

    public String getHalterOrt() {
        return halterOrt;
    }

    public void setHalterOrt(String halterOrt) {
        this.halterOrt = halterOrt;
    }

    public String getHalterStrasse() {
        return halterStrasse;
    }

    public void setHalterStrasse(String halterStrasse) {
        this.halterStrasse = halterStrasse;
    }

    public String getHalterTel() {
        return halterTel;
    }

    public void setHalterTel(String halterTel) {
        this.halterTel = halterTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresstyp getAdresstypId() {
        return adresstypId;
    }

    public void setAdresstypId(Adresstyp adresstypId) {
        this.adresstypId = adresstypId;
    }

    public Halter getHalterId() {
        return halterId;
    }

    public void setHalterId(Halter halterId) {
        this.halterId = halterId;
    }

    @Override
    public String toString() {
        return "HalteradresseTreffer{" + "halteradresseId=" + halteradresseId + ", halterPlz=" + halterPlz + ", halterOrt=" + halterOrt + ", halterStrasse=" + halterStrasse + ", halterTel=" + halterTel + ", email=" + email + ", adresstypId=" + adresstypId + ", halterId=" + halterId + '}';
    }

}
