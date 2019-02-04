package com.company;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * (Math.pow(radius,2));

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
