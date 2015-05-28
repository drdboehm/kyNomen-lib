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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "untersuchungstyp", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Untersuchungstyp.findAll", query = "SELECT u FROM Untersuchungstyp u"),
    @NamedQuery(name = "Untersuchungstyp.findByUntersuchungtypId", query = "SELECT u FROM Untersuchungstyp u WHERE u.untersuchungtypId = :untersuchungtypId"),
    @NamedQuery(name = "Untersuchungstyp.findByUntersuchungtypName", query = "SELECT u FROM Untersuchungstyp u WHERE u.untersuchungtypName = :untersuchungtypName"),
    @NamedQuery(name = "Untersuchungstyp.findByUntersuchungtypGen", query = "SELECT u FROM Untersuchungstyp u WHERE u.untersuchungtypGen = :untersuchungtypGen"),
    @NamedQuery(name = "Untersuchungstyp.findByUntersuchungtypMut", query = "SELECT u FROM Untersuchungstyp u WHERE u.untersuchungtypMut = :untersuchungtypMut")})
public class Untersuchungstyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "untersuchungtyp_id", nullable = false)
    private Integer untersuchungtypId;
    @Size(max = 45)
    @Column(name = "untersuchungtyp_name", length = 45)
    private String untersuchungtypName;
    @Size(max = 45)
    @Column(name = "untersuchungtyp_gen", length = 45)
    private String untersuchungtypGen;
    @Size(max = 45)
    @Column(name = "untersuchungtyp_mut", length = 45)
    private String untersuchungtypMut;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "untersuchungstypUntersuchungtypId")
    private Collection<Untersuchung> untersuchungCollection;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "untersuchungstyp")
    private Collection<UntersuchungstypMilestone> untersuchungstypMilestoneCollection;

    /**
     * this is a transient boolean flag indicating whether the object was edited
     * and should be again persisted
     */
    @Transient
    public boolean edited;

    public Untersuchungstyp() {
    }

    public Untersuchungstyp(Integer untersuchungtypId) {
        this.untersuchungtypId = untersuchungtypId;
    }

    public Integer getUntersuchungtypId() {
        return untersuchungtypId;
    }

    public void setUntersuchungtypId(Integer untersuchungtypId) {
        this.untersuchungtypId = untersuchungtypId;
    }

    public String getUntersuchungtypName() {
        return untersuchungtypName;
    }

    public void setUntersuchungtypName(String untersuchungtypName) {
        this.untersuchungtypName = untersuchungtypName;
    }

    public String getUntersuchungtypGen() {
        return untersuchungtypGen;
    }

    public void setUntersuchungtypGen(String untersuchungtypGen) {
        this.untersuchungtypGen = untersuchungtypGen;
    }

    public String getUntersuchungtypMut() {
        return untersuchungtypMut;
    }

    public void setUntersuchungtypMut(String untersuchungtypMut) {
        this.untersuchungtypMut = untersuchungtypMut;
    }

    @XmlTransient
    public Collection<Untersuchung> getUntersuchungCollection() {
        return untersuchungCollection;
    }

    public void setUntersuchungCollection(Collection<Untersuchung> untersuchungCollection) {
        this.untersuchungCollection = untersuchungCollection;
    }

    @XmlTransient
    public Collection<UntersuchungstypMilestone> getUntersuchungstypMilestoneCollection() {
        return untersuchungstypMilestoneCollection;
    }

    public void setUntersuchungstypMilestoneCollection(Collection<UntersuchungstypMilestone> untersuchungstypMilestoneCollection) {
        this.untersuchungstypMilestoneCollection = untersuchungstypMilestoneCollection;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (untersuchungtypId != null ? untersuchungtypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Untersuchungstyp)) {
            return false;
        }
        Untersuchungstyp other = (Untersuchungstyp) object;
        if ((this.untersuchungtypId == null && other.untersuchungtypId != null) || (this.untersuchungtypId != null && !this.untersuchungtypId.equals(other.untersuchungtypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Untersuchungstyp{" + "untersuchungtypId=" + untersuchungtypId + ", untersuchungtypName=" + untersuchungtypName + ", untersuchungtypGen=" + untersuchungtypGen + ", untersuchungtypMut=" + untersuchungtypMut + ", untersuchungCollection=" + untersuchungCollection + ", untersuchungstypMilestoneCollection=" + untersuchungstypMilestoneCollection + '}';
    }

}
