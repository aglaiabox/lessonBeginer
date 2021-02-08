package part3.furnitureShop;

import java.io.Serializable;
import java.util.Scanner;

public class Furniture implements Serializable {
    public String name;
    public int weight;
    public int quantity;
//    Material material;

    public Furniture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = getName();
        System.out.println("Enter a weight");
        int weight = scanner.nextInt();
        System.out.println("How many goods");
        int quantity = scanner.nextInt();

        this.name = name;
        this.weight = weight;
        this.quantity = quantity;

    }


    public Furniture(int quantity) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = getName();
        System.out.println("Enter a weight");
        int weight = scanner.nextInt();

        this.name = name;
        this.weight = weight;
        this.quantity = quantity;

        DataStorage.mapFurniture.put(this.name, this);

    }

    private String getName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (DataStorage.mapFurniture.containsKey(name) ){
            throw new IllegalArgumentException("this name already exist");
        }
        if (name.equalsIgnoreCase("menu") || name.equalsIgnoreCase("new") ){
            throw new IllegalArgumentException("this world can't be used as a name");
        }
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName().toString()+ ": name "+ name+", weight "+ weight+", quantity "+quantity;
    }
}
