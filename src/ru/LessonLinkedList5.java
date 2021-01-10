package ru;

import java.util.LinkedList;
import java.util.Scanner;


//todo составим список из 10 слов. Введём их с клавиатуры.
// Наша задача состоит в том, чтобы проверить,
// является ли список упорядоченным по возрастанию длины строки.
// Если нет, выводим на экран номер первого элемента,
// нарушающего такую упорядоченность.

public class LessonLinkedList5 {
    public static void main(String[] args) {
        LinkedList<String> list = createListFromScanner();
        verificationStringLength(list);
    }


    public static LinkedList<String> createListFromScanner() {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("please, enter 10 words for making a list");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String stingFromScanner = scan.next();
            list.add(stingFromScanner);
        }
        return list;
    }

    private static int verificationStringLength(LinkedList<String> list) {
        String element1 = list.get(0);
        String element2 = list.get(1);
        int indexOfElement = 0;

        for (int i = 2; i < list.size(); i++) {
            if (element1.length() < element2.length()) {
                element1 = element2;
                element2 = list.get(i);
                if (i == 9) {
                    System.out.println("List is ordered by the increase in length of the string");
                }
            } else if (element1.length() >= element2.length()) {
                indexOfElement = i;
                System.out.println(indexOfElement);
                break;
            }

        }

        return indexOfElement;
    }


}
//    a1 a12 a123 a1234 a12345 a123456 a1234567 a12345678 a123456789 a1234567890
