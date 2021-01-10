package ru;

// TODO: Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
//  Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
//  Замерьте время, которое потрачено на это.
//  Сравните результаты и предположите, почему они именно такие.


import java.util.*;

public class LessonCurrentTime {
    public static void main(String[] args){
        List linkedList= new LinkedList();
        addMillionRandomElements(linkedList, 1000000);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1000000));
        List arrayList = new ArrayList();
        addMillionRandomElements(arrayList, 1000000);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1000000));

        chooseElements(linkedList, 100000);
        chooseElements(arrayList, 100000);

    }

    private static List addMillionRandomElements (List list, int quantity){
        Random random = new Random();
        quantity++;
        int i = 0;
        Iterator iterator = list.iterator();
        while (i<quantity){
            list.add(random.nextInt(2147483647));
            i++;
        }
        return list;
    }

    private static void chooseElements (List list, int quantity){
        long start = System.currentTimeMillis();
        Random random = new Random();
        quantity++;
        int i = 0;
        while (i<quantity){
            list.get(random.nextInt(list.size()));
            i++;
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
    }


}
