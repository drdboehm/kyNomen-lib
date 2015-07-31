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
public class SuchkriterienAuftrag extends Auftragtreffer implements Serializable {

    /*
     default constructor - let attributes be null in case no search entry
     */
    public SuchkriterienAuftrag() {
    }

    /*  
     the getters ans setters are in the family class
     */
    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
        if (super.getAuftragId() != null) {
            where.or("a.auftragId = " + super.getAuftragId());
        }

        if (super.getAuftragText() != null && super.getAuftragText().length() != 0) {
            where.or("UPPER(a.auftragText) LIKE '%"
                    + super.getAuftragText().toUpperCase() + "%'");
        }

        return where.toString();
    }
}
