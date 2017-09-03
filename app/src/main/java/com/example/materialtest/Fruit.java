package com.example.materialtest;

/**
 * Created by 王宇飞 on 2017/9/3/003.
 */

public class Fruit {
    private String name;

    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return  name;
    }

    public int getImageId(){
        return imageId;
    }
}
