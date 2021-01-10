package ru;

import java.util.LinkedList;
import java.util.Scanner;


//todo создаем список строк.
// Затем — добавляем в него 10 строчек с клавиатуры.
// Самое интересное — определяем, какая строка в списке
// встретится раньше: самая короткая или самая длинная.
// Если таких строк несколько, учитываем самые первые из них.

public class LessonLinkedList2 {
    public static void main(String[] args){
        LinkedList list = createList();
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            addNewElementFromScanner(list);
        }
        System.out.println(list);
        findMinOrMaxLengthElement(list);
    }


    private static LinkedList createList(){
        LinkedList list = new LinkedList();

        return list;
    }

    private static LinkedList addNewElementFromScanner (LinkedList list){
        System.out.println("please, enter a new string for the list");
        Scanner scan = new Scanner(System.in);
        String newElement = scan.next();
        list.add(newElement);
        return list;
    }

    public static void findMinOrMaxLengthElement(LinkedList list){
        String element = (String) list.get(0);
        int length = element.length();
        int lengthMin = length;
        int indexMin = 0;
        int lengthMax = length;
        int indexMax = 0;


        for (int i = 1; i < list.size(); i++) {
            element = (String) list.get(i);
            length = element.length();
            if (lengthMin>length){
                lengthMin = length;
                indexMin = i;
            }
            else if (lengthMax<length){
                lengthMax=length;
                indexMax = i;
            }


        }

        if (indexMin<indexMax){
            System.out.println("самая короткая строка встретилась раньше");
        }
        else if (indexMax<indexMin){
            System.out.println("самая длинная строка встретилась раньше");
        }
        else {
            System.out.println("все строки равны по длинне");
        }

    }


}

