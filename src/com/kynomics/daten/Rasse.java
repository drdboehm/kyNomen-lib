/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
 * @author teilnehmer
 */
@Entity
@Table(name = "rasse", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rasse.findAll", query = "SELECT r FROM Rasse r"),
    @NamedQuery(name = "Rasse.findByRasseId", query = "SELECT r FROM Rasse r WHERE r.rassePK.rasseId = :rasseId"),
    @NamedQuery(name = "Rasse.findByRasseName", query = "SELECT r FROM Rasse r WHERE r.rasseName = :rasseName"),
    @NamedQuery(name = "Rasse.findBySpeziesId", query = "SELECT r FROM Rasse r WHERE r.rassePK.speziesId = :speziesId")})
public class Rasse implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RassePK rassePK;
    @Size(max = 45)
    @Column(name = "rasse_name", length = 45)
    private String rasseName;
    @JoinColumn(name = "spezies_id", referencedColumnName = "spezies_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Spezies spezies;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rasse")
    private Collection<Patient> patientCollection;

    public Rasse() {
    }

    public Rasse(RassePK rassePK) {
        this.rassePK = rassePK;
    }

    public Rasse(int rasseId, int speziesId) {
        this.rassePK = new RassePK(rasseId, speziesId);
    }

    public RassePK getRassePK() {
        return rassePK;
    }

    public void setRassePK(RassePK rassePK) {
        this.rassePK = rassePK;
    }

    public String getRasseName() {
        return rasseName;
    }

    public void setRasseName(String rasseName) {
        this.rasseName = rasseName;
    }

    public Spezies getSpezies() {
        return spezies;
    }

    public void setSpezies(Spezies spezies) {
        this.spezies = spezies;
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
        hash += (rassePK != null ? rassePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rasse)) {
            return false;
        }
        Rasse other = (Rasse) object;
        if ((this.rassePK == null && other.rassePK != null) || (this.rassePK != null && !this.rassePK.equals(other.rassePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.Rasse[ rassePK=" + rassePK + " ]";
    }
    
}
