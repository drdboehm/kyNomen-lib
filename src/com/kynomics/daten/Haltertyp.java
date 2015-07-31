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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "haltertyp", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Haltertyp.findAll", query = "SELECT h FROM Haltertyp h"),
    @NamedQuery(name = "Haltertyp.findByHaltertypId", query = "SELECT h FROM Haltertyp h WHERE h.haltertypId = :haltertypId"),
    @NamedQuery(name = "Haltertyp.findByHaltertypName", query = "SELECT h FROM Haltertyp h WHERE h.haltertypName = :haltertypName")})
public class Haltertyp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "haltertyp_id", nullable = false)
    private Integer haltertypId;
    @Size(max = 100)
    @Column(name = "haltertyp_name", length = 100)
    private String haltertypName;
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "haltertypId")
    private Collection<Halter> halterCollection;

    public Haltertyp() {
    }

    public Haltertyp(Integer haltertypId) {
        this.haltertypId = haltertypId;
    }

    public Integer getHaltertypId() {
        return haltertypId;
    }

    public void setHaltertypId(Integer haltertypId) {
        this.haltertypId = haltertypId;
    }

    public String getHaltertypName() {
        return haltertypName;
    }

    public void setHaltertypName(String haltertypName) {
        this.haltertypName = haltertypName;
    }

    @XmlTransient
    public Collection<Halter> getHalterCollection() {
        return halterCollection;
    }

    public void setHalterCollection(Collection<Halter> halterCollection) {
        this.halterCollection = halterCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (haltertypId != null ? haltertypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Haltertyp)) {
            return false;
        }
        Haltertyp other = (Haltertyp) object;
        if ((this.haltertypId == null && other.haltertypId != null) || (this.haltertypId != null && !this.haltertypId.equals(other.haltertypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Haltertyp{" + "haltertypId=" + haltertypId + ", haltertypName=" + haltertypName + '}';
    }

   

    
    
}
