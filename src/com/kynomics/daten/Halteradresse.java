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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dboehm
 */
@Entity
@Table(name = "halteradresse", catalog = "kynomics", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Halteradresse.findAll", query = "SELECT h FROM Halteradresse h"),
    @NamedQuery(name = "Halteradresse.findByHalteradresseId", query = "SELECT h FROM Halteradresse h WHERE h.halteradresseId = :halteradresseId"),
    @NamedQuery(name = "Halteradresse.findByHalterPlz", query = "SELECT h FROM Halteradresse h WHERE h.halterPlz = :halterPlz"),
    @NamedQuery(name = "Halteradresse.findByHalterOrt", query = "SELECT h FROM Halteradresse h WHERE h.halterOrt = :halterOrt"),
    @NamedQuery(name = "Halteradresse.findByHalterStrasse", query = "SELECT h FROM Halteradresse h WHERE h.halterStrasse = :halterStrasse"),
    @NamedQuery(name = "Halteradresse.findByHalterTel", query = "SELECT h FROM Halteradresse h WHERE h.halterTel = :halterTel"),
    @NamedQuery(name = "Halteradresse.findByEmail", query = "SELECT h FROM Halteradresse h WHERE h.email = :email")})
public class Halteradresse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "halteradresse_id", nullable = false)
    private Integer halteradresseId;
    @Size(max = 45)
    @Column(name = "halter_plz", length = 45)
    private String halterPlz;
    @Size(max = 45)
    @Column(name = "halter_ort", length = 45)
    private String halterOrt;
    @Size(max = 45)
    @Column(name = "halter_strasse", length = 45)
    private String halterStrasse;
    @Size(max = 45)
    @Column(name = "halter_tel", length = 45)
    private String halterTel;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "email", length = 60)
    private String email;
    @JoinColumn(name = "adresstyp_id", referencedColumnName = "adresstyp_id")
    @ManyToOne
    private Adresstyp adresstypId;
    @JoinColumn(name = "halter_id", referencedColumnName = "halter_id")
    @ManyToOne
    private Halter halterId;

    public Halteradresse() {
    }

    public Halteradresse(Integer halteradresseId) {
        this.halteradresseId = halteradresseId;
    }

    public Integer getHalteradresseId() {
        return halteradresseId;
    }

    public void setHalteradresseId(Integer halteradresseId) {
        this.halteradresseId = halteradresseId;
    }

    public String getHalterPlz() {
        return halterPlz;
    }

    public void setHalterPlz(String halterPlz) {
        this.halterPlz = halterPlz;
    }

    public String getHalterOrt() {
        return halterOrt;
    }

    public void setHalterOrt(String halterOrt) {
        this.halterOrt = halterOrt;
    }

    public String getHalterStrasse() {
        return halterStrasse;
    }

    public void setHalterStrasse(String halterStrasse) {
        this.halterStrasse = halterStrasse;
    }

    public String getHalterTel() {
        return halterTel;
    }

    public void setHalterTel(String halterTel) {
        this.halterTel = halterTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresstyp getAdresstypId() {
        return adresstypId;
    }

    public void setAdresstypId(Adresstyp adresstypId) {
        this.adresstypId = adresstypId;
    }

    public Halter getHalterId() {
        return halterId;
    }

    public void setHalterId(Halter halterId) {
        this.halterId = halterId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (halteradresseId != null ? halteradresseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Halteradresse)) {
            return false;
        }
        Halteradresse other = (Halteradresse) object;
        if ((this.halteradresseId == null && other.halteradresseId != null) || (this.halteradresseId != null && !this.halteradresseId.equals(other.halteradresseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Halteradresse{" + "halteradresseId=" + halteradresseId + ", halterPlz=" + halterPlz + ", halterOrt=" + halterOrt + ", halterStrasse=" + halterStrasse + ", halterTel=" + halterTel + ", email=" + email + ", adresstypId=" + adresstypId + ", halterId=" + halterId + '}';
    }

   
    
}
