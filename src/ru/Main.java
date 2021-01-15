package ru;

// todo вводим какойто текст без знаком препинания набор слов с пробелами.
//  Получаем один стринг.
//  там повторяются слова, надо почситать сколько раз какое слово повторяется.
//  ЗАДАНИЕ НА МАПЫ. сделать два варианта: с мапой и без

import java.util.*;

public class Main {
   public static void main(String[] args) {
      System.out.println("введите слова");
      String str = "I have a hare I have a bear My toys are here My toys are there";
      String[] wordsArray= str.split(" ");
      ArrayList<String> listWords = new ArrayList<>();
      Map<String,Integer> mapCountWords= new HashMap<>();

      LinkedList<Integer> listCounts= new LinkedList<>();

      Integer a1 = 0;
      listCounts.add(a1);
      a1++;
      mapCountWords.put(wordsArray[0], listCounts.get(0));
      for (int i = 1; i < wordsArray.length; i++) {
         if () // через мапу проверяем есть ли в мапе это значение, если нет - добавляем новое
      }


      for (String word : wordsArray) {
         listWords.add(word);
      }
      System.out.println(listWords);



   }

}

