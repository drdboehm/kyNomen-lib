package com.kynomics.daten.finder;

import java.io.Serializable;

/**
 *
 * @author teilnehmer
 */
public class UTypTreffer implements Serializable {

    /**
     * following are the selected fields from class Untersuchungstyp
     * which are defined as searchable
     */
    private Integer untersuchungtypId;
    private String untersuchungtypName;
    private String untersuchungtypGen;
    private String untersuchungtypMut;

    public UTypTreffer() {
    }

    /*
     only set the constructor with the unique Id attribute, the details can be later 
     identified by this Id
     */
    public UTypTreffer(Integer untersuchungtypId) {
        this.untersuchungtypId = untersuchungtypId;
    }

    public Integer getUntersuchungtypId() {
        return untersuchungtypId;
    }

    public void setUntersuchungtypId(Integer untersuchungtypId) {
        this.untersuchungtypId = untersuchungtypId;
    }

    public String getUntersuchungtypName() {
        return untersuchungtypName;
    }

    public void setUntersuchungtypName(String untersuchungtypName) {
        this.untersuchungtypName = untersuchungtypName;
    }

    public String getUntersuchungtypGen() {
        return untersuchungtypGen;
    }

    public void setUntersuchungtypGen(String untersuchungtypGen) {
        this.untersuchungtypGen = untersuchungtypGen;
    }

    public String getUntersuchungtypMut() {
        return untersuchungtypMut;
    }

    public void setUntersuchungtypMut(String untersuchungtypMut) {
        this.untersuchungtypMut = untersuchungtypMut;
    }

}
