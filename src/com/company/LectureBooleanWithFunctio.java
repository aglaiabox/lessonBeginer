package com.company;

import java.util.Scanner;

public class LectureBooleanWithFunctio {

    public static void main(String[] args) {
        boolean stopIt = true;
        while (stopIt){
             stopIt= doIt();

        }

    }

    public static boolean doIt (){
        System.out.println("put in a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean stop = true;
        if (n==777){
            System.out.println("it's right");
            stop = false;

        }
        return stop;
    }

}