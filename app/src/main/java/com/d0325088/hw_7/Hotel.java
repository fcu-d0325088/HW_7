package com.d0325088.hw_7;

import android.graphics.Bitmap;

/**
 * Created by user on 2017/6/6.
 */

public class Hotel {
    private String name;
    private String address;
    private Bitmap imgUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Bitmap getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Bitmap imgUrl) {
        this.imgUrl = imgUrl;
    }
}
