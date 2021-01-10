package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class LectureWhileWithFunction {

    public static void main(String[] args) {

        boolean isRightAnswer = true;
        while (isRightAnswer) {
            isRightAnswer = doJob(isRightAnswer);
//            System.out.println(isRightAnswer);
        }
    }

    public static boolean doJob (boolean stopIt){
        System.out.println("Ввдите число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n==777) {
            System.out.println("Завершено");
            stopIt = false;

        }
//        System.out.println(stopIt);
        return stopIt;
    }
}