/*
course: CSC 190
project: Hw11
date: 11/30/17
author: Johnathan McQueen
purpose: add and multiply numbers in string
 */
import java.util.Scanner;
public class Hw11 {
    static String addL(String n1, String n2) {
        int i1 = n1.length()-1;
        int i2 = n2.length()-1;
        String b3 = "";
        int c = 0;
        while (i1 >= 0 && i2 >= 0) {
            int p = (n1.charAt(i1)-'0') + (n2.charAt(i2)-'0') + c;
            b3 = p%10 + b3;
            c = p/10;
            i1--;
            i2--;  
    }
        while (i1 >= 0) {
            int p = (n1.charAt(i1)-'0') + c;
            b3 = p%10 + b3;
            c = p/10;
            i1--;
        }   
        while (i2 >= 0) {
            int p = (n2.charAt(i2)-'0') + c;
            b3 = p%10 + b3;
            c = p/10;
            i2--;
        }
        if (c > 0)
            b3 = c+b3;
        return b3;
    }
    static String mulL(String n1, String n2) {
        int i1 = n1.length()-1;
        int i2 = n2.length()-1;
        String b3 = "", b4 = "";
        int c = 0;
        int cnt=-1;
        while (i2 >= 0){
            while (i1 >= 0) {
                int p = (n1.charAt(i1)-'0') * (n2.charAt(i2)-'0') + c;
                b3 = p%10 + b3;
                c = p/10;
                i1--;
        }
            if (c>0){
                b3=c+b3;
                c=0;
            }
                
            cnt++;
            int t=cnt;
            while (t > 0){
                b3 = b3+"0";
                t--;
                
            }
            b4 = addL(b3, b4);
            b3="";
            i2--;
            i1 = n1.length()-1;
        }

        
        return b4;
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String res, n1="", n2="";
        do { 
            System.out.println("A. Add");
            System.out.println("M. Multiply ");
            System.out.println("Q. stop ");
            
            
            System.out.println("select: ");
           
            res = in.next();
            
            switch (res.charAt(0)) {
                case 'A': case 'a':
                    System.out.print("Enter first number:");
                    n1 = in.next();
                    in.nextLine();
                    System.out.print("Enter second number:");
                    
                    n2 = in.next();
                    
                    System.out.println(addL(n1, n2));
                    
                    break;
                case 'M': case 'm':
                    System.out.print("Enter first number:");
                    n1 = in.next();
                    in.nextLine();
                    System.out.print("Enter second number:");
                    
                    n2 = in.next();
                    
                    System.out.println(mulL(n1, n2));
                    break;
                case 'q': case 'Q' :
                    System.out.print("Thank You for using this program");
                    break;
                default:
                    System.out.println("invalid");
                
                           
            }
        } while(res.toLowerCase().charAt(0)!='q');
       
    }
    
}
