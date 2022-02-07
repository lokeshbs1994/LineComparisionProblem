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
        double Length_of_line = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("length of line is:" + Length_of_line);
    }
}
