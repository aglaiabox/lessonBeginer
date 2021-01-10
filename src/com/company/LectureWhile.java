package com.company;

public class LectureWhile {

    public static void main(String[] args) {
        int n = 7;
        int goal = 98;
        int res = 0;
        while (res < goal) {
            System.out.print((res+=n) + "  ");
        }
        System.out.println("finish");
    }
}
