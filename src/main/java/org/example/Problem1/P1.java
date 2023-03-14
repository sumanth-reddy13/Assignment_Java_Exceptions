package org.example.Problem1;

import java.util.Random;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        int[] arr = new int[101];
        Scanner sc = new Scanner(System.in);
        problem1(arr, sc);
    }
    public static void problem1(int[] arr, Scanner sc) {
        Random random = new Random();
        for (int i = 0;i < 101;i++) {
            arr[i] = random.nextInt(1,21);
        }

        try {
            while (true) {
                System.out.println("Enter an index between 0 and 100");
                int index = sc.nextInt();
                int num = arr[index];
                System.out.println("The value at index " + index + " is " + num);
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
