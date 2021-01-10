package ru.aglaia3;

public class Circle extends Figure{
    int radius;

    public Circle( int r){
        radius = r;
    }




    @Override
    public int toCalculateSquare (){
        double s = radius*radius*3.14; // как округлить дабл в интеджер?
        square = (int)s;
        return square;
    }

}
