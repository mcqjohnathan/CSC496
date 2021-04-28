/*
course: CSC190
project: hw 1
date: 8/31/17
author: Johnathan McQueen
purpose: This program reads grades on midterm1(0-80),  midterm2(0-100), 
final(0-200), quizzes(0-150), homework assignments(0-240), 
and lab projects(0-300) and then prints the overall grade(0-100). 
*/

import java.util.Scanner;
class Hw1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mid1, mid2, fi, q, hw, lab, avg;

        System.out.print("Enter the midterm1 grade(0-80):");
        mid1 = in.nextDouble();
        System.out.print("Enter the midterm2 grade(0-100):");
        mid2 = in.nextDouble();
        System.out.print("Enter the final exam grade(0-200):");
        fi = in.nextDouble();
        System.out.print("Enter the quiz grade(0-150):");
        q = in.nextDouble();
        System.out.print("Enter the homework grade(0-240):");
        hw = in.nextDouble();
        System.out.print("Enter the Lab prject grade(0-300):");
        lab = in.nextDouble();
        //calculations to get them 0-100 range
        mid1 = mid1/80*100;
        mid2 = mid2/100*100;
        fi = fi/200*100;
        q = q/150*100;
        hw = hw/240*100;
        lab = lab/300*100;
        //calculating the wieght of the grade
        mid1 = (mid1*.10); 
        mid2 = (mid2*.15);
        fi = (fi*.20);
        q = (q*.15);
        hw = (hw*.25);
        lab = (lab*.15);
        // adding the grades together to get the overrall grade
        avg = mid1+mid2+fi+q+hw+lab;
        
        System.out.println("Course average = " + avg);   
    }
}    