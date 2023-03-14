package org.example.Problem3;
public class Square extends GeometricThing {
    double side;
    Square() {
        this.side = 1.0;
    }
    Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public String toString() {
        return this.side + "";
    }

    @Override
    public double area() {
        return this.side * this.side;
    }
}
