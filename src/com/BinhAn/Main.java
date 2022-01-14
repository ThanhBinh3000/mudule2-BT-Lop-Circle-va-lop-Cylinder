package com.BinhAn;

public class Main {

    public static void main(String[] args) {
        // kiêm thử lớp circle
        Circle circle01 = new Circle();
        System.out.println(circle01);
        circle01 = new Circle("green", 5.9);
        System.out.println(circle01);
        //kiểm thử lớp cylinder
        Cylinder cylinder01=new Cylinder();
        System.out.println(cylinder01);
        cylinder01=new Cylinder("green",5.0,12);
        System.out.println(cylinder01);
        cylinder01.setColor("black");
        Cylinder cylinder02=new Cylinder();
        System.out.println(cylinder01 );
    }
}
