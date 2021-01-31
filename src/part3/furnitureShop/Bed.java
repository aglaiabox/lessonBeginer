package part3.furnitureShop;

import java.util.Scanner;

public class Bed extends Furniture{

    public int width;
    public int length;
    Matrass matrass;

    public Bed(String name, int weight,int quantity, int width, int length) {
        super(name, weight, quantity);
        this.width = width;
        this.length = length;
        this.quantity = quantity;
    }

}
