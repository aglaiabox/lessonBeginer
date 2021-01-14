package ru.aglaia2Animals;

public class Main {
    public static void main(String[] args){
        Dog dogMopps = new Dog(8, "blue");
        Dog duplicate = dogMopps;
        dogMopps.toSay();
        dogMopps.toEat(200);
        dogMopps.toSay("lie on");

        Animal someAnimal = new Dog(10, "red");
        someAnimal.toSay();

        Cat catBritish = new Cat(3, "grey");
        catBritish.toEat(200);

        Giraf girafaMarta = new Giraf(150);
        girafaMarta.toEat(20000);

        VetClinic happyLife = new VetClinic();
        happyLife.setAnimal(dogMopps);
        happyLife.printEmptyRooms();
        happyLife.setAnimal(girafaMarta);
        happyLife.setAnimal(someAnimal);
        happyLife.printOurAnimals();

    }
}
