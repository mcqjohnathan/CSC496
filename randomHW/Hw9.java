/*
course: CSC 190
project: Hw9
date: 11/02/17
author: Johnathan McQueen
purpose: Increase and decrease binary
 */
import java.util.Scanner;

class Binary {

    String b;

    void setString(String b1) {
        b = b1;
    }

    String incB(String b) {
        int n;
        String r = "";
        n = b.length() - 1;
        for (int i = n; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                r += '0';
            }
            if (b.charAt(i) == '0') {
                r = '1' + r;
                b = b.substring(0, i) + r;
                break;
            }
            if (i == 0 && b.charAt(i) == '1') {
                b = '1' + r;
            }

        }

        return b;
    }

    String decB(String b) {
        int n;
        String r = "";
        n = b.length() - 1;
        for (int i = n; i >= 0; i--) {
            if (b.charAt(i) == '1' && b.charAt(i) != 0) {
                r = '0' + r;
                b = b.substring(0, i) + r;
                break;
            }
            if (b.charAt(i) == '0') {
                r += '1';

            }
            //if (i==0 && b.charAt(i)=='0')
            //b=r;

        }
        if (b.charAt(0) == '0') {
            b = b.substring(1);
        }
        return b;
    }
}

public class Hw9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String b;
        System.out.print("Enter a binary code: ");
        b = in.nextLine();

        Binary BN;
        BN = new Binary();
        System.out.println(BN.incB(b));
        System.out.println(BN.decB(b));
    }

}
