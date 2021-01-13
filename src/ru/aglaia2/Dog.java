package ru.aglaia2;

public class Dog extends Animal{
    private static final int METABOLISM_DEFAULT = 4;

    // *************** это мы вызываем конструктор из родительского класса ****************
    public Dog(int weight, String color){
        super("dog", weight, color, METABOLISM_DEFAULT);
    }

    public Dog(String name, int weight, String color, int metabolism) {
        super(name, weight, color, METABOLISM_DEFAULT);
    }

    @Override
    public void toSay(){
        System.out.println("Afff aff");
    }

    public void toSay(String command){
        System.out.println("I'll do it: " + command);
    }
}
