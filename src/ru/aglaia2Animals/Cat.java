package ru.aglaia2Animals;

public class Cat extends Animal{
    private static final int METABOLISM_DEFAULT = 3;

    public Cat(String name, int weight, String color){
        super(name, weight, color, METABOLISM_DEFAULT);
    }

    public Cat(int weight, String color){
        super("cat", weight, color, METABOLISM_DEFAULT);
    }
}