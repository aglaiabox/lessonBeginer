package part3.furnitureShop;

import java.util.Scanner;

public class Chair extends Furniture{
    Boolean rocker;
    Boolean spinning;

    @Override
    public String toString() {
        String rockerInf = "";
        String spinningIng = "";
        if(rocker)
            rockerInf = ", rocker chair";
        if (spinning)
            spinningIng = ", spinning chair";
        return super.toString()+rockerInf+spinningIng;
    }

    public Chair() {
        super();
        boolean rocker = toDefineABoolean("rocker chair");
        boolean spinning = toDefineABoolean("spinning chair");
        this.rocker = rocker;
        this.spinning = spinning;
//        DataStorage.listFurniture.add(this);
        DataStorage.mapFurniture.put(name, this);
        System.out.println("chair was successfully added");
    }

    public static boolean toDefineABoolean(String name) {
        Scanner scanner = new Scanner(System.in);
        boolean toContinue = true;
        while (toContinue) {
            System.out.println("Is it a " + name+" ? 1 - yes, 2 - no");
            int ch1 = scanner.nextInt();
            if (ch1 == 1) {
                return true;
            } else if (ch1 == 2) {
                return false;
            } else {
                toContinue = true;
            }
        }
        return false;
    }
}
