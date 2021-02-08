package part3.furnitureShop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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
                            System.out.println("Sorry, there is no available mattresses in the base. We are starting a process of adding a new one: ");
                            return creatingMattress(quantity);
                        } else {
                            return choosingMattressForBed(quantity);
                        }

                    case 2:
                        return creatingMattress(quantity);

                    case 3:
                        System.out.println("Mattress wasn't added");
                        toContinue =false;

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

    public static Mattress creatingMattress(int quantity) {
        Mattress mat = new Mattress(quantity);
        return mat;
    }



    private static Mattress choosingMattressForBed(int quantity) throws Exception {
        System.out.println("choose type of mattress: ");
        System.out.println("enter \"new\" to enter a new one");
        Scanner scanner = new Scanner(System.in);
        //TODO how to use iterator with map  DONE
        return DataStorage.chooseFurniture(DataStorage.mapMattress);
    }

//    private static Mattress chooseFurniture(int quantity, Scanner scanner) throws Exception {
//        Iterator<Map.Entry<Integer, Mattress>> iterator = DataStorage.mapMattress.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer, Mattress> entry = iterator.next();
//            System.out.println("enter " + entry.getKey() + " for " + entry.getValue());
//        }
//        int chooseMat = scanner.nextInt();
//        if (chooseMat==0)
//            return creatingMattress(quantity);
//
//        if (!DataStorage.mapMattress.containsKey(chooseMat)){
//            throw new Exception("Illegal enter");
//        }
//
//        Mattress mat = DataStorage.mapMattress.get(chooseMat); // todo mapMattress !contains key repeat
//        mat.quantity = +quantity;
//        return mat;
//    }


}
