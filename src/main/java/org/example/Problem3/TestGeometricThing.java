package org.example.Problem3;
import java.util.ArrayList;
import java.util.Scanner;

public class TestGeometricThing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Part-1
        Square square1 = new Square();
        Square square2 = new Square(4.0);

        // Square1
        System.out.println("side: " + square1.getSide());
        System.out.println(square1.toString());

        // Square2
        System.out.println("side: " + square2.getSide());
        System.out.println(square2.toString());

    // Part-2
        ArrayList<GeometricThing> list = new ArrayList<>();
        addObject(list);                    // added 10 objects to the list using addObject method.
        double sum = sumArea(list);         // sumArea returns the total area of all the objects.
        System.out.println("The total area is " + sum);

    // Part-3
        GeometricThing geometricThing = findBiggestThing(list);       // returns the object with biggest Area.
        System.out.println("The area of the biggest object is " + geometricThing.area());

    // Part-4
        try {
            while (true) {                                          // while loop runs until you give an index value out of list size.
                System.out.println("Enter an index value");
                int n = sc.nextInt();
                displayObject(list, n);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    // Part-2
    public static void addObject(ArrayList<GeometricThing> list) {
        // Adding Circle object 3 times to the list.
        double radius = 3.0;

        for (int i = 0;i < 3;i++) {
            Circle c = new Circle(radius);
            System.out.println(c.area());
            list.add(c);
            radius++;
        }

        // Adding Square object 3 times to the list
        double side = 4.0;

        for (int i = 0;i < 3;i++) {
            Square s = new Square(side);
            System.out.println(s.area());
            list.add(s);
            side++;
        }

        // Adding rectangle 4 times to the list
        double length = 3.0;
        double width = 2.0;

        for (int i = 0;i < 4;i++) {
            Rectangle r = new Rectangle(length, width);
            System.out.println(r.area());
            list.add(r);
            length++;
            width++;
        }
    }

    // Part-2
    public static double sumArea(ArrayList<GeometricThing> list) {
        double sum = 0;
        for (GeometricThing geometricThing : list) {
            sum += geometricThing.area();                                       // Adding area of each object to sum variable.
        }
        return sum;
    }

    // Part-3
    public static GeometricThing findBiggestThing(ArrayList<GeometricThing> list) {
        GeometricThing geometricThingObject = null;
        double maxArea = 0;

        for (GeometricThing geometricThing : list) {
            double area = geometricThing.area();
            if (area > maxArea) {
                maxArea = area;
                geometricThingObject = geometricThing;
            }
        }
        return geometricThingObject;                        // returns the object that has largest Area.
    }

    // Part-4
    public static void displayObject(ArrayList<GeometricThing> list, int n) throws Exception{
        if (n < 0 && n >= list.size()) {
            throw new ArrayIndexOutOfBoundsException("index Out of Bounds for the list of size " + list.size());
        }

        GeometricThing geometricThing = list.get(n);
        System.out.println("The area of the object at " + n + "th index is " + geometricThing.area());
    }





}
