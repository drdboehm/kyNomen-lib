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
public class SuchkriterienHalteradresse extends HalteradresseTreffer implements Serializable {

    /*
     default constructor - let attributes be null in case no search entry
     */
    public SuchkriterienHalteradresse() {
    }
    /*  
     the getters ans setters are in the Super-class
     */

    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
         if (super.getAdresstypId().getAdresstypId() != null) {
            where.or("t.adresstypId = " + super.getAdresstypId().getAdresstypId());
        }
        else {
//            where.or("t.haltertypId = (1,2,3,4,5)");
        }
        
        if (super.getHalteradresseId() != null) {
            where.or("ha.halteradresseId = " + super.getHalteradresseId());
        }

        if (super.getHalterStrasse() != null && super.getHalterStrasse().length() != 0) {
            where.or("UPPER(ha.halterStrasse) LIKE '%"
                    + super.getHalterStrasse().toUpperCase() + "%'");
        }
        if (super.getHalterPlz() != null && super.getHalterPlz().length() != 0) {
            where.or("UPPER(ha.halterPlz) LIKE '%"
                    + super.getHalterPlz().toUpperCase() + "%'");
        }
        if (super.getHalterOrt() != null && super.getHalterOrt().length() != 0) {
            where.or("UPPER(ha.halterOrt) LIKE '%"
                    + super.getHalterOrt().toUpperCase() + "%'");
        }

        if (super.getHalterTel() != null && super.getHalterTel().length() != 0) {
            where.or("UPPER(ha.halterTel) LIKE '%"
                    + super.getHalterTel().toUpperCase() + "%'");
        }
        
        if (super.getEmail() != null && super.getEmail().length() != 0) {
            where.or("UPPER(ha.email) LIKE '%"
                    + super.getEmail().toUpperCase() + "%'");
        }
        return where.toString();
    }
}
