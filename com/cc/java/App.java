package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Triangle triangle = new Triangle(10, 10);
        Circle circle = new Circle(10);

        output("------ Flächen ------");
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Dreieck: " + triangle.area());
        output("Fläche Kreis: " + circle.area()); 







    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

