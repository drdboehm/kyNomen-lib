/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.wrapper;

import com.kynomics.daten.Auftrag;
import com.kynomics.daten.Auftragposition;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dboehm
 */
public class AuftragAuftragPositionenWrapper implements Serializable {

    private static final long serialVersionUID = 1L;
    private Auftrag auftrag;
    private List<Auftragposition> auftragpositionenList;

    public AuftragAuftragPositionenWrapper(Auftrag auftrag, List<Auftragposition> auftragpositionenList) {
        this.auftrag = auftrag;
        this.auftragpositionenList = auftragpositionenList;
    }


    public Auftrag getAuftrag() {
        return auftrag;
    }

    public void setAuftrag(Auftrag auftrag) {
        this.auftrag = auftrag;
    }

    public List<Auftragposition> getAuftragpositionenList() {
        return auftragpositionenList;
    }

    public void setAuftragpositionenList(List<Auftragposition> auftragpositionenList) {
        this.auftragpositionenList = auftragpositionenList;
    }


   

}
