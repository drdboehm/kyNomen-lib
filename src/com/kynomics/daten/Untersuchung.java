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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "untersuchung", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Untersuchung.findAll", query = "SELECT u FROM Untersuchung u"),
    @NamedQuery(name = "Untersuchung.findByUntersuchungId", query = "SELECT u FROM Untersuchung u WHERE u.untersuchungId = :untersuchungId"),
    @NamedQuery(name = "Untersuchung.findByUntersuchungName", query = "SELECT u FROM Untersuchung u WHERE u.untersuchungName = :untersuchungName"),
    @NamedQuery(name = "Untersuchung.findByUntersuchungDauer", query = "SELECT u FROM Untersuchung u WHERE u.untersuchungDauer = :untersuchungDauer"),
    @NamedQuery(name = "Untersuchung.findByUntersuchungPreis", query = "SELECT u FROM Untersuchung u WHERE u.untersuchungPreis = :untersuchungPreis")})
public class Untersuchung implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "untersuchung_id", nullable = false)
    private Integer untersuchungId;
    @Size(max = 240)
    @Column(name = "untersuchung_name", length = 240)
    private String untersuchungName;
    @Column(name = "untersuchung_dauer")
    private Integer untersuchungDauer;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "untersuchung_preis", precision = 22)
    private Double untersuchungPreis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "untersuchungId")
    private Collection<Auftragposition> auftragpositionCollection;
    @JoinColumn(name = "untersuchungstyp_untersuchungtyp_id", referencedColumnName = "untersuchungtyp_id", nullable = false)
    @ManyToOne(optional = false)
    private Untersuchungstyp untersuchungstypUntersuchungtypId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "untersuchung")
    private Collection<Ergebnis> ergebnisCollection;

    /**
     * this is a transient boolean flag indicating whether the object was edited and should be again persisted
     */
    @Transient
    public boolean edited;
    
      /**
     * this is a transient boolean flag indicating whether the object was selected 
     */
    @Transient
    public boolean selected;
    
    public Untersuchung() {
    }

    public Untersuchung(Integer untersuchungId) {
        this.untersuchungId = untersuchungId;
    }

    public Integer getUntersuchungId() {
        return untersuchungId;
    }

    public void setUntersuchungId(Integer untersuchungId) {
        this.untersuchungId = untersuchungId;
    }

    public String getUntersuchungName() {
        return untersuchungName;
    }

    public void setUntersuchungName(String untersuchungName) {
        this.untersuchungName = untersuchungName;
    }

    public Integer getUntersuchungDauer() {
        return untersuchungDauer;
    }

    public void setUntersuchungDauer(Integer untersuchungDauer) {
        this.untersuchungDauer = untersuchungDauer;
    }

    public Double getUntersuchungPreis() {
        return untersuchungPreis;
    }

    public void setUntersuchungPreis(Double untersuchungPreis) {
        this.untersuchungPreis = untersuchungPreis;
    }

    @XmlTransient
    public Collection<Auftragposition> getAuftragpositionCollection() {
        return auftragpositionCollection;
    }

    public void setAuftragpositionCollection(Collection<Auftragposition> auftragpositionCollection) {
        this.auftragpositionCollection = auftragpositionCollection;
    }

    public Untersuchungstyp getUntersuchungstypUntersuchungtypId() {
        return untersuchungstypUntersuchungtypId;
    }

    public void setUntersuchungstypUntersuchungtypId(Untersuchungstyp untersuchungstypUntersuchungtypId) {
        this.untersuchungstypUntersuchungtypId = untersuchungstypUntersuchungtypId;
    }

    @XmlTransient
    public Collection<Ergebnis> getErgebnisCollection() {
        return ergebnisCollection;
    }

    public void setErgebnisCollection(Collection<Ergebnis> ergebnisCollection) {
        this.ergebnisCollection = ergebnisCollection;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (untersuchungId != null ? untersuchungId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Untersuchung)) {
            return false;
        }
        Untersuchung other = (Untersuchung) object;
        if ((this.untersuchungId == null && other.untersuchungId != null) || (this.untersuchungId != null && !this.untersuchungId.equals(other.untersuchungId))) {
            return false;
        }
        return true;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "Untersuchung{" + "untersuchungId=" + untersuchungId + ", untersuchungName=" + untersuchungName + ", untersuchungDauer=" + untersuchungDauer + ", untersuchungPreis=" + untersuchungPreis + ", untersuchungstypUntersuchungtypId=" + untersuchungstypUntersuchungtypId + ", edited=" + edited + ", selected=" + selected + '}';
    }

    

    
    
}
