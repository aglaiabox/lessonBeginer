package ru.aglaiaLinkedList;

import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;
import ru.aglaia2Animals.Animal;
import ru.aglaia2Animals.Cat;
import ru.aglaia2Animals.Dog;
import ru.aglaia2Animals.Giraf;

public class Main {
    public static void main(String[] args){
        MyLinkedList<Animal> list = createList();
        System.out.println(list);
        Animal animal = list.get(1);
        System.out.println(animal);
//        list.delete(dogMopps);
        list.delete(2);
        System.out.println(list);

        MyLinkedList<Car> listOfCars = new MyLinkedList<>();
        listOfCars.add(new SportCar());
        listOfCars.add(new Lorry());
        Car car = listOfCars.get(1);


    }

    private static MyLinkedList<Animal> createList() {
        Dog dogMopps = new Dog(8, "blue");
        Cat catMurzik = new Cat(4, "blue");
        Giraf girafMarfa = new Giraf(225);

        MyLinkedList<Animal> list = new MyLinkedList<>();
        list.add(dogMopps);
        list.add(catMurzik);
        list.add(girafMarfa);
        return list;
    }
}
