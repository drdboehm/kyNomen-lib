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
@Table(name = "auftragtyp", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auftragtyp.findAll", query = "SELECT a FROM Auftragtyp a"),
    @NamedQuery(name = "Auftragtyp.findByAuftragtypId", query = "SELECT a FROM Auftragtyp a WHERE a.auftragtypId = :auftragtypId"),
    @NamedQuery(name = "Auftragtyp.findByAuftragtypName", query = "SELECT a FROM Auftragtyp a WHERE a.auftragtypName = :auftragtypName")})
public class Auftragtyp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auftragtyp_id", nullable = false)
    private Integer auftragtypId;
    @Size(max = 200)
    @Column(name = "auftragtyp_name", length = 200)
    private String auftragtypName;
    @OneToMany(mappedBy = "auftragstypId")
    private Collection<Auftrag> auftragCollection;

    public Auftragtyp() {
    }

    public Auftragtyp(Integer auftragtypId) {
        this.auftragtypId = auftragtypId;
    }

    public Integer getAuftragtypId() {
        return auftragtypId;
    }

    public void setAuftragtypId(Integer auftragtypId) {
        this.auftragtypId = auftragtypId;
    }

    public String getAuftragtypName() {
        return auftragtypName;
    }

    public void setAuftragtypName(String auftragtypName) {
        this.auftragtypName = auftragtypName;
    }

    @XmlTransient
    public Collection<Auftrag> getAuftragCollection() {
        return auftragCollection;
    }

    public void setAuftragCollection(Collection<Auftrag> auftragCollection) {
        this.auftragCollection = auftragCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auftragtypId != null ? auftragtypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auftragtyp)) {
            return false;
        }
        Auftragtyp other = (Auftragtyp) object;
        if ((this.auftragtypId == null && other.auftragtypId != null) || (this.auftragtypId != null && !this.auftragtypId.equals(other.auftragtypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auftragtyp{" + "auftragtypId=" + auftragtypId + ", auftragtypName=" + auftragtypName + ", auftragCollection=" + auftragCollection + '}';
    }

    
    
}
