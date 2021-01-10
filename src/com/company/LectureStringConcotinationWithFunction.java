package com.company;

public class LectureStringConcotinationWithFunction {

    public static void main(String[] args) {
        String a = "tolik";
        String b = ".txt";
        a+=b;
        printIt(a);

        String c = concotinateStrings("I", "love", "you");
        printIt(c);

        System.out.println(concotinateStrings("tolik", ".txt", ""));
//        printIt(concotinateStrings("tolik", ".txt"));


        int n = 5;
        int m = 2;
        n+=m;

        printIt(n);
        System.out.print("Print it: ");
        System.out.println(n);
    }

    public static String concotinateStrings(String s1, String s2, String s3){
        String sum = s1 + " " + s2 + " " +s3;

        return sum;
    }

    public static void printIt(String s){
        System.out.print("Print it: ");
        System.out.println(s);
    }

    public static void printIt(int n){
        System.out.print("Print it: ");
        System.out.println(n);
    }
}