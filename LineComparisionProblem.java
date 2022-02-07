package com.company;

import java.util.Scanner;

public class LineComparisionProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Co-ordinates of line
        System.out.print("Enter x1 & y1 co-ordinates of first point: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter x2 & y2 co-ordinate of second point: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        //Computation
        Double Length_of_line1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("length of line1 is:" + Length_of_line1);

        System.out.print("Enter x3 & y3 co-ordinates of first point: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.print("Enter x4 & y4 co-ordinate of second point: ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        //Computation
        Double Length_of_line2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("length of line2 is:" + Length_of_line2);

        int value = Length_of_line1.compareTo(Length_of_line2);
        if (value < 0)
        {
            System.out.println("Length of line1 is less than length of line2.");
        }
        else if(value > 0)
        {
            System.out.println("Length of line1 is greater than length of line2.");
        }
        else
        {
            System.out.println("Both the lines are equal.");
        }

    }
}
