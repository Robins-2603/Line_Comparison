package com.Comparing_Line;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program");
        Scanner scan = new Scanner(System.in);

        // For Line 1
        System.out.println("Enter x1 and y1");
        double x1, y1, x2, y2, length1;
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.println("Enter x2 and y2");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        length1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );

        System.out.println("Length of Line1 is " + length1 );

        // For Line 2

        double a1, b1, a2, b2, length2;
        System.out.println("Enter a1 and b1");
        a1 = scan.nextDouble();
        b1 = scan.nextDouble();

        System.out.println("Enter a2 and b2");
        a2 = scan.nextDouble();
        b2 = scan.nextDouble();
        length2 = Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2) );

        System.out.println("Length of Line2 is " + length2 );

        // For Equality check of both line
        if ( length1 > length2 ) {
            System.out.println("length of Line1 is greater than Line2 by " + (length1 - length2));
        }
        else if ( length1 < length2 ) {
            System.out.println("Line1 is shorter than Line2 by "+ (length2 - length1));
        }
        else {
            System.out.println("Both Lines are equal");
        }

    }
}
