/*
course: CSC 190
project: Hw7
date: 10/19/17
author: Johnathan McQueen
purpose: 
 */
import java.util.Scanner;
class MyString {
    String s;
    MyString (String s) {
        this.s=s;
    }
    
String s1, r="";

    void setString(String s) {
        s1 = s;
    } 
    String getLongest() {
        int n=s1.length();
    for (int i = 0; i < n; i++){
        if (s1.charAt(i)!=',' && s1.charAt(i)!='.' )
            r += s1.charAt(i);
        
    }
    s1=r;
    n=s1.length();
    int p=0;
    String lon="";
    int j =s1.indexOf(" ");
    for (int i = 0; i < j;){
        if (j-i>p){
                p=j-i;
                lon= s1.substring(i, j);
            }
            i=j+1;
            if (s1.indexOf(" ",j+1)==-1)
                j=n;
            else
                j=s1.indexOf(" ",j+1);
    }
    return lon;
       
}
    String getLargest() {
        String larg="";
    int n=s.length();
    for (int i = 0; i < n; i++){
        if (s.charAt(i)!=',' && s.charAt(i)!='.' )
            r += s.charAt(i);
        
    }
    s=r;
    n=s.length();
    int cnt, big=0;
    int j =s.indexOf(" ");
    int l =s.indexOf(" ");
    cnt=0;

    int u;
    for (int i=0; i<j;){
        
        for (int m = 0; m < l;){
               
            if (s.substring(i, j).equalsIgnoreCase(s.substring(m, l)))
                cnt++;
            if (cnt > big){
                larg = s.substring(i, j);
                big = cnt;
                }
            
            m=l+1;
            if (s.indexOf(" ",l+1)==-1)
                l=n-1;
            else
                l=s.indexOf(" ",l+1);
        }
        i=j+1;
        if (s.indexOf(" ", j+1)==-1)
            j=n;
        else
            j= s.indexOf(" ", j+1);
        l = s.indexOf(" ");
 
}
    return larg;    
    }
    }
public class Hw7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.print("Enter phrase: ");
        s = in.nextLine();
        MyString s1;
        s1 = new MyString(s);
        s1.setString(s);
       
       
        
        
        System.out.println("Longest: "+s1.getLongest());


        System.out.println("largest: "+s1.getLargest());
}
}

