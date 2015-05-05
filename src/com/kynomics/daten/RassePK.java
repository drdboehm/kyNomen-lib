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
 * @author teilnehmer
 */
@Embeddable
public class RassePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "rasse_id", nullable = false)
    private int rasseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "spezies_id", nullable = false)
    private int speziesId;

    public RassePK() {
    }

    public RassePK(int rasseId, int speziesId) {
        this.rasseId = rasseId;
        this.speziesId = speziesId;
    }

    public int getRasseId() {
        return rasseId;
    }

    public void setRasseId(int rasseId) {
        this.rasseId = rasseId;
    }

    public int getSpeziesId() {
        return speziesId;
    }

    public void setSpeziesId(int speziesId) {
        this.speziesId = speziesId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rasseId;
        hash += (int) speziesId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RassePK)) {
            return false;
        }
        RassePK other = (RassePK) object;
        if (this.rasseId != other.rasseId) {
            return false;
        }
        if (this.speziesId != other.speziesId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.RassePK[ rasseId=" + rasseId + ", speziesId=" + speziesId + " ]";
    }
    
}
