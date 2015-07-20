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
public class SuchkriterienHalter extends Haltertreffer implements Serializable {

    /*
     default constructor - let attributes be null in case no serach entry
     */
    public SuchkriterienHalter() {
    }

    /*  
     the getters ans setters are in the family class
     */
    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
//        System.out.println("super.getHaltertypId() = " + super.getHaltertypId());
        if (super.getHaltertypId().getHaltertypId() != null) {
            where.or("t.haltertypId = " + super.getHaltertypId().getHaltertypId());
        }
        else {
//            where.or("t.haltertypId = (1,2,3,4,5)");
        }

        if (super.halterId != null) {
            where.or("h.halterId = " + super.halterId);
        }

        if (super.getHalterName() != null && super.getHalterName().length() != 0) {
            where.or("UPPER(h.halterName) LIKE '%"
                    + super.getHalterName().toUpperCase() + "%'");
        }
        if (super.getHalterBemerkung() != null && super.getHalterBemerkung().length() != 0) {
            where.or("UPPER(h.halterBemerkung) LIKE '%"
                    + super.getHalterBemerkung().toUpperCase() + "%'");
        }

        return where.toString();
    }
}
