/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.finder;

/**
 *
 * @author teilnehmer
 */
public class WhereKlausel {

    private String ausdruck;

    public WhereKlausel(String teilausdruck) {
        ausdruck = teilausdruck;
    }

    public WhereKlausel() {
        this("");
    }

    public WhereKlausel and(String teilausdruck) {
        return erweitern(teilausdruck, "AND");
    }

    public WhereKlausel or(String teilausdruck) {
        return erweitern(teilausdruck, "OR");
    }

    public WhereKlausel erweitern(String teilausdruck, String operator) {
        ausdruck = (ausdruck.isEmpty()) ? teilausdruck
                : ausdruck + " " + operator + " " + teilausdruck;
        return this;
    }

    public String toString() {
        return ausdruck.isEmpty() ? ausdruck : " WHERE " + ausdruck;
    }

}
