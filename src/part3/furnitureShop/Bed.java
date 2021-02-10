package part3.furnitureShop;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Bed extends Furniture{

    public int width;
    public int length;
    Mattress mattress;

    @Override
    public String toString() {
        String mattressInfo;
        if (mattress == null){
            mattressInfo = "has no mattress";
        } else {
            mattressInfo = mattress.toString();
        }
        return super.toString()+", width "+width+", length "+length+", "+mattressInfo;
    }

    public Bed() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a width and a length in centimetres");
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        this.width = width;
        this.length = length;
        int q = super.quantity;
        this.mattress = addMattressToTheBed(q);
//        DataStorage.listFurniture.add(this);
        DataStorage.mapFurniture.put(name,this);
        System.out.println("bed was successfully added");
    }

    public static Mattress addMattressToTheBed(int quantity){
        Scanner scanner = new Scanner(System.in);
        boolean toContinue = true;
        while (toContinue) {
            try {
                System.out.println("Do it come with a mattress? put 1 to choose a mattress, 2 to add a new mattress and 3 for no mattress");
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        if (DataStorage.mapMattress == null || DataStorage.mapMattress.isEmpty()) {
                            System.out.println("Sorry, there is no available mattresses in the base. Do you want to add new one? Press 2 to add new mattress and 3 for no mattress ");
                            choose = scanner.nextInt();
                            switch (choose){
                                case 2:
                                    Mattress mattress = new Mattress(quantity);
                                    return mattress;
                                case 3:
                                    System.out.println("Mattress wasn't added");
                                    return null;
                            }
                        } else {
                            return choosingMattressForBed(quantity);
                        }

                    case 2:
                        Mattress mattress = new Mattress(quantity);
                        return mattress;

                    case 3:
                        System.out.println("Mattress wasn't added");
                        return null;

                    default:
                        throw new IllegalStateException("Unexpected value: " + choose); // эта строчка добавилась автоматически почему через throw?
                }
            }
            catch (Exception e){
                System.out.println("Exception" +e.getMessage()+", try again:");

            }
        }
        System.out.println("Mattress wasn't added");
        return null;
    }



    private static Mattress choosingMattressForBed(int quantity) throws Exception {
        System.out.println("choose type of mattress: ");
        System.out.println("enter \"new\" to enter a new one");
        Scanner scanner = new Scanner(System.in);
        Iterator<Map.Entry<String, Mattress>> iterator = DataStorage.mapMattress.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Mattress> entry = iterator.next();
            System.out.println("enter " + entry.getKey() + " for " + entry.getValue());
        }
        String chooseMat = scanner.nextLine();
        if (chooseMat.equalsIgnoreCase("new")) {
            Mattress mattress = new Mattress(quantity);
            return mattress;
        }

        if (!DataStorage.mapMattress.containsKey(chooseMat)){
            throw new Exception("Illegal enter");
        }

        Mattress mat = DataStorage.mapMattress.get(chooseMat); //
        mat.quantity = mat.quantity + quantity;
        return mat;
    }



}
