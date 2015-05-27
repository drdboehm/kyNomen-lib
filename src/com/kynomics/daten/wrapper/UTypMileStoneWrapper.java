/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.wrapper;

import com.kynomics.daten.Untersuchungstyp;
import com.kynomics.daten.UntersuchungstypMilestone;
import java.io.Serializable;

/**
 *
 * @author dboehm
 */
public class UTypMileStoneWrapper implements Serializable {

    private static final long serialVersionUID = 1L;
    private Untersuchungstyp  uTyp;
    private UntersuchungstypMilestone uTypMilestone; 

    public UTypMileStoneWrapper(Untersuchungstyp uTyp, UntersuchungstypMilestone uTypMilestone) {
        this.uTyp = uTyp;
        this.uTypMilestone = uTypMilestone;
    }

    public Untersuchungstyp getuTyp() {
        return uTyp;
    }

    public void setuTyp(Untersuchungstyp uTyp) {
        this.uTyp = uTyp;
    }

    public UntersuchungstypMilestone getuTypMilestone() {
        return uTypMilestone;
    }

    public void setuTypMilestone(UntersuchungstypMilestone uTypMilestone) {
        this.uTypMilestone = uTypMilestone;
    }

}
