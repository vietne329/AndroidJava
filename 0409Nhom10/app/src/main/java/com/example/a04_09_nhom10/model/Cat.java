package com.example.a04_09_nhom10.model;

public class Cat {
    private int resourceImg;
    private String name;

    public Cat(int resourceImg, String name) {
        this.resourceImg = resourceImg;
        this.name = name;
    }

    public int getResourceImg() {
        return resourceImg;
    }

    public void setResourceImg(int resourceImg) {
        this.resourceImg = resourceImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
