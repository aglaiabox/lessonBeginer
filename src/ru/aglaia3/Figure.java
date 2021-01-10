package ru.aglaia3;

import java.util.Scanner;

public abstract class Figure {
    String type;
    int square;

    public abstract int toCalculateSquare ();

    public void getFigure() {
    }

    public static Figure scanFigure (){
        Figure figure=null;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            System.out.println("PLease, make you chose: 1 for circle, 2 for rectangle:");
            int chouse = scan.nextInt();

            if (chouse == 1) {
                System.out.println("Enter the radius:");
                int radius = scan.nextInt();
                figure = new Circle(radius);
//                System.out.println(figure.toCalculateSquare());
            } else if (chouse == 2) {
                System.out.println("Enter the length side a: ");
                int a = scan.nextInt();
                System.out.println("Enter the length side b: ");
                int b = scan.nextInt();
                figure = new Rectangle(a, b);
//                System.out.println(figure.toCalculateSquare());
            } else {
                System.out.println("Error. Try again");
                i--;
            }
        }
        return figure;
    }

    public void printIt () {
        System.out.println(toString() + " with square area "+ toCalculateSquare());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Figure) {
            Figure figure = (Figure) obj;
            int n = figure.toCalculateSquare();
            int m = this.toCalculateSquare();
                if (n==m) {
                    System.out.println("Figures squares are equal");
                    return true;
                }
                else {
                    System.out.println("Figures squares aren't equal");
                    return false;
                }
        } else {
            return false;
        }

    }
}
