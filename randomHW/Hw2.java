/*
course: CSC190
project: hw 2
date: 9/07/17
author: Johnathan McQueen
purpose: This java program reads two points and then finds the smallest circle 
and the smallest upright rectangle containing the points.
*/

import java.util.Scanner;
class Hw2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1, x2, y1, y2, cx, cy, cr, r1, r2, r3, r4;
        
        System.out.print("Enter x of point 1: ");
        x1 = in.nextDouble();
        System.out.print("Enter y of point 1: ");
        y1 = in.nextDouble();
        System.out.print("Enter x of point 2: ");
        x2 = in.nextDouble();
        System.out.print("Enter y of point 2: ");
        y2 = in.nextDouble();
        
        cx = (x2+x1)/2;
        cy = (y2+y1)/2;
        cr = Math.pow((y2-cy),2)+ Math.pow((x2-cx),2);
        cr = Math.sqrt(cr);
        
        r2 = Math.max(y2, y1);
        r1 = Math.min(x1, x2);
        r3 = Math.min(y2, y1);
        r4 = Math.max(x1, x2);
 
        System.out.println("C = (("+cx+", "+cy+"), "+cr+") and R = (("+r1+", "+r2+"), ("+r4+", "+r3+")).");
        
    }
    
}
