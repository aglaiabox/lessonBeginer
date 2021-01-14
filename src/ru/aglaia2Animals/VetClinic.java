package ru.aglaia2Animals;

public class VetClinic {
    private Animal slot1;
    private Animal slot2;
    private Animal slot3;
    int emptyRooms = 3;

// ************* Сеттер  - от англ. "set", "устанавливать"*************
    public void setAnimal(Animal a){
        if (slot1==null){
            slot1 = a;
            emptyRooms--;
            System.out.println(slot1 + " admitted to our clinic");
        }
        else if (slot2 == null){
            slot2 = a;
            emptyRooms--;
            System.out.println(slot2 + " admitted to our clinic");
        }
        else if (slot3 == null){
            slot3 = a;
            emptyRooms--;
            System.out.println(slot3 + " admitted to our clinic");
        }
        else {
            System.out.println("Sorry, clinique is full.");
        }
    }

    public void printEmptyRooms (){
        System.out.println("There are " + emptyRooms + " animals in our clinique.");
    }

    public void printOurAnimals (){
        System.out.println("Animals in our clinique: " +
                "room1: "+ slot1 +
                "room2: "+ slot2 +
                "room3: "+ slot3 + ("."));

    }
}

// todo сделать трех животных, сделать класс вет клиника и засетить этих трех животных в ветклинику