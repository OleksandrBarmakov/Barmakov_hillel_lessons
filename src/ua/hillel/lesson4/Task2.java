package ua.hillel.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[30];
//        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(20);
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
