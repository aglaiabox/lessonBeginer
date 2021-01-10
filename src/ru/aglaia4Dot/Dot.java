package ru.aglaia4Dot;

import java.util.LinkedList;

public class Dot extends Object{
    private int x;
    private double y;
    private String name;


    public Dot (int x, double y){
        this.x=x;
        this.y=y;
    }

// I've decided to make Linked List (not Array) because we need to add and to delete elements.


    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+ ": " + x + ", " + y;
    }
}





