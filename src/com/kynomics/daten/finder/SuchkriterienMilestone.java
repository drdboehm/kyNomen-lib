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
public class SuchkriterienMilestone extends MilestoneTreffer implements Serializable{

    /*
     default constructor - let attributes be null in case no serach entry
     */
    public SuchkriterienMilestone() {
    }

     /*  
     the getters ans setters are in the super class
     */


   
    @Override
    public String toString() {
        WhereKlausel where = new WhereKlausel();
        if (super.getMilestoneId() != null) {
            where.or("ms.milestoneId = " + super.getMilestoneId());
        }

        if (super.getMilestoneName() != null && super.getMilestoneName().length() != 0) {
            where.or("UPPER(ms.milestoneName) LIKE '%"
                    + super.getMilestoneName().toUpperCase() + "%'");
        }
        if (super.getMilestonetypId() != null) {
            where.or("ms.milestonetypId = "
                    + super.getMilestonetypId().getMilestonetypId());
        }
        
        return where.toString();
    }
}
