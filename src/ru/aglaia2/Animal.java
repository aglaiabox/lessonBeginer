package ru.aglaia2;

public abstract class Animal implements Sayable, Coloable {
    private final int metabolism;
    String color;
    int weight;

//    public Animal(int weight, String color){
//        this.weight = weight;
//        this.color = color;
//    }

    //  ************ конструктор ***************
    public Animal(int weight, String color, int metabolism){
        this.weight = weight;
        this.color = color;
        this.metabolism = metabolism;
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
        return this.getClass().getSimpleName() +" (my weight " + weight + ") ";
    }
}

