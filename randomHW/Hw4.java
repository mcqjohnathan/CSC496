/*
course: CSC190
project: hw 4
date: 9/21/17
author: Johnathan McQueen
purpose: This Java program takes the lengths of three sides, s1, s2, and s3, and
decides if the sides of the given lengths can form a triangle.  If they can, it determines
if the triangle is right, acute, or obtuse
 */

import java.util.Scanner;
public class Hw4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S1, S2, S3;
        
        System.out.print("Enter S1: ");
        S1 = in.nextDouble();
        System.out.print("Enter S2: ");
        S2 = in.nextDouble();
        System.out.print("Enter S3: ");
        S3 = in.nextDouble();
        
        if (S1 > S2){
            double t = S2;
            S2 = S1;
            S1 = t;
        }
        
        if (S2 > S3){
            double t = S3;
            S3 = S2;
            S2 = t;
        }
   
        if (S1 + S2 > S3 && S2 + S3 > S1 && S3 + S1 > S2){
            if ((S1 * S1) + (S2*S2) == (int)Math.pow(S3, 2))
                System.out.print("Right Triangle");
            else if ((S1 * S1) + (S2*S2) > (S3*S3))
                System.out.print("Acute Triangle");
            else 
                System.out.print("Obtuse Triangle");
        }
        else
            System.out.println("Not a Triangle ");
                   
            
        
            
                
                
        
            
     
    }
    
}
