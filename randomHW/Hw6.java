/*
course: CSC 190
project: Hw6
date: 10/11/17
author: Johnathan McQueen
purpose: This Java program takes a rectangle and a circle, then determines if 
they are disjoint, the circle lies completely inside the rectangle, the 
rectangle lies completely inside the circle, or they overlap
 */
import java.util.Scanner;

public class Hw6 {

    static float getDis(float p1x, float p1y, float p2x, float p2y) {

        return (float) Math.sqrt((p2x - p1x) * (p2x - p1x) + (p2y - p1y) * (p2y - p1y));
    }

    static String getAns(float d1, float d2, float d3, float d4, float d5, float p1x, float p1y, float p2x, float p2y, float cx, float cy, float r) {

        if (p1x <= cx - r && cx + r <= p2x && p2y <= cy - r && cy + r <= p1y) {
            return "Circle inside Rectangle";
        }
        if (r >= d1 && r >= d2 && r >= d3 && r >= d4) {
            return "rectangle inside Circle";
        }

        if (d1 > r && d2 > r && d3 > r && d4 > r) {
            if (cx - r > p2x || cx + r < p1x || cy + r < p2y || cy - r > p1y) {
                return "disjoint1";
            }
            if (cx - r < p1x && cy - r > p2y && cx + r < p2x && cy + r < p1y) {
                return "overlap";
            }
            if (d1 > r && d1 < d5 && Math.max(d4, d2) == d4 && cx < p1x) {
                return "disjoint2";
            }
            if (d2 > r && d2 < d5 && Math.max(d1, d3) == d3 && cx > p2x) {
                return "disjoint3";
            }
            if (d3 > r && d3 < d5 && Math.max(d2, d4) == d2 && cx < p1x) {
                return "disjoint4";
            }
            if (d4 > r && d4 < d5 && Math.max(d3, d1) == d1 && cx > p2x) {
                return "disjoin5";
            }
            if (cx - r < p2x && cx + r > p1x || cy + r > p2y && cy - r < p1y) {
                return "overlapping";
            }

        }

        return "overlapping";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p1x, p1y, p2x, p2y, cx, cy, r;

        System.out.println("Enter p1x");
        p1x = in.nextFloat();
        System.out.println("Enter p1y");
        p1y = in.nextFloat();

        System.out.println("Enter p2x");
        p2x = in.nextFloat();
        System.out.println("Enter p2y");
        p2y = in.nextFloat();

        System.out.println("Enter cx");
        cx = in.nextFloat();
        System.out.println("Enter cy");
        cy = in.nextFloat();
        System.out.println("Enter radius");
        r = in.nextFloat();

        float d1, d2, d3, d4, d5;
        d1 = getDis(p1x, p1y, cx, cy);
        d2 = getDis(p2x, p1y, cx, cy);
        d3 = getDis(p1x, p2y, cx, cy);
        d4 = getDis(p2x, p2y, cx, cy);
        d5 = getDis(cx, cy, cx - r, cy + r);

        System.out.println(getAns(d1, d2, d3, d4, d5, p1x, p1y, p2x, p2y, cx, cy, r));

    }

}
