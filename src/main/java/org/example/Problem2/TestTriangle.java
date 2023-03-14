package org.example.Problem2;

public class TestTriangle {
    public static void main(String[] args) {
        try {
            Triangle2 t = new Triangle2(3, 1, 2);
        }
        catch(IllegalTriangleException message) {
            System.out.println(message);
        }
    }
}
class Triangle2 {
    public Triangle2(double side1, double side2, double side3) throws IllegalTriangleException
    {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleException("Triangle is not valid");
        }
    }
}
class IllegalTriangleException extends Exception {      // Custom Exception
    public IllegalTriangleException(String message) {
        super(message);
    }
}
