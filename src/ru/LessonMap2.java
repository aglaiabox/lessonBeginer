package ru;

// todo вводим какойто текст без знаком препинания набор слов с пробелами.
//  Получаем один стринг.
//  там повторяются слова, надо почситать сколько раз какое слово повторяется.
//  ЗАДАНИЕ НА МАПЫ. сделать два варианта: с мапой и без

import java.util.HashMap;
import java.util.Map;

public class LessonMap2 {
   public static void main(String[] args) {
      System.out.println("введите слова");
      String str = "I have a hare I have a bear My toys are here My toys are there";
      String[] arrayWords= str.split(" ");
      printArray(arrayWords);

      Map<String,Integer> mapA= new HashMap<>();

      for (int i = 0; i < arrayWords.length; i++) {
         if (mapA.containsKey(arrayWords[i])){
            int n = (Integer) mapA.get(arrayWords[i]);
            n++;
            mapA.put(arrayWords[i], n);

         } else {
            int n = 1;
            mapA.put(arrayWords[i], n);

         }
      }
      System.out.println(mapA);

    }
      public static void printArray (String[] array){
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

         }System.out.println();
   }


}

