package ru.aglaia4Dot;


//todo Написать функцию, которая находит расстояние между двумя точками в двумерном декартовом пространстве.


public class Main {
    public static void main(String[] args){
        int [] dot1 = addDot(5,7);
        int [] dot2 = addDot(12, 22);
        System.out.println(diagonal(dot1, dot2));
    }

    public static int [] addDot (int x,int y){
        int [] addDot= new int[2];
        addDot[0] = x;
        addDot[1] = y;
        return addDot;
    }

    public static int diagonal (int[] dot1, int[] dot2){
        int a = dot1[0] - dot2[0];
        int b = dot1[1] - dot2[1];
        a*=a;
        b*=b;
        int c = a+b;
        c= (int) Math.sqrt(c);
        return c;
    }
}