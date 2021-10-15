package com.pb.kulakova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100");
        a = scan.nextInt();

        if (a >= 0 && a <= 14) {
            System.out.println("Число из диапазона 0 - 14");
        } else if (a >= 15 && a <= 35) {
            System.out.println("Число из диапазона 15-35");
        } else if (a >= 36 && a <= 50) {
            System.out.println("Число из диапазона 36-50");
        } else if (a >= 51 && a <= 100) {
            System.out.println("Число из диапазона 51-100");
        } else{
            System.out.println("Число не входит ни в один из представленных диапазонов");
        }
        }
    }
