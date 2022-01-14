package com.BinhAn;

public class Cylinder extends Circle {
    private double Height = 10.0;

    public Cylinder(){
    }

    public Cylinder(String color, Double radius, double height){
        super(color, radius);
        Height =height;
    }
    public Cylinder(double height){
        Height=height;
    }
    public double getHeight(){
        return Height;
    }
    public void setHeight(double height){
        Height =height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                ",Height=" + Height +
                '}';
    }
}
