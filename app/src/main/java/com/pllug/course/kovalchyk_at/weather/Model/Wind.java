package com.pllug.course.kovalchyk_at.weather.Model;

/**
 * Created by Kovalchyk_at on 28.02.2018.
 */

public class Wind {
    private double speed;
    private  double deg;

    public Wind(double speed, double deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }
}
