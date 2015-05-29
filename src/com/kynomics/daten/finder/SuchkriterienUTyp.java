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
public class SuchkriterienUTyp extends UTypTreffer implements Serializable{

    /*
     default constructor - let attributes be null in case no serach entry
     */
    public SuchkriterienUTyp() {
    }

     /*  
     the getters ans setters are in the super class
     */


   
    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
        if (super.getUntersuchungtypId() != null) {
            where.or("ut.untersuchungtypId = " + super.getUntersuchungtypId());
        }

        if (super.getUntersuchungtypName() != null && super.getUntersuchungtypName().length() != 0) {
            where.or("UPPER(ut.untersuchungtypName) LIKE '%"
                    + super.getUntersuchungtypName().toUpperCase() + "%'");
        }
        if (super.getUntersuchungtypGen() != null && super.getUntersuchungtypGen().length() != 0) {
            where.or("UPPER(ut.untersuchungtypGen) LIKE '%"
                    + super.getUntersuchungtypGen().toUpperCase() + "%'");
        }
        
         if (super.getUntersuchungtypMut() != null && super.getUntersuchungtypMut().length() != 0) {
            where.or("UPPER(ut.untersuchungtypMut) LIKE '%"
                    + super.getUntersuchungtypMut().toUpperCase() + "%'");
        }
        return where.toString();
    }
}
