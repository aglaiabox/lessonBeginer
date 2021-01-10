package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {


        for (int i = 1; i < 100; i++) {
            int a = i%2;
            if (a != 1) {
                System.out.print(i + " ");
            }
        }

    }

}