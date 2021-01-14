package ru;

import ru.aglaia2Animals.Animal;
import ru.aglaia2Animals.Cat;
import ru.aglaia2Animals.VetClinic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LessonMap {
    public static Map<String, Animal> animalMap = new HashMap<>();
    public static Map<Animal, VetClinic> vetclinicMap = new HashMap<>();
    public static Map<Integer, Animal> animalsByWeight = new HashMap<>();

    public static void main(String[] args) {

        Cat catVas = new Cat("vas", 12,"blue" );
        Cat catPet = new Cat("pet", 12,"blue" );
        Cat catMurka = new Cat("murka", 12,"blue" );
        Cat catMurka2 = new Cat("murka", 12,"blue" );

        animalMap.put(catVas.getName(), catVas);
        animalMap.put(catPet.getName(), catPet);
        animalMap.put(catMurka.getName(), catMurka);
        VetClinic clinic = new VetClinic();

        vetclinicMap.put(catMurka, clinic);

        print("vas4");

        //boxing & unboxing
        int i = 4;
        Integer iObj = i; // ссылается не на инт, а создает объект и туда запихивает наш инт
        int a = iObj;

        List<Integer> arrayWithNumbers = new ArrayList<>();
        int[] arraysOfInt = new int[5];

    }

    public static void print (String name){
        if (!animalMap.containsKey(name)){
            System.out.println("not exist");
        } else {
            Animal animal = animalMap.get(name);
            System.out.println(animal);
        }
    }
}

// todo прочитать: Map,
// todo прочитать: equals HashCode
// todo прочитать: boxing unboxing

// todo сделелать в программе с трейнами сделать мапу, которая хранит трейны по номеру поезда.
//  И еще функцию, которой я передаю номер поезда и печатаю по номеру поезда
// todo add map train by destination
// todo method print train by destination name from this map
//todo bonus: add map trains by desination те ключем являетяс дестинейшен, а значением является список