package com.pb.kulakova.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        int count = 0;

        System.out.println("Заполните массив 10-ю целыми числами через запятую: ");
        String[] line = scanner.next().split("\\s*,\\s*", 10);
        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(line[i]);

        System.out.println("Массив заполнен:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(" ");
        System.out.println("Сумма чисел массива = " + sum);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                count++;
        }
        System.out.println("Количество положительных элементов = " + count);

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("Отсортировано: " + Arrays.toString(array));
    }
}


