package org.example.Problem3;

public class Rectangle extends GeometricThing{

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;             // Can also round the resultant area
    }

}
