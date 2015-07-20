/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kynomics.lib;

import com.kynomics.daten.Adresstyp;
import com.kynomics.daten.Auftragtyp;
import com.kynomics.daten.Halter;
import com.kynomics.daten.wrapper.HalterAdresssenPatientWrapper;
import com.kynomics.daten.Halteradresse;
import com.kynomics.daten.Haltertyp;
import com.kynomics.daten.Milestone;
import com.kynomics.daten.Milestonetyp;
import com.kynomics.daten.Patient;
import com.kynomics.daten.Rasse;
import com.kynomics.daten.Spezies;
import com.kynomics.daten.Untersuchungstyp;
import com.kynomics.daten.UntersuchungstypMilestone;
import com.kynomics.daten.finder.Auftragtreffer;
import com.kynomics.daten.finder.HalteradresseTreffer;
import com.kynomics.daten.finder.Haltertreffer;
import com.kynomics.daten.finder.MilestoneTreffer;
import com.kynomics.daten.finder.Patiententreffer;
import com.kynomics.daten.finder.SuchkriterienAuftrag;
import com.kynomics.daten.finder.SuchkriterienHalter;
import com.kynomics.daten.finder.SuchkriterienHalteradresse;
import com.kynomics.daten.finder.SuchkriterienMilestone;
import com.kynomics.daten.finder.SuchkriterienPatient;
import com.kynomics.daten.finder.SuchkriterienUTyp;
import com.kynomics.daten.finder.SuchkriterienUntersuchung;
import com.kynomics.daten.finder.UTypTreffer;
import com.kynomics.daten.finder.Untersuchungtreffer;
import com.kynomics.daten.wrapper.AuftragAuftragPositionenWrapper;
import com.kynomics.daten.wrapper.SpeziesRasseWrapper;
import com.kynomics.daten.wrapper.UTypMileStoneWrapper;
import com.kynomics.daten.wrapper.UntersuchungWrapper;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author teilnehmer
 */
@Remote
public interface TransmitterSessionBeanRemote {

    public boolean storeEjb(HalterAdresssenPatientWrapper hapw);

    public boolean storeEjb(UTypMileStoneWrapper wrapper);

    public boolean storeEjb(SpeziesRasseWrapper wrapper);

    public boolean storeEjb(UntersuchungstypMilestone wrapper);

    public boolean storeEjb(UntersuchungWrapper wrapper);

    public boolean storeEjb(AuftragAuftragPositionenWrapper wrapper);

    public List<Haltertyp> initializeHalterTypen();

    public List<Adresstyp> initializeAdressTypen();

    public List<Spezies> initializeSpeziesTypen();

    public List<Rasse> initializeRasseTypen();

    public List<Untersuchungstyp> initializeUntersuchungstypen();

    public List<Milestonetyp> initializeMilestoneTypen();

    public List<Milestone> initializeMilestones();

    public List<Auftragtyp> initializeAuftragtypen();

    public List<Halter> halterGet();

    public List<Patient> patientGet();

    public List<Halteradresse> halteradresseGet();

    public List<Haltertreffer> sucheHalter(SuchkriterienHalter kriterien);

    public List<Patiententreffer> suchePatient(SuchkriterienPatient kriterien);

    public List<HalteradresseTreffer> sucheHalterAdresse(SuchkriterienHalteradresse suchKr);

    public List<UTypTreffer> sucheUntersuchungstyp(SuchkriterienUTyp suchKr);

    public List<MilestoneTreffer> sucheMilestone(SuchkriterienMilestone suchKr);

    public List<Untersuchungtreffer> sucheUntersuchung(SuchkriterienUntersuchung suchKr);
    
    public List<Auftragtreffer> sucheAuftrag(SuchkriterienAuftrag suchKr); 

    public <T extends Object> T findById(Class<T> entityClass, Integer primaryKey);

    public <T extends Object> T deleteById(Class<T> entityClass, Integer primaryKey);

}
