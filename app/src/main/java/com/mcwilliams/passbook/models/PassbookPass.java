package com.mcwilliams.passbook.models;

import com.mcwilliams.passbook.models.StoreCardEntity;
import com.mcwilliams.passbook.models.storecard.AuxiliaryFieldsEntity;
import com.mcwilliams.passbook.models.storecard.BackFieldsEntity;
import com.mcwilliams.passbook.models.BarcodeEntity;
import com.mcwilliams.passbook.models.BeaconsEntity;
import com.mcwilliams.passbook.models.storecard.HeaderFieldsEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jrclark on 7/13/15.
 */
public class PassbookPass implements Serializable {
    private StoreCardEntity storeCard;
    private String passTypeIdentifier;
    private String organizationName;
    private String backgroundColor;
    private String labelColor;
    private String serialNumber;
    private BarcodeEntity barcode;
    private String authenticationToken;
    private List<BeaconsEntity> beacons;
    private boolean ignoresTimeZone;
    private boolean suppressStripShine;
    private String teamIdentifier;
    private int formatVersion;
    private String description;
    private String webServiceURL;
    private String foregroundColor;

    public void setStoreCard(StoreCardEntity storeCard) {
        this.storeCard = storeCard;
    }

    public void setPassTypeIdentifier(String passTypeIdentifier) {
        this.passTypeIdentifier = passTypeIdentifier;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setLabelColor(String labelColor) {
        this.labelColor = labelColor;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setBarcode(BarcodeEntity barcode) {
        this.barcode = barcode;
    }

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    public void setBeacons(List<BeaconsEntity> beacons) {
        this.beacons = beacons;
    }

    public void setIgnoresTimeZone(boolean ignoresTimeZone) {
        this.ignoresTimeZone = ignoresTimeZone;
    }

    public void setSuppressStripShine(boolean suppressStripShine) {
        this.suppressStripShine = suppressStripShine;
    }

    public void setTeamIdentifier(String teamIdentifier) {
        this.teamIdentifier = teamIdentifier;
    }

    public void setFormatVersion(int formatVersion) {
        this.formatVersion = formatVersion;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWebServiceURL(String webServiceURL) {
        this.webServiceURL = webServiceURL;
    }

    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public StoreCardEntity getStoreCard() {
        return storeCard;
    }

    public String getPassTypeIdentifier() {
        return passTypeIdentifier;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getLabelColor() {
        return labelColor;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public BarcodeEntity getBarcode() {
        return barcode;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public List<BeaconsEntity> getBeacons() {
        return beacons;
    }

    public boolean isIgnoresTimeZone() {
        return ignoresTimeZone;
    }

    public boolean isSuppressStripShine() {
        return suppressStripShine;
    }

    public String getTeamIdentifier() {
        return teamIdentifier;
    }

    public int getFormatVersion() {
        return formatVersion;
    }

    public String getDescription() {
        return description;
    }

    public String getWebServiceURL() {
        return webServiceURL;
    }

    public String getForegroundColor() {
        return foregroundColor;
    }
}
