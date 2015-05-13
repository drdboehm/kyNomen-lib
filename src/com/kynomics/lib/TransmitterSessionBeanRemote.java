/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.lib;

import com.kynomics.daten.Adresstyp;
import com.kynomics.daten.Halter;
import com.kynomics.daten.wrapper.HalterAdresssenPatientWrapper;
import com.kynomics.daten.Halteradresse;
import com.kynomics.daten.Haltertyp;
import com.kynomics.daten.Patient;
import com.kynomics.daten.Rasse;
import com.kynomics.daten.Spezies;
import com.kynomics.daten.finder.Haltertreffer;
import com.kynomics.daten.finder.Suchkriterien;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author teilnehmer
 */
@Remote
public interface TransmitterSessionBeanRemote {

    public boolean storeEjb(HalterAdresssenPatientWrapper hapw);

    public List<Haltertyp> initializeHalterTypen();

    public List<Adresstyp> initializeAdressTypen();

    public List<Spezies> initializeSpeziesTypen();

    public List<Rasse> initializeRasseTypen();

    public List<Halter> halterGet();

    public List<Patient> patientGet();
    
    public List<Halteradresse> halteradresseGet();
    
     public List<Haltertreffer> sucheHalter(Suchkriterien kriterien);

    public <T extends Object> T findById(Class<T> entityClass, Integer primaryKey);


}
