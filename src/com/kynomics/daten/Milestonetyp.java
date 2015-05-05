/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author teilnehmer
 */
@Entity
@Table(name = "milestonetyp", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Milestonetyp.findAll", query = "SELECT m FROM Milestonetyp m"),
    @NamedQuery(name = "Milestonetyp.findByMilestonetypId", query = "SELECT m FROM Milestonetyp m WHERE m.milestonetypId = :milestonetypId"),
    @NamedQuery(name = "Milestonetyp.findByMilestonetypName", query = "SELECT m FROM Milestonetyp m WHERE m.milestonetypName = :milestonetypName")})
public class Milestonetyp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "milestonetyp_id", nullable = false)
    private Integer milestonetypId;
    @Size(max = 45)
    @Column(name = "milestonetyp_name", length = 45)
    private String milestonetypName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "milestonetypId")
    private Collection<Milestone> milestoneCollection;

    public Milestonetyp() {
    }

    public Milestonetyp(Integer milestonetypId) {
        this.milestonetypId = milestonetypId;
    }

    public Integer getMilestonetypId() {
        return milestonetypId;
    }

    public void setMilestonetypId(Integer milestonetypId) {
        this.milestonetypId = milestonetypId;
    }

    public String getMilestonetypName() {
        return milestonetypName;
    }

    public void setMilestonetypName(String milestonetypName) {
        this.milestonetypName = milestonetypName;
    }

    @XmlTransient
    public Collection<Milestone> getMilestoneCollection() {
        return milestoneCollection;
    }

    public void setMilestoneCollection(Collection<Milestone> milestoneCollection) {
        this.milestoneCollection = milestoneCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (milestonetypId != null ? milestonetypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Milestonetyp)) {
            return false;
        }
        Milestonetyp other = (Milestonetyp) object;
        if ((this.milestonetypId == null && other.milestonetypId != null) || (this.milestonetypId != null && !this.milestonetypId.equals(other.milestonetypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.Milestonetyp[ milestonetypId=" + milestonetypId + " ]";
    }
    
}
