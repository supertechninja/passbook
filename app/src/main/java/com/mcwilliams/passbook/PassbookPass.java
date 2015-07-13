package com.mcwilliams.passbook;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jrclark on 7/13/15.
 */
public class PassbookPass implements Serializable {
    @SerializedName("description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
