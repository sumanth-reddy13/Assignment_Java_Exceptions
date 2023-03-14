package org.example.Problem3;

public class Circle extends GeometricThing{

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        double area = 3.14 * radius * radius;
        return Math.round(area);      // rounded the double value
    }
}
