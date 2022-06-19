package com.Comparing_Line;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter x2 and y2");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        double length;
        length = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length of Line1 is " + length );

    }
}
