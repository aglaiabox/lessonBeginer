package ru.aglaia2;

public class MainInterface {
    public static void main(String[] args) {
        Animal cat1 = new Cat(10, "blue");
        Bird bird1 = new Govorun();
        bird1.setColor("grey");

        Sayable[] array = {cat1, bird1};
        sayAll(array);
    }

    public static void sayAll(Sayable[] array){
        for (int i = 0; i < array.length; i++) {
            Sayable obj = array[i];
            obj.toSay();
        }
    }

    public static void colorAll(Coloable[] array){
        for (int i = 0; i < array.length; i++) {
            Coloable obj = array[i];
            obj.getColor();
        }
    }
}
