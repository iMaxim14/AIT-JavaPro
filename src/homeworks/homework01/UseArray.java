package homeworks.homework01;

import java.util.Arrays;

public class UseArray {
    public static void main(String[] args) {
        int[] numbers2 = new int[2000000];
        Array array = new Array(numbers2);
        array.fillOutArray();
        System.out.println("One thread result: " + array.quantityResult());

        int middle = numbers2.length / 2;

        int[] firstHalf = Arrays.copyOfRange(numbers2, 0, middle);
        int[] secondHalf = Arrays.copyOfRange(numbers2, middle, numbers2.length);

        Array array2 = new Array(firstHalf);
        Array array3 = new Array(secondHalf);

        Thread thread1 = new MyThread(array2);
        Thread thread2 = new MyThread(array3);

        System.out.println("Multithreading result: ");
        thread1.start();
        thread2.start();
    }
}
