package com.pb.kulakova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.print("Привет!Угадай число от 0 до 100: ");
        System.out.println("Для выхода из программы введите - exit.");


        Scanner scan = new Scanner(System.in);


        final int MAX_ATTEMPT = 10;
        int attempt = 0;
        int number;
        Random random = new Random();
        int x = Math.abs(random.nextInt(101));

        System.out.println("Введите число от 0 до 100");

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            number = scan.nextInt();


            if (number < 0 || number > 100) {
                System.out.println("Число не входит в диапазон");
                continue;
            }  else if (number == x) {
                System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                break;
            }  else if (number < x) {
                System.out.println("число больше");
                continue;
            }  else if (number > x) {
                System.out.println("Число меньше");
                continue;
            }

        }
        System.out.println("Конец игры!");
    }
}

   