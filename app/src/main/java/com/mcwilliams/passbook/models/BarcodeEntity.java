package com.mcwilliams.passbook.models;

/**
 * Created by jrclark on 7/13/15.
 */
public class BarcodeEntity {
    private String message;
    private String messageEncoding;
    private String format;
    private String altText;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessageEncoding(String messageEncoding) {
        this.messageEncoding = messageEncoding;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageEncoding() {
        return messageEncoding;
    }

    public String getFormat() {
        return format;
    }

    public String getAltText() {
        return altText;
    }
}
