package ua.hillel.lesson3;

public class Task3 {
    public static void main(String[] args) {
        int a = 3, b = -9;
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);

        if (a1 <= b1) {
            System.out.println("Абсолютное  число '3' меньше абсолюьного числа '-9'");
        }   else {
            System.out.println("Абсолютное  число '3' больше абсолюьного числа '-9'");
        }
    }
}
