package ru;

import java.util.LinkedList;

//todo создать список, добавить в него 5 строк.
// Затем удалить последнюю строку и вставить её в начало.
// Повторить манипуляцию 13 раз и вывести на экран содержимое списка.
public class LessonLinkedList1 {
    public static void main(String[] args){
        LinkedList<String> listFiveStrings = createList();
        System.out.println(listFiveStrings);
        for (int i = 0; i < 13; i++) {
            replaceLastToFirst(listFiveStrings);
        }

        System.out.println(listFiveStrings);

    }


    private static LinkedList createList(){
        LinkedList<String> list = new LinkedList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");
        list.add("element 5");

        return list;
    }

    private static LinkedList replaceLastToFirst(LinkedList<String> list){
        String elementLast = (String) list.getLast();
        list.addFirst (elementLast);
        list.removeLast();
        return list;
    }
}

