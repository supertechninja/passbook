package com.mcwilliams.passbook.models.storecard;

/**
 * Created by jrclark on 7/13/15.
 */
public class HeaderFieldsEntity {
    private String dateStyle;
    private boolean isRelative;
    private String value;
    private String timeStyle;
    private String label;
    private String key;

    public void setDateStyle(String dateStyle) {
        this.dateStyle = dateStyle;
    }

    public void setIsRelative(boolean isRelative) {
        this.isRelative = isRelative;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setTimeStyle(String timeStyle) {
        this.timeStyle = timeStyle;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDateStyle() {
        return dateStyle;
    }

    public boolean isIsRelative() {
        return isRelative;
    }

    public String getValue() {
        return value;
    }

    public String getTimeStyle() {
        return timeStyle;
    }

    public String getLabel() {
        return label;
    }

    public String getKey() {
        return key;
    }
}
