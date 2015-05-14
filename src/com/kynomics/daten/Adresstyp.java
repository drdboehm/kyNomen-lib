/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
 * @author dboehm
 */
@Entity
@Table(name = "adresstyp", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adresstyp.findAll", query = "SELECT a FROM Adresstyp a"),
    @NamedQuery(name = "Adresstyp.findByAdresstypId", query = "SELECT a FROM Adresstyp a WHERE a.adresstypId = :adresstypId"),
    @NamedQuery(name = "Adresstyp.findByAdresstypName", query = "SELECT a FROM Adresstyp a WHERE a.adresstypName = :adresstypName")})
public class Adresstyp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "adresstyp_id", nullable = false)
    private Integer adresstypId;
    @Size(max = 100)
    @Column(name = "adresstyp_name", length = 100)
    private String adresstypName;
    @OneToMany(mappedBy = "adresstypId")
    private Collection<Halteradresse> halteradresseCollection;

    public Adresstyp() {
    }

    public Adresstyp(Integer adresstypId) {
        this.adresstypId = adresstypId;
    }

    public Integer getAdresstypId() {
        return adresstypId;
    }

    public void setAdresstypId(Integer adresstypId) {
        this.adresstypId = adresstypId;
    }

    public String getAdresstypName() {
        return adresstypName;
    }

    public void setAdresstypName(String adresstypName) {
        this.adresstypName = adresstypName;
    }

    @XmlTransient
    public Collection<Halteradresse> getHalteradresseCollection() {
        return halteradresseCollection;
    }

    public void setHalteradresseCollection(Collection<Halteradresse> halteradresseCollection) {
        this.halteradresseCollection = halteradresseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adresstypId != null ? adresstypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adresstyp)) {
            return false;
        }
        Adresstyp other = (Adresstyp) object;
        if ((this.adresstypId == null && other.adresstypId != null) || (this.adresstypId != null && !this.adresstypId.equals(other.adresstypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.Adresstyp[ adresstypId=" + adresstypId + " ]";
    }
    
}
