package ua.hillel.lesson3;

import java.util.Scanner;

public class Task2_IF_ELSE {
    public static void main(String[] args) {
        System.out.println("Enter number of month");

        int i = new Scanner(System.in).nextInt();

        int j = 1, f = 2, m = 3, ap = 4, ma = 5, june = 6, july = 7, au = 8, s = 9, o = 10, n = 11, d = 12;
        if (j == 1) {
            System.out.println("January");
        } else {
            System.out.println("dfsdfsdf");
        }
        if (f == 2) {
            System.out.println("February");
        }
        if (m == 3) {
            System.out.println("March");
        }
        if (ap == 4) {
            System.out.println("April");
        }
        if (ma == 5) {
            System.out.println("May");
        }
        if (june == 6) {
            System.out.println("June");
        }
        if (july == 7) {
            System.out.println("July");
        }
        if (au == 8) {
            System.out.println("August");
        }
        if (s == 9) {
            System.out.println("September");
        }
        if (o == 10) {
            System.out.println("October");
        }
        if (n == 11) {
            System.out.println("November");
        }
        if (d == 12) {
            System.out.println("December");
        }
        else {
            System.out.println("Not a valid month");
        }
    }
}
