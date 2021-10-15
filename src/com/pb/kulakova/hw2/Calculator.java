package com.pb.kulakova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        double resultat = 0;
        System.out.println("Введите целое число для operand1: ");
        operand1 = scan.nextInt();
        System.out.println("Введите целое число для operand2: ");
        operand2 = scan.nextInt();
        System.out.println("Введите знак для операции + - * /: ");
        sign = scan.next();
        if (operand2 ==0 && sign.equals("/")){
            System.out.println("Ошибка: на 0 делить нельзя");
        } else {
            switch (sign) {
                case "+":
                    resultat = operand1 + operand2;
                    break;

                case "-":
                    resultat = operand1 - operand2;
                    break;

                case "*":
                    resultat = operand1 * operand2;
                    break;

                case "/":
                        resultat = operand1 / (double) operand2;
                    break;
                default:
                    System.out.println("Вы ввели не верный знак операции ");
            }
            System.out.println("Ваш результат " + resultat);
        }
    }
}