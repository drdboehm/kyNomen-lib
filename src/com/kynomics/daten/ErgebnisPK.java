/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author dboehm
 */
@Embeddable
public class ErgebnisPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ergebnis_id", nullable = false)
    private int ergebnisId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "untersuchung_id", nullable = false)
    private int untersuchungId;

    public ErgebnisPK() {
    }

    public ErgebnisPK(int ergebnisId, int untersuchungId) {
        this.ergebnisId = ergebnisId;
        this.untersuchungId = untersuchungId;
    }

    public int getErgebnisId() {
        return ergebnisId;
    }

    public void setErgebnisId(int ergebnisId) {
        this.ergebnisId = ergebnisId;
    }

    public int getUntersuchungId() {
        return untersuchungId;
    }

    public void setUntersuchungId(int untersuchungId) {
        this.untersuchungId = untersuchungId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ergebnisId;
        hash += (int) untersuchungId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ErgebnisPK)) {
            return false;
        }
        ErgebnisPK other = (ErgebnisPK) object;
        if (this.ergebnisId != other.ergebnisId) {
            return false;
        }
        if (this.untersuchungId != other.untersuchungId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ErgebnisPK{" + "ergebnisId=" + ergebnisId + ", untersuchungId=" + untersuchungId + '}';
    }

   
    
}
