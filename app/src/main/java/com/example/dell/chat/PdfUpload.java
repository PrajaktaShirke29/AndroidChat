package com.example.dell.chat;

/**
 * Created by DELL on 25-10-2018.
 */

public class PdfUpload {
    public String name;
    public String url;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public PdfUpload() {
    }

    public PdfUpload(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
