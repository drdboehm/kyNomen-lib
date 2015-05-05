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
import javax.persistence.Column;
import javax.persistence.Entity;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author teilnehmer
 */
@Entity
@Table(name = "auftrag", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auftrag.findAll", query = "SELECT a FROM Auftrag a"),
    @NamedQuery(name = "Auftrag.findByAuftragId", query = "SELECT a FROM Auftrag a WHERE a.auftragId = :auftragId"),
    @NamedQuery(name = "Auftrag.findByAuftragStart", query = "SELECT a FROM Auftrag a WHERE a.auftragStart = :auftragStart"),
    @NamedQuery(name = "Auftrag.findByAuftragEnde", query = "SELECT a FROM Auftrag a WHERE a.auftragEnde = :auftragEnde")})
public class Auftrag implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auftrag_id", nullable = false)
    private Integer auftragId;
    @Column(name = "auftrag_start")
    @Temporal(TemporalType.DATE)
    private Date auftragStart;
    @Column(name = "auftrag_ende")
    @Temporal(TemporalType.DATE)
    private Date auftragEnde;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "auftrag_text", length = 2147483647)
    private String auftragText;
    @JoinColumn(name = "halter_id", referencedColumnName = "halter_id")
    @ManyToOne
    private Halter halterId;
    @JoinColumn(name = "auftragstyp_id", referencedColumnName = "auftragtyp_id")
    @ManyToOne
    private Auftragtyp auftragstypId;
    @OneToMany(mappedBy = "auftragId")
    private Collection<Auftragposition> auftragpositionCollection;

    public Auftrag() {
    }

    public Auftrag(Integer auftragId) {
        this.auftragId = auftragId;
    }

    public Integer getAuftragId() {
        return auftragId;
    }

    public void setAuftragId(Integer auftragId) {
        this.auftragId = auftragId;
    }

    public Date getAuftragStart() {
        return auftragStart;
    }

    public void setAuftragStart(Date auftragStart) {
        this.auftragStart = auftragStart;
    }

    public Date getAuftragEnde() {
        return auftragEnde;
    }

    public void setAuftragEnde(Date auftragEnde) {
        this.auftragEnde = auftragEnde;
    }

    public String getAuftragText() {
        return auftragText;
    }

    public void setAuftragText(String auftragText) {
        this.auftragText = auftragText;
    }

    public Halter getHalterId() {
        return halterId;
    }

    public void setHalterId(Halter halterId) {
        this.halterId = halterId;
    }

    public Auftragtyp getAuftragstypId() {
        return auftragstypId;
    }

    public void setAuftragstypId(Auftragtyp auftragstypId) {
        this.auftragstypId = auftragstypId;
    }

    @XmlTransient
    public Collection<Auftragposition> getAuftragpositionCollection() {
        return auftragpositionCollection;
    }

    public void setAuftragpositionCollection(Collection<Auftragposition> auftragpositionCollection) {
        this.auftragpositionCollection = auftragpositionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auftragId != null ? auftragId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auftrag)) {
            return false;
        }
        Auftrag other = (Auftrag) object;
        if ((this.auftragId == null && other.auftragId != null) || (this.auftragId != null && !this.auftragId.equals(other.auftragId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.Auftrag[ auftragId=" + auftragId + " ]";
    }
    
}
