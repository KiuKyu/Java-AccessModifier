package com.kiukyu;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private static final double pi = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double getArea() {
        return Math.pow(this.radius, 2) * pi;
    }
}
