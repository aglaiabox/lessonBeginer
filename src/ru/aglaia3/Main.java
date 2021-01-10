package ru.aglaia3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Figure figure1 = Figure.scanFigure();
        figure1.printIt();

        Figure figure2 = Figure.scanFigure();
figure2.printIt();


        figure1.equals(figure2);

    }
}
