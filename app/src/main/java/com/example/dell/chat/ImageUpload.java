package com.example.dell.chat;

/**
 * Created by DELL on 25-10-2018.
 */

public class ImageUpload {
    private String mName;
    private String mImageUrl;

    public ImageUpload() {
        //empty constructor needed
    }

    public ImageUpload(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}

