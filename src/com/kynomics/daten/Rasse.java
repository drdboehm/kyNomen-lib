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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "rasse", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rasse.findAll", query = "SELECT r FROM Rasse r"),
    @NamedQuery(name = "Rasse.findByRasseId", query = "SELECT r FROM Rasse r WHERE r.rasseId = :rasseId"),
    @NamedQuery(name = "Rasse.findByRasseName", query = "SELECT r FROM Rasse r WHERE r.rasseName = :rasseName")})
public class Rasse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rasse_id", nullable = false)
    private Integer rasseId;
    @Size(max = 45)
    @Column(name = "rasse_name", length = 45)
    private String rasseName;
    @JoinColumn(name = "spezies_spezies_id", referencedColumnName = "spezies_id", nullable = false)
    @ManyToOne(optional = false)
    private Spezies speziesSpeziesId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rasseRasseId")
    private Collection<Patient> patientCollection;

    public Rasse() {
    }

    public Rasse(Integer rasseId) {
        this.rasseId = rasseId;
    }

    public Integer getRasseId() {
        return rasseId;
    }

    public void setRasseId(Integer rasseId) {
        this.rasseId = rasseId;
    }

    public String getRasseName() {
        return rasseName;
    }

    public void setRasseName(String rasseName) {
        this.rasseName = rasseName;
    }

    public Spezies getSpeziesSpeziesId() {
        return speziesSpeziesId;
    }

    public void setSpeziesSpeziesId(Spezies speziesSpeziesId) {
        this.speziesSpeziesId = speziesSpeziesId;
    }

    @XmlTransient
    public Collection<Patient> getPatientCollection() {
        return patientCollection;
    }

    public void setPatientCollection(Collection<Patient> patientCollection) {
        this.patientCollection = patientCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rasseId != null ? rasseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rasse)) {
            return false;
        }
        Rasse other = (Rasse) object;
        if ((this.rasseId == null && other.rasseId != null) || (this.rasseId != null && !this.rasseId.equals(other.rasseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.Rasse[ rasseId=" + rasseId + " ]";
    }
    
}
