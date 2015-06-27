/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.wrapper;

import com.kynomics.daten.Untersuchung;
import java.io.Serializable;

/**
 *
 * @author dboehm
 */
public class UntersuchungWrapper implements Serializable {

    private static final long serialVersionUID = 1L;
    private Untersuchung untersuchung;

    public UntersuchungWrapper(Untersuchung untersuchung) {
        this.untersuchung = untersuchung;
    }

    public Untersuchung getUntersuchung() {
        return untersuchung;
    }

    public void setUntersuchung(Untersuchung untersuchung) {
        this.untersuchung = untersuchung;
    }

}
