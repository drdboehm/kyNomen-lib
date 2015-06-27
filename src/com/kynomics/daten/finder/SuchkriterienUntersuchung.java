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
public class SuchkriterienUntersuchung extends Untersuchungtreffer implements Serializable {

    /*
     default constructor - let attributes be null in case no search entry
     */
    public SuchkriterienUntersuchung() {
    }

    /*  
     the getters ans setters are in the family class
     */
    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
        if (super.getUntersuchungId() != null) {
            where.or("u.untersuchungId = " + super.getUntersuchungId());
        }

        if (super.getUntersuchungName() != null && super.getUntersuchungName().length() != 0) {
            where.or("UPPER(u.untersuchungName) LIKE '%"
                    + super.getUntersuchungName().toUpperCase() + "%'");
        }
        if (super.getUntersuchungDauer() != null) {
            where.or("u.untersuchungDauer = " + super.getUntersuchungDauer());
        }

        if (super.getUntersuchungPreis() != null) {
            where.or("u.untersuchungPreis = " + super.getUntersuchungPreis());
        }

        return where.toString();
    }
}
