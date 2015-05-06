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
public class Suchkriterien implements Serializable {

    private Integer halterId;
    private String teilVonHalterName;
    private String teilDerBeschreibung;

    public Suchkriterien(Integer halterId, String teilVonHalterName, String teilDerBeschreibung) {
        this.halterId = halterId;
        this.teilVonHalterName = teilVonHalterName;
        this.teilDerBeschreibung = teilDerBeschreibung;
    }

    /*
     default constructor - let attributes be null in case no serach entry
     */
    public Suchkriterien() {
    }

    public void setHalterId(Integer halterId) {
        this.halterId = halterId;
    }

    public void setTeilVonHalterName(String teilVonHalterName) {
        this.teilVonHalterName = teilVonHalterName;
    }

    public void setTeilDerBeschreibung(String teilDerBeschreibung) {
        this.teilDerBeschreibung = teilDerBeschreibung;
    }

    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
        if (halterId != null) {
            where.or("h.halterId = " + halterId);
        }

        if (teilVonHalterName != null) {
            where.or("UPPER(h.halterName) LIKE '%"
                    + teilVonHalterName.toUpperCase() + "%'");
        }
        if (teilDerBeschreibung != null) {
            where.or("UPPER(h.halterBemerkung) LIKE '%"
                    + teilDerBeschreibung.toUpperCase() + "%'");
        }
        return where.toString();
    }
}
