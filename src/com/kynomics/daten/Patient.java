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
import javax.persistence.JoinColumns;
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
@Table(name = "patient", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p"),
    @NamedQuery(name = "Patient.findByPatientId", query = "SELECT p FROM Patient p WHERE p.patientId = :patientId"),
    @NamedQuery(name = "Patient.findByPatientName", query = "SELECT p FROM Patient p WHERE p.patientName = :patientName"),
    @NamedQuery(name = "Patient.findByPatientRuf", query = "SELECT p FROM Patient p WHERE p.patientRuf = :patientRuf"),
    @NamedQuery(name = "Patient.findByPatientChip", query = "SELECT p FROM Patient p WHERE p.patientChip = :patientChip"),
    @NamedQuery(name = "Patient.findByPatientGeb", query = "SELECT p FROM Patient p WHERE p.patientGeb = :patientGeb"),
    @NamedQuery(name = "Patient.findByPatientZuchtbuchnr", query = "SELECT p FROM Patient p WHERE p.patientZuchtbuchnr = :patientZuchtbuchnr"),
    @NamedQuery(name = "Patient.findByPatientTatoonr", query = "SELECT p FROM Patient p WHERE p.patientTatoonr = :patientTatoonr"),
    @NamedQuery(name = "Patient.findByHalterId", query = "SELECT p FROM Patient p WHERE p.halterId = :halterId")})
public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "patient_id", nullable = false)
    private Integer patientId;
    @Size(max = 100)
    @Column(name = "patient_name", length = 100)
    private String patientName;
    @Size(max = 100)
    @Column(name = "patient_ruf", length = 100)
    private String patientRuf;
    @Size(max = 100)
    @Column(name = "patient_chip", length = 100)
    private String patientChip;
    @Column(name = "patient_geb")
    @Temporal(TemporalType.DATE)
    private Date patientGeb;
    @Size(max = 100)
    @Column(name = "patient_zuchtbuchnr", length = 100)
    private String patientZuchtbuchnr;
    @Size(max = 100)
    @Column(name = "patient_tatoonr", length = 100)
    private String patientTatoonr;
    @Column(name = "halter_id")
    private Integer halterId;
    @JoinColumn(name = "halter_halter_id", referencedColumnName = "halter_id", nullable = false)
    @ManyToOne(optional = false)
    private Halter halterHalterId;
    @JoinColumns({
        @JoinColumn(name = "rasse_rasse_id", referencedColumnName = "rasse_id", nullable = false),
        @JoinColumn(name = "rasse_spezies_id", referencedColumnName = "spezies_id", nullable = false)})
    @ManyToOne(optional = false)
    private Rasse rasse;
    @OneToMany(mappedBy = "patientId")
    private Collection<Auftragposition> auftragpositionCollection;

    public Patient() {
    }

    public Patient(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientRuf() {
        return patientRuf;
    }

    public void setPatientRuf(String patientRuf) {
        this.patientRuf = patientRuf;
    }

    public String getPatientChip() {
        return patientChip;
    }

    public void setPatientChip(String patientChip) {
        this.patientChip = patientChip;
    }

    public Date getPatientGeb() {
        return patientGeb;
    }

    public void setPatientGeb(Date patientGeb) {
        this.patientGeb = patientGeb;
    }

    public String getPatientZuchtbuchnr() {
        return patientZuchtbuchnr;
    }

    public void setPatientZuchtbuchnr(String patientZuchtbuchnr) {
        this.patientZuchtbuchnr = patientZuchtbuchnr;
    }

    public String getPatientTatoonr() {
        return patientTatoonr;
    }

    public void setPatientTatoonr(String patientTatoonr) {
        this.patientTatoonr = patientTatoonr;
    }

    public Integer getHalterId() {
        return halterId;
    }

    public void setHalterId(Integer halterId) {
        this.halterId = halterId;
    }

    public Halter getHalterHalterId() {
        return halterHalterId;
    }

    public void setHalterHalterId(Halter halterHalterId) {
        this.halterHalterId = halterHalterId;
    }

    public Rasse getRasse() {
        return rasse;
    }

    public void setRasse(Rasse rasse) {
        this.rasse = rasse;
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
        hash += (patientId != null ? patientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.patientId == null && other.patientId != null) || (this.patientId != null && !this.patientId.equals(other.patientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientId=" + patientId + ", patientName=" + patientName + ", patientRuf=" + patientRuf + ", patientChip=" + patientChip + ", patientGeb=" + patientGeb + ", patientZuchtbuchnr=" + patientZuchtbuchnr + ", patientTatoonr=" + patientTatoonr + ", halterId=" + halterId + ", halterHalterId=" + halterHalterId + ", rasse=" + rasse + ", auftragpositionCollection=" + auftragpositionCollection + '}';
    }

    
}
