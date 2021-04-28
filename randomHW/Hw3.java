/*
course: CSC190
project: hw 3
date: 9/14/17
author: Johnathan McQueen
purpose: This Java program reads a point (px, py) and a line segment
((lp1x, lp1y), (lp2x, lp2y)) and determines whether the point lies on the 
line segment or not 
 */

import java.util.Scanner;
public class Hw3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double px, py, lp1x, lp1y, lp2x, lp2y, slope;
        String ab;

        System.out.print("Enter px:");
        px = in.nextDouble();
        System.out.print("Enter py:");
        py = in.nextDouble();
        System.out.print("Enter 1p1x:");
        lp1x = in.nextDouble();
        System.out.print("Enter lp1y:");
        lp1y = in.nextDouble();
        System.out.print("enter lp2x:");
        lp2x = in.nextDouble();
        System.out.print("enter lp2y:");
        lp2y = in.nextDouble();

        slope = (lp2y - lp1y) / (lp2x - lp1x);
        if (slope == (lp2y - py) / (lp2x - px)) 
            if (lp1x <= px && px <= lp2x || lp2x <= px && px <= lp1x) 
                ab = "on";
            else 
                ab = "off";
        else 
            ab = "off";
        
        System.out.println(ab);

    }

}
