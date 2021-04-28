/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johnathan McQueen
 */
import java.util.Scanner;
public class Hw9a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p, a="";
        String e = " abcdefghijklmnopqrstuvwxyz";
        String q = " zyxwvutsrqponmlkjihgfedcba";
        int k, n, r=0, c;
        System.out.print("Enter phrase to be coverted to cipher text: ");
        p = in.nextLine();
        
        System.out.print("Enter Key: ");
        k = in.nextInt();
       
        
       /* n = p.length();
        
        for (int i = 0; i < n; i++){
            r = e.indexOf(p.charAt(i))+k;
            r = r%27;
            a += e.charAt(r);
        }
        System.out.println(n);*/
        System.out.println(27%27);
        
        n = p.length();
        
        for (int i = 0; i < n; i++){
            r = e.indexOf(p.charAt(i))-k;
            if(r<0){
                r = r%27*-1;
                a += q.charAt(r);
            }
            else  {
                r = r%27;
            
            a += e.charAt(r);
            }
        }
System.out.println(a);
        
    }
    
}
