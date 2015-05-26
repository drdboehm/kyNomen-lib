/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "ergebnis", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ergebnis.findAll", query = "SELECT e FROM Ergebnis e"),
    @NamedQuery(name = "Ergebnis.findByErgebnisId", query = "SELECT e FROM Ergebnis e WHERE e.ergebnisPK.ergebnisId = :ergebnisId"),
    @NamedQuery(name = "Ergebnis.findByErgebnisDate", query = "SELECT e FROM Ergebnis e WHERE e.ergebnisDate = :ergebnisDate"),
    @NamedQuery(name = "Ergebnis.findByErgebnisDatei", query = "SELECT e FROM Ergebnis e WHERE e.ergebnisDatei = :ergebnisDatei"),
    @NamedQuery(name = "Ergebnis.findByErgebnisDok", query = "SELECT e FROM Ergebnis e WHERE e.ergebnisDok = :ergebnisDok"),
    @NamedQuery(name = "Ergebnis.findByUntersuchungId", query = "SELECT e FROM Ergebnis e WHERE e.ergebnisPK.untersuchungId = :untersuchungId")})
public class Ergebnis implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ErgebnisPK ergebnisPK;
    @Column(name = "ergebnis_date")
    @Temporal(TemporalType.DATE)
    private Date ergebnisDate;
    @Size(max = 240)
    @Column(name = "ergebnis_datei", length = 240)
    private String ergebnisDatei;
    @Size(max = 45)
    @Column(name = "ergebnis_dok", length = 45)
    private String ergebnisDok;
    @JoinColumn(name = "untersuchung_id", referencedColumnName = "untersuchung_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Untersuchung untersuchung;
    @JoinColumn(name = "ergebnistyp_id", referencedColumnName = "ergebnistyp_id", nullable = false)
    @ManyToOne(optional = false)
    private Ergebnistyp ergebnistypId;

    public Ergebnis() {
    }

    public Ergebnis(ErgebnisPK ergebnisPK) {
        this.ergebnisPK = ergebnisPK;
    }

    public Ergebnis(int ergebnisId, int untersuchungId) {
        this.ergebnisPK = new ErgebnisPK(ergebnisId, untersuchungId);
    }

    public ErgebnisPK getErgebnisPK() {
        return ergebnisPK;
    }

    public void setErgebnisPK(ErgebnisPK ergebnisPK) {
        this.ergebnisPK = ergebnisPK;
    }

    public Date getErgebnisDate() {
        return ergebnisDate;
    }

    public void setErgebnisDate(Date ergebnisDate) {
        this.ergebnisDate = ergebnisDate;
    }

    public String getErgebnisDatei() {
        return ergebnisDatei;
    }

    public void setErgebnisDatei(String ergebnisDatei) {
        this.ergebnisDatei = ergebnisDatei;
    }

    public String getErgebnisDok() {
        return ergebnisDok;
    }

    public void setErgebnisDok(String ergebnisDok) {
        this.ergebnisDok = ergebnisDok;
    }

    public Untersuchung getUntersuchung() {
        return untersuchung;
    }

    public void setUntersuchung(Untersuchung untersuchung) {
        this.untersuchung = untersuchung;
    }

    public Ergebnistyp getErgebnistypId() {
        return ergebnistypId;
    }

    public void setErgebnistypId(Ergebnistyp ergebnistypId) {
        this.ergebnistypId = ergebnistypId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ergebnisPK != null ? ergebnisPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ergebnis)) {
            return false;
        }
        Ergebnis other = (Ergebnis) object;
        if ((this.ergebnisPK == null && other.ergebnisPK != null) || (this.ergebnisPK != null && !this.ergebnisPK.equals(other.ergebnisPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ergebnis{" + "ergebnisPK=" + ergebnisPK + ", ergebnisDate=" + ergebnisDate + ", ergebnisDatei=" + ergebnisDatei + ", ergebnisDok=" + ergebnisDok + ", untersuchung=" + untersuchung + ", ergebnistypId=" + ergebnistypId + '}';
    }

   
    
}
