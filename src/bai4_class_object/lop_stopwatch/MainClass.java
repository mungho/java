package bai4_class_object.lop_stopwatch;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        StopWatch testSpeed = new StopWatch();
        int[] testArray = new int[100000];
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            testArray[i] = random.nextInt(10000000);
        }

        testSpeed.start();

        for (int i = 0; i < testArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < testArray.length; j++) {
                if (testArray[j] < testArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = testArray[i];
            testArray[i] = testArray[minIndex];
            testArray[minIndex] = temp;
        }

        testSpeed.stop();

        System.out.println("The speed of sort 100.000 numbers is: " + testSpeed.getElapsedTime());
    }
}
