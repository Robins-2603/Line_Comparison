package com.Comparing_Line;

import java.util.Scanner;

public class Compare {
    public static double x1, y1, x2, y2, length, length1, length2;

    //method for CoOrdinates of line
    public static void   coOrdinates(){
        System.out.println("Enter x1 and y1");
        Scanner scan = new Scanner(System.in);
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.println("Enter x2 and y2");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
    }

    //method for finding length

    public static double lengthOfLine(){
        length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
        return length;
    }

    // Method for Comparing
    public static void  CompareLine(){
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

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program");
        //for Line 1
        coOrdinates();
        // length
        Compare Line_1 = new Compare();
        length1 = Line_1.lengthOfLine();
        System.out.println("length of Line 1 = " + length1);

        // For Line 2

        coOrdinates();
        // length
        Compare Line_2 = new Compare();
        length2 = Line_2.lengthOfLine();
        System.out.println("length of Line 2 = " + length2);

        //comparing by calling compareLine method
        CompareLine();


    }
}
