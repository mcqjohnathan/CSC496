/*
course: CSC190
project: hw 5
date: 9/28/17
author: Johnathan McQueen
purpose: 
*/
import java.util.Scanner;
import java.util.Random;
public class Hw5 {
    static int getPrize(int g, int u) {
        int p;
        p = 5;
        if ((g/1000) == (u/1000)){
            p = p - 1;
            g = g % 1000;
            u = u % 1000;
        }
        else {
            g = g % 1000;
            u = u % 1000;
        }    
        if ((g/100) == (u/100)){
            p = p - 1;
            g = g % 100;
            u = u % 100;
        } 
        else {
            g = g % 100;
            u = u % 100;
        }    
        if ((g/10) == (u/10)){
            p = p - 1;
            g = g % 10;
            u = u % 10;
        } 
        else {
            g = g % 10;
            u = u % 10;
        }    
        if (g == u){
            p = p - 1;
        }
        
        switch(p){
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 5;
        }
            
                
         
        
             
                 

    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        int g, u, prize;
        //g = rand.nextInt(9000)+1000;
        g = 5555;
        System.out.print("Enter a 4 digit integer: ");
        u = in.nextInt();
        
        prize = getPrize(g, u);
        System.out.println(prize);
        
        
    }
}
