/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.wrapper;

import com.kynomics.daten.Milestone;
import com.kynomics.daten.Untersuchungstyp;
import java.io.Serializable;

/**
 *
 * @author dboehm
 */
public class UTypMileStoneWrapper implements Serializable {

    private static final long serialVersionUID = 1L;
    private Untersuchungstyp  uTyp;
    private Milestone milestone; 

    public UTypMileStoneWrapper(Untersuchungstyp uTyp, Milestone milestone) {
        this.uTyp = uTyp;
        this.milestone = milestone;
    }

    public Untersuchungstyp getuTyp() {
        return uTyp;
    }

    public void setuTyp(Untersuchungstyp uTyp) {
        this.uTyp = uTyp;
    }

    public Milestone getMilestone() {
        return milestone;
    }

    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    

}
