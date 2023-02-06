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

        output("------ Differenzen ------");

        output("Diff. r-t; " + areaDiff(rectangle, triangle));
        output("Diff. r-c: " + areaDiff(rectangle, circle));
        output("Diff. c-t: " + areaDiff(circle, triangle));
        output("Diff. t-t: " + areaDiff(triangle, triangle));
        
        
        output("------ Summen ------");

        output("Sum. r+t; " + areaSum(rectangle, triangle));
        output("Sum. r+c: " + areaSum(rectangle, circle));
        output("Sum. c+t: " + areaSum(circle, triangle));
        output("Sum. t+t: " + areaSum(triangle, triangle));
    
    }


    private static double areaDiff(Shape s1, Shape s2) {
            return s1.area() - s2.area();
        }

        private static double areaSum(Shape s1, Shape s2) {
            return s1.area() + s2.area();
    
}


    // Überladen. okay bei einige wenigen
    // private static double areaDiff(Rectangle r, Triangle t) {
    //     return r.area() - t.area();
    // }


    // 
    // private static double areaDiff(Rectangle r, Circle c) {
    //     return r.area() - c.area();
    // }

    
    
    
    
    
    private static void output(String outputStr) {
        System.out.println(outputStr);

    }

}
