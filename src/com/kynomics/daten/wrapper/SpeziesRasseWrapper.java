/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.daten.wrapper;

import com.kynomics.daten.Rasse;
import com.kynomics.daten.Spezies;
import java.io.Serializable;

/**
 *
 * @author dboehm
 */
public class SpeziesRasseWrapper implements Serializable {
    
   private static final long serialVersionUID = 1L;
    private Spezies spezies;
    private Rasse rasse;

    public Spezies getSpezies() {
        return spezies;
    }

    public void setSpezies(Spezies spezies) {
        this.spezies = spezies;
    }

    public Rasse getRasse() {
        return rasse;
    }

    public void setRasse(Rasse rasse) {
        this.rasse = rasse;
    }

    public SpeziesRasseWrapper(Spezies spezies, Rasse rasse) {
        this.spezies = spezies;
        this.rasse = rasse;
    }
    
    
    
    
}
