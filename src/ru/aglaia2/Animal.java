package ru.aglaia2;

public abstract class Animal implements Sayable, Coloable {
    private final int metabolism;
    String color;
    int weight;
    final String name;
//    public Animal(int weight, String color){
//        this.weight = weight;
//        this.color = color;
//    }

    //  ************ конструктор ***************
    public Animal(String name, int weight, String color, int metabolism){
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.metabolism = metabolism;
    }

    public String getName() {
        return name;
    }

    @Override
    public void toSay(){
        System.out.println("me is animal: " + this.getClass().getName());
    }

    public void toEat(int colories){
        System.out.println("my metabolism is: " + this.metabolism);
        int a = colories / metabolism;
        weight += a;
        System.out.println("new weight is: " + weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +" (my name=" + name+" weight " + weight + ") ";
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal){
            Animal animal = (Animal) obj;
            return this.name.equalsIgnoreCase(animal.name); //игнорируя большие буквы
        } else
            return false;
    }
}

