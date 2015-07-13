package com.mcwilliams.passbook.models;

/**
 * Created by jrclark on 7/13/15.
 */
public class BeaconsEntity {
    private String relevantText;
    private String proximityUUID;

    public void setRelevantText(String relevantText) {
        this.relevantText = relevantText;
    }

    public void setProximityUUID(String proximityUUID) {
        this.proximityUUID = proximityUUID;
    }

    public String getRelevantText() {
        return relevantText;
    }

    public String getProximityUUID() {
        return proximityUUID;
    }
}
