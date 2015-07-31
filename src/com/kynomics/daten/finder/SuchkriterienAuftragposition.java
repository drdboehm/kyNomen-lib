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
public class SuchkriterienAuftragposition extends AuftragpositionTreffer implements Serializable {

    /*
     default constructor - let attributes be null in case no search entry
     */
    public SuchkriterienAuftragposition() {
    }
    /*  
     the getters ans setters are in the Super-class
     */

    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
//         if (super.getAdresstypId().getAdresstypId() != null) {
//            where.or("t.adresstypId = " + super.getAdresstypId().getAdresstypId());
//        }
//        else {
////            where.or("t.haltertypId = (1,2,3,4,5)");
//        }
        
        if (super.getAuftragpositionId() != null) {
            where.or("ap.auftragpositionId = " + super.getAuftragpositionId());
        }

        if (super.getAuftragpositionNr() != null) {
            where.or("ap.auftragpositionNr = " + super.getAuftragpositionNr());
        }
        
//        if (super.getPatientId() != null && super.getPatientId().getPatientName().length() != 0) {
//            where.or("UPPER(ap.auftragText) LIKE '%"
//                    + super.getAuftragText().toUpperCase() + "%'");
//        }
        
        return where.toString();
    }
}
