/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "auftragposition", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auftragposition.findAll", query = "SELECT a FROM Auftragposition a"),
    @NamedQuery(name = "Auftragposition.findByAuftragpositionId", query = "SELECT a FROM Auftragposition a WHERE a.auftragpositionId = :auftragpositionId"),
    @NamedQuery(name = "Auftragposition.findByAuftragpositionNr", query = "SELECT a FROM Auftragposition a WHERE a.auftragpositionNr = :auftragpositionNr")})
public class Auftragposition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auftragposition_id", nullable = false)
    private Integer auftragpositionId;
    @Column(name = "auftragposition_nr")
    private Integer auftragpositionNr;
    @JoinColumn(name = "patient_id", referencedColumnName = "patient_id")
    @ManyToOne
    private Patient patientId;
    @JoinColumn(name = "auftrag_id", referencedColumnName = "auftrag_id")
    @ManyToOne
    private Auftrag auftragId;
    @JoinColumn(name = "untersuchung_id", referencedColumnName = "untersuchung_id", nullable = false)
    @ManyToOne(optional = false)
    private Untersuchung untersuchungId;

    public Auftragposition() {
    }

    public Auftragposition(Integer auftragpositionId) {
        this.auftragpositionId = auftragpositionId;
    }

    public Integer getAuftragpositionId() {
        return auftragpositionId;
    }

    public void setAuftragpositionId(Integer auftragpositionId) {
        this.auftragpositionId = auftragpositionId;
    }

    public Integer getAuftragpositionNr() {
        return auftragpositionNr;
    }

    public void setAuftragpositionNr(Integer auftragpositionNr) {
        this.auftragpositionNr = auftragpositionNr;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    public Auftrag getAuftragId() {
        return auftragId;
    }

    public void setAuftragId(Auftrag auftragId) {
        this.auftragId = auftragId;
    }

    public Untersuchung getUntersuchungId() {
        return untersuchungId;
    }

    public void setUntersuchungId(Untersuchung untersuchungId) {
        this.untersuchungId = untersuchungId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auftragpositionId != null ? auftragpositionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auftragposition)) {
            return false;
        }
        Auftragposition other = (Auftragposition) object;
        if ((this.auftragpositionId == null && other.auftragpositionId != null) || (this.auftragpositionId != null && !this.auftragpositionId.equals(other.auftragpositionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kynomics.daten.Auftragposition[ auftragpositionId=" + auftragpositionId + " ]";
    }
    
}
