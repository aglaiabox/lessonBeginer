package ru;

import java.util.LinkedList;


//todo вносим знаменитые слова из «Букваря» в список:
// «мама», «мыла», «раму».
// После каждого слова вставляем в список строку,
// содержащую слово «именно». И выводим результат на экран.
// Каждый элемент списка — с новой строки.

public class LessonLinkedList3 {
    public static void main(String[] args){
        LinkedList<String> list = createList();
        System.out.println(list);
        addOddElements(list);
        System.out.println(list);
        printElementNewLine(list);
    }


    public static LinkedList<String> createList(){
        LinkedList<String> list = new LinkedList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        return list;
    }

    private static LinkedList<String> addOddElements (LinkedList<String> list){
        int n = list.size();
        for (int i = 1; i < (n*2); i++) {
            if ((i%2)==1){
                list.add(i, "именно");
            }
        }
        return list;
    }

    private static void printElementNewLine (LinkedList<String> list){
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println(element);
        }
    }




}

