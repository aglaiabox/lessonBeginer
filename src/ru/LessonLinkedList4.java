package ru;

import java.util.LinkedList;


//todo В созданном списке слов экспериментальный метод fix
// будет удалять из списка строк все слова, содержащие букву «р»,
// а все слова, содержашие букву «л» — удваивать.

public class LessonLinkedList4 {
    public static void main(String[] args){
        LinkedList<String> list = LessonLinkedList3.createList();
        list.add(0, "привет");
        System.out.println(list);
fix(list);
        System.out.println(list);
    }


//    private static LinkedList<String> createList(){
//        LinkedList<String> list = new LinkedList<>();
//        list.add("рама");
//        list.add("мама");
//        list.add("мыла");
//        list.add("раму");
//        return list;
//    }

   private static LinkedList<String> fix (LinkedList<String> list){
        int listSize = list.size();
       for (int i = 0; i < listSize; i++) {
           String element = list.get(i);

           int lengthElement = element.length();
           for (int j = 0; j <lengthElement; j++) {
               char symbol=element.charAt(j);
               switch (symbol){
                   case 'р': list.remove(i);
                   listSize--;
                   break;
                   case 'л': list.add(i, element);
                   i++;
                   listSize++;
                   break;
               }
           }
       }
       return list;
   }


}

