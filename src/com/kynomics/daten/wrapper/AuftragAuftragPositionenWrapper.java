/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.wrapper;

import com.kynomics.daten.Auftrag;
import com.kynomics.daten.Auftragposition;
import java.io.Serializable;

/**
 *
 * @author dboehm
 */
public class AuftragAuftragPositionenWrapper implements Serializable {

    private static final long serialVersionUID = 1L;
    private Auftrag auftrag;
    private Auftragposition auftragposition;

    public AuftragAuftragPositionenWrapper(Auftrag auftrag, Auftragposition auftragposition) {
        this.auftrag = auftrag;
        this.auftragposition = auftragposition;
    }

    public Auftrag getAuftrag() {
        return auftrag;
    }

    public void setAuftrag(Auftrag auftrag) {
        this.auftrag = auftrag;
    }

    public Auftragposition getAuftragposition() {
        return auftragposition;
    }

    public void setAuftragposition(Auftragposition auftragposition) {
        this.auftragposition = auftragposition;
    }

   

}
