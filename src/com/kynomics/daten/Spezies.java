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
 * @author dboehm
 */
@Entity
@Table(name = "spezies", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Spezies.findAll", query = "SELECT s FROM Spezies s"),
    @NamedQuery(name = "Spezies.findBySpeziesId", query = "SELECT s FROM Spezies s WHERE s.speziesId = :speziesId"),
    @NamedQuery(name = "Spezies.findBySpeziesName", query = "SELECT s FROM Spezies s WHERE s.speziesName = :speziesName")})
public class Spezies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "spezies_id", nullable = false)
    private Integer speziesId;
    @Size(max = 45)
    @Column(name = "spezies_name", length = 45)
    private String speziesName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "speziesSpeziesId")
    private Collection<Rasse> rasseCollection;

    public Spezies() {
    }

    public Spezies(Integer speziesId) {
        this.speziesId = speziesId;
    }

    public Integer getSpeziesId() {
        return speziesId;
    }

    public void setSpeziesId(Integer speziesId) {
        this.speziesId = speziesId;
    }

    public String getSpeziesName() {
        return speziesName;
    }

    public void setSpeziesName(String speziesName) {
        this.speziesName = speziesName;
    }

    @XmlTransient
    public Collection<Rasse> getRasseCollection() {
        return rasseCollection;
    }

    public void setRasseCollection(Collection<Rasse> rasseCollection) {
        this.rasseCollection = rasseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (speziesId != null ? speziesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spezies)) {
            return false;
        }
        Spezies other = (Spezies) object;
        if ((this.speziesId == null && other.speziesId != null) || (this.speziesId != null && !this.speziesId.equals(other.speziesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.Spezies[ speziesId=" + speziesId + " ]";
    }
    
}
