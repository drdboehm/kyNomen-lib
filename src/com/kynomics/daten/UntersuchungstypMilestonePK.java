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
public class UntersuchungstypMilestonePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "untersuchungtyp_id", nullable = false)
    private int untersuchungtypId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "milestone_id", nullable = false)
    private int milestoneId;

    public UntersuchungstypMilestonePK() {
    }

    public UntersuchungstypMilestonePK(int untersuchungtypId, int milestoneId) {
        this.untersuchungtypId = untersuchungtypId;
        this.milestoneId = milestoneId;
    }

    public int getUntersuchungtypId() {
        return untersuchungtypId;
    }

    public void setUntersuchungtypId(int untersuchungtypId) {
        this.untersuchungtypId = untersuchungtypId;
    }

    public int getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(int milestoneId) {
        this.milestoneId = milestoneId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) untersuchungtypId;
        hash += (int) milestoneId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UntersuchungstypMilestonePK)) {
            return false;
        }
        UntersuchungstypMilestonePK other = (UntersuchungstypMilestonePK) object;
        if (this.untersuchungtypId != other.untersuchungtypId) {
            return false;
        }
        if (this.milestoneId != other.milestoneId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.UntersuchungstypMilestonePK[ untersuchungtypId=" + untersuchungtypId + ", milestoneId=" + milestoneId + " ]";
    }
    
}
