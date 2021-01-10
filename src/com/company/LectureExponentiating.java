package com.company;

import java.util.Scanner;

public class LectureExponentiating {

    public static void main(String[] args) {
        // *********** ПЕРВЫЙ ВАРИАНТ КАК ВОЗВОДИТЬ ЧИСЛО В СТЕПЕНЬ ************
        Scanner scan = new Scanner(System.in);
        System.out.println("введите два целых числа");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a;
        for (int i = 1; i < b; i++) {
            res *= a;
        }

        System.out.println(res);

//         *********** ВОЗВОДИМ ЧИСЛО В СТЕПЕНЬ ПРИ ПОМОЩИ ФУНКЦИЙ СОБСТВЕННОГО НАПИСАНИЯ (СМ НИЖЕ) ************
        int a1 = enterANumber();
        int b1 = enterANumber();
        printExponentNumbers(a1, b1);

    }
        public static int enterANumber () {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите целое число");
            int n = scan.nextInt();
            return n;
        }

        public static void printExponentNumbers ( int n, int m){
            int res = n;
            for (int i = 1; i < m; i++) {
                res *= n;
            }
            System.out.println(n + " возвести в степень " + m + " = " + res);
        }


    }


