package ru.aglaia4Dot;

//todo Написать функцию, которая находит расстояние между двумя точками в двумерном декартовом пространстве.
// Сделать y  double, а x int
// Сделать класс Точка с 2 координатами и именем точки.
// Приходит список точек и я считаю расстояние между всеми точками по очереди (от a до b, от b до c и тд)
// можно сначала сделать циклом, а потом переделать итератором

import java.util.Iterator;
import java.util.LinkedList;

public class Program {
    static LinkedList<Dot> listDots = new LinkedList<Dot>();

    public static void main (String[] args){
        Dot a = addNewDot(7,12);
        a.setName("a");
        Dot b = addNewDot(43, 23);
        b.setName("b");
        Dot c = addNewDot(56, 12);
        c.setName("c");
        Dot d = addNewDot(65, 22);
        d.setName("d");
        double res = distance(listDots);
        System.out.println(res);
        int res1 = distance(b, c);
        System.out.println(res1);
    }

    public static Dot addNewDot (int x, double y){
        Dot a = new Dot(x,y);
        listDots.add(a);
        return a;
    }

    public static double diagonalBetweenTwoDots (Dot a, Dot b){
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();


        double sideX = x2 - x1;
        double sideY = y2 - y1;
        sideX*=sideX;
        sideY*=sideY;
        double c = sideY+sideX;
        c= (double) Math.sqrt(c);
        return c;
    }

//    public static double diagonalNextDot (Dot a){
//        Iterator<Dot> iterator = listDots.iterator();
//        while (iterator.next() == a){
//            Dot second = iterator.next();
//        }
//
//        double x1 = a.getX();
//        double y1 = a.getY();
//        double x2 = b.getX();
//        double y2 = b.getY();
//
//
//        double sideX = x2 - x1;
//        double sideY = y2 - y1;
//        sideX*=sideX;
//        sideY*=sideY;
//        double c = sideY+sideX;
//        c= (double) Math.sqrt(c);
//        return c;
//    }

    public static int distance (Dot a, Dot b){
        Iterator<Dot> iterator = listDots.iterator();
        Dot dot1 = iterator.next();
        Dot dot2 = iterator.next();
        double sumDiagonals = 0;
        double diagonal;
        if (dot1 == a){
             diagonal=diagonalBetweenTwoDots(dot1, dot2);
             sumDiagonals=diagonal;
            System.out.println(dot1 + ", "+dot2+": "+diagonal);
        }
        else {
            while (iterator.hasNext() && dot2!=a){
                dot1=dot2;
                dot2= iterator.next();
                System.out.println("skip" + dot1 + "&"+dot2);
            }
        }

        while (iterator.hasNext() && dot2!=b){
            dot1 = dot2;
            dot2 = iterator.next();
            diagonal=+diagonalBetweenTwoDots(dot1,dot2);
            sumDiagonals = sumDiagonals +diagonal;
            System.out.println(dot1 + ", "+dot2+": "+diagonal);
            }
        int res = (int) sumDiagonals;
return res;
        }


    public static double distance (LinkedList<Dot> list){
        Iterator<Dot> iterator = list.iterator();
        Dot dot1 = iterator.next();
        Dot dot2 = iterator.next();
        double diagonal=diagonalBetweenTwoDots(dot1, dot2);
        double sumDiagonals=diagonal;
        System.out.println(dot1 + ", "+dot2+": "+diagonal);
        while (iterator.hasNext()){
            dot1=dot2;
            dot2= iterator.next();
            diagonal = diagonalBetweenTwoDots(dot1,dot2);
            sumDiagonals = sumDiagonals+ diagonal;
            System.out.println(dot1 + ", "+dot2+": "+diagonal);
        }
        return sumDiagonals;
    }
}