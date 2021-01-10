package ru.aglaia3;

public class Rectangle extends Figure{
    int lengthSideA;
    int lengthSideB;

    public Rectangle (int a,int b){
        lengthSideA = a;
        lengthSideB = b;

    }
    @Override
    public int toCalculateSquare (){
        square = lengthSideA*lengthSideB;
        return square;
    }
}
