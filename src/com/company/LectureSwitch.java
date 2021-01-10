package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LectureSwitch {

    public static void main(String[] args) {
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner scan = new Scanner(System.in);

        boolean isRightAnswer = false;
        for (int i = 0; i < 3 && !isRightAnswer; i++) {
            if (i>0) {
                System.out.println("Подумай еще!");
            }

            String answer = scan.next();
            switch (answer) {
                case "троллейбус":
                    System.out.println("Правильно!");
                    isRightAnswer=true;
                    break;

                case "сдаюсь":
                    System.out.println("Правильный ответ: троллейбус!");
                    isRightAnswer=true;
                    break;

                default:
                    break;
            }
        }

        if (!isRightAnswer) {
            System.out.println("не угадал!");
        }


        System.out.println("finish");


    }
}