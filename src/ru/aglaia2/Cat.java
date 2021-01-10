package ru.aglaia2;

public class Cat extends Animal{
    private static final int METABOLISM_DEFAULT = 3;

    public Cat(int weight, String color){
        super(weight, color, METABOLISM_DEFAULT);
    }

}