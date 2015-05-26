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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "ergebnistyp", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ergebnistyp.findAll", query = "SELECT e FROM Ergebnistyp e"),
    @NamedQuery(name = "Ergebnistyp.findByErgebnistypId", query = "SELECT e FROM Ergebnistyp e WHERE e.ergebnistypId = :ergebnistypId"),
    @NamedQuery(name = "Ergebnistyp.findByErgebnistypName", query = "SELECT e FROM Ergebnistyp e WHERE e.ergebnistypName = :ergebnistypName")})
public class Ergebnistyp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ergebnistyp_id", nullable = false)
    private Integer ergebnistypId;
    @Column(name = "ergebnistyp_name")
    @Temporal(TemporalType.DATE)
    private Date ergebnistypName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ergebnistypId")
    private Collection<Ergebnis> ergebnisCollection;

    public Ergebnistyp() {
    }

    public Ergebnistyp(Integer ergebnistypId) {
        this.ergebnistypId = ergebnistypId;
    }

    public Integer getErgebnistypId() {
        return ergebnistypId;
    }

    public void setErgebnistypId(Integer ergebnistypId) {
        this.ergebnistypId = ergebnistypId;
    }

    public Date getErgebnistypName() {
        return ergebnistypName;
    }

    public void setErgebnistypName(Date ergebnistypName) {
        this.ergebnistypName = ergebnistypName;
    }

    @XmlTransient
    public Collection<Ergebnis> getErgebnisCollection() {
        return ergebnisCollection;
    }

    public void setErgebnisCollection(Collection<Ergebnis> ergebnisCollection) {
        this.ergebnisCollection = ergebnisCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ergebnistypId != null ? ergebnistypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ergebnistyp)) {
            return false;
        }
        Ergebnistyp other = (Ergebnistyp) object;
        if ((this.ergebnistypId == null && other.ergebnistypId != null) || (this.ergebnistypId != null && !this.ergebnistypId.equals(other.ergebnistypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ergebnistyp{" + "ergebnistypId=" + ergebnistypId + ", ergebnistypName=" + ergebnistypName + ", ergebnisCollection=" + ergebnisCollection + '}';
    }

    
    
}
