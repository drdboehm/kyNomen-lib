package com.kynomics.daten.finder;

import com.kynomics.daten.Milestonetyp;
import java.io.Serializable;

/**
 *
 * @author teilnehmer
 */
public class MilestoneTreffer implements Serializable {

    /**
     * following are the selected fields from class Untersuchungstyp which are
     * defined as searchable
     */
    private Integer milestoneId;
    private String milestoneName;
    private Milestonetyp milestonetypId;

    public MilestoneTreffer() {
    }

    public MilestoneTreffer(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }

    /*
     only set the constructor with the unique Id attribute, the details can be later 
     identified by this Id
     */
    public Integer getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }

    public String getMilestoneName() {
        return milestoneName;
    }

    public void setMilestoneName(String milestoneName) {
        this.milestoneName = milestoneName;
    }

    public Milestonetyp getMilestonetypId() {
        return milestonetypId;
    }

    public void setMilestonetypId(Milestonetyp milestonetypId) {
        this.milestonetypId = milestonetypId;
    }

}
