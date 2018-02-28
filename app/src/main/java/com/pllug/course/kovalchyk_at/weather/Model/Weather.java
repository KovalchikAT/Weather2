package com.pllug.course.kovalchyk_at.weather.Model;

/**
 * Created by Kovalchyk_at on 27.02.2018.
 */

public class Weather {
    private int id;
    private String main;
    private String descriptor;
    private String icon;


    public Weather(int id, String main, String descriptor, String icon){
        this.id = id;
        this.main = main;
        this.descriptor = descriptor;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
