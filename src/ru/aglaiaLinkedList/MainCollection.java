package ru.aglaiaLinkedList;

import ru.aglaia2Animals.Animal;
import ru.aglaia2Animals.Cat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainCollection {
    public static void main(String[] args) {
        List<Animal> myAnimalList = new ArrayList<>();
//        myAnimalList.add(new Dog(8, "blue");
        myAnimalList.add(new Cat(4, "blue"));

        Iterator<Animal> iterator = myAnimalList.iterator();
    }
}
