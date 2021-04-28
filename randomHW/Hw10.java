/*
course: CSC 190
project: Hw10
date: 11/09/17
author: Johnathan McQueen
purpose: Declare and implement a class named RunLengthCode.  This class will 
have the following methods: compress(String p); // compresses plain text p to 
cipher text c using the run-length coding method, where each letter appearing 
successively 3 or more times will be replaced by one occurrence of the letter 
followed by its count. If p = "abbbcc", then it should return "ab3cc", for example.
decompress(String c); // decompresses c back to p. "ab3cc" will be decompressed 
to "abbbcc".
 */
import java.util.Scanner;

    class RunLengthCode {
        
       String compress(String p) {
            String c="";
            int cnt=0;
            int j;
            for (int i = 0; i<p.length();i++) {
                c+= p.charAt(i);
                for (j = i; j < p.length();j++){
                    if (p.charAt(i)!=p.charAt(j))
                        break;
                    cnt += 1;
  
                }
                if (cnt >= 3){
                    c += cnt;
                    i=j-1;
                }
                
                cnt=0;
                    
            }
            return c;
        }
       String decompress(String c) {
           String p="";
           int z=0;
           for (int i = 0; i<c.length();i++) {
               if (c.charAt(i)-'0' >= 0 && c.charAt(i)-'0'<=10) {
                   int j=i;
                   while( j<c.length()) {
                       if (c.charAt(j)-'0' >= 0&& c.charAt(j)-'0'<10){ 
                           z*=10;
                           z+=c.charAt(j)-'0';
                           j++;
                       }
                       else
                           break;
                   }
                    while (z>= 2){
                        p += c.charAt(i-1);
                        z--;    
                    }
               }
               else
                   p+=c.charAt(i);
             z=0;  
           }
           return p;
       }
    }
public class Hw10 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p, c, res;
        
        RunLengthCode RC;
        
        RC = new RunLengthCode();

        do { 
            System.out.println("1. Compress");
            System.out.println("2. decompress ");
            System.out.println("3. stop ");
            
            
            System.out.println("select: ");
           
            res = in.next();
            
            switch (res.charAt(0)) {
                case '1':
                    System.out.print("Enter String to compress: ");
                    in.nextLine();
                    p = in.nextLine();
                    System.out.println(RC.compress(p));
                    break;
                case '2':
                    System.out.print("Enter String to decompress: ");
                    in.nextLine();
                    c = in.nextLine();
                    System.out.println(RC.decompress(c));
                    break;
                case '3':
                    System.out.print("Thank You for using this program");
                    break;
                default:
                    System.out.println("invalid");
                
                           
            }
        } while(res.toLowerCase().charAt(0)!='3');
    }
    
}
