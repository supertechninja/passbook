package com.mcwilliams.passbook.models.storecard;

/**
 * Created by jrclark on 7/13/15.
 */
public class BackFieldsEntity {
    private String value;
    private String label;
    private String key;

    public void setValue(String value) {
        this.value = value;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public String getKey() {
        return key;
    }
}
