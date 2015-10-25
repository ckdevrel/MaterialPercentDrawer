package com.takeoffandroid.materialpercentdrawer;

import android.graphics.drawable.Drawable;

/**
 * Created by Trey Robinson on 8/3/14.
 * Copyright 2014 MindMine LLC.
 */
public class MainModel {

    private String names;
    private int colors;

    private Drawable avatorIcons;



    public Drawable getAvatorIcons() {
        return avatorIcons;
    }

    public void setAvatorIcons(Drawable avatorIcons) {
        this.avatorIcons = avatorIcons;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getColors() {
        return colors;
    }

    public void setColors(int colors) {
        this.colors = colors;
    }
}
