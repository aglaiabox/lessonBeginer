package ru;

// todo вводим какойто текст без знаком препинания набор слов с пробелами.
//  Получаем один стринг.
//  там повторяются слова, надо почситать сколько раз какое слово повторяется.
//  ЗАДАНИЕ НА МАПЫ. сделать два варианта: с мапой и без

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
      System.out.println("введите слова");
      String str = "I have a hare I have a bear My toys are here My toys are there";
      String[] wordsArray= str.split(" ");
      ArrayList<String> listWords = new ArrayList<String>();

      for (String word : wordsArray) {
         listWords.add(word);
      }
      System.out.println(listWords);

      // способ без мапы: коипруем наш массив в другой массив
      for (int i = 0; i < wordsArray.length; i++) {
         int n = wordsArray.length-i;
         int quantity = 1;

            for (int j = 1; j < n; j++) {
               if (wordsArray[i] != null) {
                  if (wordsArray[i] == wordsArray[j]) {
                     quantity++;
                     wordsArray[j] = null;
                  }
               }
            }
            if (wordsArray[i]!=null) {
               System.out.println(wordsArray[i] + ": " + quantity + " occasions.");
            }
      }

   }}

