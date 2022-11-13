package ua.hillel.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter value: ");

        int i= new Scanner(System.in).nextInt();

        if(i % 2 ==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");

        System.out.println(i);
        System.out.println("BYE");

    }
}
