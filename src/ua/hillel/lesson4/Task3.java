package ua.hillel.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();

        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for(int i = 0; i<array.length; i++){
                array[i] = random.nextInt(5);
                sum += array[i];
            }
            average=sum/array.length;

            System.out.println(Arrays.toString(array));
            System.out.println("Average value: " +average);
        }


    }
}
