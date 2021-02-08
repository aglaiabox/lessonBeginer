package part3.furnitureShop;

import java.io.Serializable;

public class Mattress extends Furniture {


    public Mattress() {
        super();
        DataStorage.mapMattress.put(name, this);
        System.out.println("mattress was successfully added");
    }

    public Mattress(int quantity) {
        super(quantity);
        DataStorage.mapMattress.put(name, this);
        System.out.println("mattress was successfully added");
    }


}
