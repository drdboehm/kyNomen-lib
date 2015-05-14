/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "milestone", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Milestone.findAll", query = "SELECT m FROM Milestone m"),
    @NamedQuery(name = "Milestone.findByMilestoneId", query = "SELECT m FROM Milestone m WHERE m.milestoneId = :milestoneId"),
    @NamedQuery(name = "Milestone.findByMilestoneName", query = "SELECT m FROM Milestone m WHERE m.milestoneName = :milestoneName"),
    @NamedQuery(name = "Milestone.findByMilestoneAlltime", query = "SELECT m FROM Milestone m WHERE m.milestoneAlltime = :milestoneAlltime"),
    @NamedQuery(name = "Milestone.findByMilestoneHandsontime", query = "SELECT m FROM Milestone m WHERE m.milestoneHandsontime = :milestoneHandsontime"),
    @NamedQuery(name = "Milestone.findByMilestoneMannumber", query = "SELECT m FROM Milestone m WHERE m.milestoneMannumber = :milestoneMannumber"),
    @NamedQuery(name = "Milestone.findByMilestoneManhour", query = "SELECT m FROM Milestone m WHERE m.milestoneManhour = :milestoneManhour"),
    @NamedQuery(name = "Milestone.findByMilestonecost", query = "SELECT m FROM Milestone m WHERE m.milestonecost = :milestonecost")})
public class Milestone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "milestone_id", nullable = false)
    private Integer milestoneId;
    @Size(max = 45)
    @Column(name = "milestone_name", length = 45)
    private String milestoneName;
    @Column(name = "milestone_alltime")
    @Temporal(TemporalType.TIME)
    private Date milestoneAlltime;
    @Column(name = "milestone_handsontime")
    @Temporal(TemporalType.TIME)
    private Date milestoneHandsontime;
    @Column(name = "milestone_mannumber")
    private Short milestoneMannumber;
    @Column(name = "milestone_manhour")
    @Temporal(TemporalType.TIME)
    private Date milestoneManhour;
    @Size(max = 45)
    @Column(name = "milestonecost", length = 45)
    private String milestonecost;
    @JoinColumn(name = "milestonetyp_id", referencedColumnName = "milestonetyp_id", nullable = false)
    @ManyToOne(optional = false)
    private Milestonetyp milestonetypId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "milestone")
    private Collection<UntersuchungstypMilestone> untersuchungstypMilestoneCollection;

    public Milestone() {
    }

    public Milestone(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }

    public Integer getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }

    public String getMilestoneName() {
        return milestoneName;
    }

    public void setMilestoneName(String milestoneName) {
        this.milestoneName = milestoneName;
    }

    public Date getMilestoneAlltime() {
        return milestoneAlltime;
    }

    public void setMilestoneAlltime(Date milestoneAlltime) {
        this.milestoneAlltime = milestoneAlltime;
    }

    public Date getMilestoneHandsontime() {
        return milestoneHandsontime;
    }

    public void setMilestoneHandsontime(Date milestoneHandsontime) {
        this.milestoneHandsontime = milestoneHandsontime;
    }

    public Short getMilestoneMannumber() {
        return milestoneMannumber;
    }

    public void setMilestoneMannumber(Short milestoneMannumber) {
        this.milestoneMannumber = milestoneMannumber;
    }

    public Date getMilestoneManhour() {
        return milestoneManhour;
    }

    public void setMilestoneManhour(Date milestoneManhour) {
        this.milestoneManhour = milestoneManhour;
    }

    public String getMilestonecost() {
        return milestonecost;
    }

    public void setMilestonecost(String milestonecost) {
        this.milestonecost = milestonecost;
    }

    public Milestonetyp getMilestonetypId() {
        return milestonetypId;
    }

    public void setMilestonetypId(Milestonetyp milestonetypId) {
        this.milestonetypId = milestonetypId;
    }

    @XmlTransient
    public Collection<UntersuchungstypMilestone> getUntersuchungstypMilestoneCollection() {
        return untersuchungstypMilestoneCollection;
    }

    public void setUntersuchungstypMilestoneCollection(Collection<UntersuchungstypMilestone> untersuchungstypMilestoneCollection) {
        this.untersuchungstypMilestoneCollection = untersuchungstypMilestoneCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (milestoneId != null ? milestoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Milestone)) {
            return false;
        }
        Milestone other = (Milestone) object;
        if ((this.milestoneId == null && other.milestoneId != null) || (this.milestoneId != null && !this.milestoneId.equals(other.milestoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.Milestone[ milestoneId=" + milestoneId + " ]";
    }
    
}
