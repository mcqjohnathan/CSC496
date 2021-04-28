/*
course: CSC 190
project: Hw8
date: 10/26/17
author: Johnathan McQueen
purpose: Set up a class named MyCipher.  The class will have an integer variable named key.
Provide steps in the main method to test each method of MyCipher class by including the following steps:
Read a key;
Read a plain text and print the encoded cipher text;
Read a cipher text and print the decoded plain text;
 */
import java.util.Scanner;

class MyCipher {
    int key = 0;
    String e = " abcdefghijklmnopqrstuvwxyz";
    String q = " zyxwvutsrqponmlkjihgfedcba";
    void setKey(int k) {
        key = k;
    }
    String encode(String p) {
        int n, r;
        String a="";
        
        n = p.length();
        
        for (int i = 0; i < n; i++){
            r = e.indexOf(p.charAt(i))+key;
            r = r%27;
            a += e.charAt(r);
        }
        return a;
    }
    String decode(String c){
        int n, r;
        n = c.length();
        String a="";
        
        for (int i = 0; i < n; i++){
            r = e.indexOf(c.charAt(i))-key;
            if(r<0){
                r = r%27*-1;
                a += q.charAt(r);
            }
            else  {
                r = r%27;
            
            a += e.charAt(r);
            }
        }
        return a;
    }
}
public class Hw8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p, c;
        int k;
        System.out.print("Enter your name(fname lname): ");
        p = in.nextLine();
        System.out.print("Enter a String to decode: ");
        c = in.nextLine();
        System.out.print("Enter Key: ");
        k = in.nextInt();
        
        MyCipher MC;
        MC = new MyCipher();
        MC.setKey(k);
        
        System.out.println(MC.encode(p));
        System.out.println(MC.decode(c));
        
        
        
        
        
        
        
    }
    
}
