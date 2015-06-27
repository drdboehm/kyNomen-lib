package com.kynomics.daten.finder;

import com.kynomics.daten.Rasse;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author teilnehmer
 */
public class Untersuchungtreffer implements Serializable {

    private Integer untersuchungId;
    private String untersuchungName;
    private Integer untersuchungDauer;
    private Double untersuchungPreis;

    public Untersuchungtreffer() {
    }

    /*
     only set the constructor with the unique Id attribute, the details can be later 
     identified by this Id
     */
    public Untersuchungtreffer(Integer untersuchungId) {
        this.untersuchungId = untersuchungId;
    }

    public Integer getUntersuchungId() {
        return untersuchungId;
    }

    public void setUntersuchungId(Integer untersuchungId) {
        this.untersuchungId = untersuchungId;
    }

    public String getUntersuchungName() {
        return untersuchungName;
    }

    public void setUntersuchungName(String untersuchungName) {
        this.untersuchungName = untersuchungName;
    }

    public Integer getUntersuchungDauer() {
        return untersuchungDauer;
    }

    public void setUntersuchungDauer(Integer untersuchungDauer) {
        this.untersuchungDauer = untersuchungDauer;
    }

    public Double getUntersuchungPreis() {
        return untersuchungPreis;
    }

    public void setUntersuchungPreis(Double untersuchungPreis) {
        this.untersuchungPreis = untersuchungPreis;
    }

}
