package ru.aglaia2Animals;

public abstract class Bird implements Sayable {
    String color;
    int weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void toSay(){
        System.out.println("me is bird: " + this.getClass().getName());
    }

}
