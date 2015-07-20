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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "halter", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Halter.findAll", query = "SELECT h FROM Halter h"),
    @NamedQuery(name = "Halter.findByHalterId", query = "SELECT h FROM Halter h WHERE h.halterId = :halterId"),
    @NamedQuery(name = "Halter.findByHalterName", query = "SELECT h FROM Halter h WHERE h.halterName = :halterName")})
public class Halter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "halter_id", nullable = false)
    private Integer halterId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 100)
    @Column(name = "halter_name", nullable = false, length = 100)
    private String halterName;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "halter_bemerkung", length = 2147483647)
    private String halterBemerkung;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "halterId")
    private Collection<Auftrag> auftragCollection;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "halterId")
    private Collection<Halteradresse> halteradresseCollection;
    
    @JoinColumn(name = "haltertyp_id", referencedColumnName = "haltertyp_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = false)
    private Haltertyp haltertypId;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "halterHalterId")
    private Collection<Patient> patientCollection;

    /**
     * this is a transient boolean flag indicating whether the object was edited and should be again persisted
     */
    @Transient
    private boolean edited;
    
    @Transient
    private boolean selected;

    public Halter() {
    }

    public Halter(Integer halterId) {
        this.halterId = halterId;
    }

    public Halter(Integer halterId, String halterName) {
        this.halterId = halterId;
        this.halterName = halterName;
    }

    public Integer getHalterId() {
        return halterId;
    }

    public void setHalterId(Integer halterId) {
        this.halterId = halterId;
    }

    public String getHalterName() {
        return halterName;
    }

    public void setHalterName(String halterName) {
        this.halterName = halterName;
    }

    public String getHalterBemerkung() {
        return halterBemerkung;
    }

    public void setHalterBemerkung(String halterBemerkung) {
        this.halterBemerkung = halterBemerkung;
    }

//    @XmlTransient
    public Collection<Auftrag> getAuftragCollection() {
        return auftragCollection;
    }

    public void setAuftragCollection(Collection<Auftrag> auftragCollection) {
        this.auftragCollection = auftragCollection;
    }

//    @XmlTransient
    public Collection<Halteradresse> getHalteradresseCollection() {
        return halteradresseCollection;
    }

    public void setHalteradresseCollection(Collection<Halteradresse> halteradresseCollection) {
        this.halteradresseCollection = halteradresseCollection;
    }

    public Haltertyp getHaltertypId() {
        return haltertypId;
    }

    public void setHaltertypId(Haltertyp haltertypId) {
        this.haltertypId = haltertypId;
    }

//    @XmlTransient
    public Collection<Patient> getPatientCollection() {
        return patientCollection;
    }

    public void setPatientCollection(Collection<Patient> patientCollection) {
        this.patientCollection = patientCollection;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (halterId != null ? halterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Halter)) {
            return false;
        }
        Halter other = (Halter) object;
        if ((this.halterId == null && other.halterId != null) || (this.halterId != null && !this.halterId.equals(other.halterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Halter{" + "halterId=" + halterId + ", halterName=" + halterName + ", halterBemerkung=" + halterBemerkung + ", haltertypId=" + haltertypId + ", edited=" + edited + ", selected=" + selected + '}';
    }

   

   
}
