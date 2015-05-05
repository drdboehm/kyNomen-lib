/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author teilnehmer
 */
@Entity
@Table(name = "untersuchungstyp_milestone", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UntersuchungstypMilestone.findAll", query = "SELECT u FROM UntersuchungstypMilestone u"),
    @NamedQuery(name = "UntersuchungstypMilestone.findByUntersuchungtypId", query = "SELECT u FROM UntersuchungstypMilestone u WHERE u.untersuchungstypMilestonePK.untersuchungtypId = :untersuchungtypId"),
    @NamedQuery(name = "UntersuchungstypMilestone.findByMilestoneId", query = "SELECT u FROM UntersuchungstypMilestone u WHERE u.untersuchungstypMilestonePK.milestoneId = :milestoneId"),
    @NamedQuery(name = "UntersuchungstypMilestone.findByMilestoneorderpos", query = "SELECT u FROM UntersuchungstypMilestone u WHERE u.milestoneorderpos = :milestoneorderpos")})
public class UntersuchungstypMilestone implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UntersuchungstypMilestonePK untersuchungstypMilestonePK;
    @Column(name = "milestoneorderpos")
    private Integer milestoneorderpos;
    @JoinColumn(name = "untersuchungtyp_id", referencedColumnName = "untersuchungtyp_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Untersuchungstyp untersuchungstyp;
    @JoinColumn(name = "milestone_id", referencedColumnName = "milestone_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Milestone milestone;

    public UntersuchungstypMilestone() {
    }

    public UntersuchungstypMilestone(UntersuchungstypMilestonePK untersuchungstypMilestonePK) {
        this.untersuchungstypMilestonePK = untersuchungstypMilestonePK;
    }

    public UntersuchungstypMilestone(int untersuchungtypId, int milestoneId) {
        this.untersuchungstypMilestonePK = new UntersuchungstypMilestonePK(untersuchungtypId, milestoneId);
    }

    public UntersuchungstypMilestonePK getUntersuchungstypMilestonePK() {
        return untersuchungstypMilestonePK;
    }

    public void setUntersuchungstypMilestonePK(UntersuchungstypMilestonePK untersuchungstypMilestonePK) {
        this.untersuchungstypMilestonePK = untersuchungstypMilestonePK;
    }

    public Integer getMilestoneorderpos() {
        return milestoneorderpos;
    }

    public void setMilestoneorderpos(Integer milestoneorderpos) {
        this.milestoneorderpos = milestoneorderpos;
    }

    public Untersuchungstyp getUntersuchungstyp() {
        return untersuchungstyp;
    }

    public void setUntersuchungstyp(Untersuchungstyp untersuchungstyp) {
        this.untersuchungstyp = untersuchungstyp;
    }

    public Milestone getMilestone() {
        return milestone;
    }

    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (untersuchungstypMilestonePK != null ? untersuchungstypMilestonePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UntersuchungstypMilestone)) {
            return false;
        }
        UntersuchungstypMilestone other = (UntersuchungstypMilestone) object;
        if ((this.untersuchungstypMilestonePK == null && other.untersuchungstypMilestonePK != null) || (this.untersuchungstypMilestonePK != null && !this.untersuchungstypMilestonePK.equals(other.untersuchungstypMilestonePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.UntersuchungstypMilestone[ untersuchungstypMilestonePK=" + untersuchungstypMilestonePK + " ]";
    }
    
}
