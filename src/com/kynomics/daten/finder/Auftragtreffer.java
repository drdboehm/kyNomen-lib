package com.kynomics.daten.finder;

import com.kynomics.daten.Auftragtyp;
import com.kynomics.daten.Halter;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author teilnehmer
 */
public class Auftragtreffer implements Serializable {

    private Integer auftragId;
    private Date auftragStart;
    private Date auftragEnde;
    private String auftragText;
    private Auftragtyp auftragstypId;
    private Halter halterId;

    public Auftragtreffer() {
    }

    /*
     only set the constructor with the unique Id attribute, the details can be later 
     identified by this Id
     */
    public Auftragtreffer(Integer auftragId) {
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

    public Auftragtyp getAuftragstypId() {
        return auftragstypId;
    }

    public void setAuftragstypId(Auftragtyp auftragstypId) {
        this.auftragstypId = auftragstypId;
    }

    public Halter getHalterId() {
        return halterId;
    }

    public void setHalterId(Halter halterId) {
        this.halterId = halterId;
    }

   

}
