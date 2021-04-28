/*
course: CSC 190
project: Hw11
date: 12/07/17
author: Johnathan McQueen
purpose: to tell the order of deaths in the kill circle
 */
import java.util.Scanner;

public class Hw12 {
    static String KillCir(int n, int k) {
        int a[];
        int x=k;
        final int Maxsize=9;
        a = new int[Maxsize];
        int cnt = 0, c, j;   
           
        String s="";
        for (int i = 0; i < n; i++){
            a[i] = i+1;
            System.out.print(a[i]);
        }
        j = 0;
        k=k-1;
        for (int i= 0; i<n;i++){
            while (k>0){
                int t = a[0];
                for (int p = 1; p < n; p++)
                     a[p-1] = a[p];
                    a[n-1] = t;
                    if (a[0]==0)
                        continue;
                    else
                        k--;    
            }
            System.out.println(a[0]);
            s+= a[0];
            a[0]=0;
            k=x;  
        }
            return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        
        int n=0, k=0;
        String res;
        
        do {
            System.out.println("1. Enter how many people(n) and kill order(k): ");
            
            System.out.println("q. stop: ");
            
            System.out.println("select: ");
            
            res = in.next();
            
            switch (res.charAt(0)) {
                case '1':
                    System.out.println("Enter how many people:");
                    n = in.nextInt();
                    
                    System.out.println("Enter kill order(k)");
                    k = in.nextInt();
                    System.out.println(KillCir(n, k));

                    break;
                case '2':
                    
                    break; 

                
                case 'q': case 'Q':
                    System.out.println("Thank you for using my program");
                    break;
                default:
                    System.out.println("invalid? Try it again");
                    
            }
        } while (res.toLowerCase().charAt(0) != 'q');
    }  
}
    
    

