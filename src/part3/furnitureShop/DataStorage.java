package part3.furnitureShop;

import part3.PathForLessonsFiles;

import java.io.*;
import java.util.*;

public class DataStorage {
    public static Map<String, Mattress> mapMattress = new HashMap<>();
    public static Map<String, Furniture> mapFurniture = new HashMap<>();

    public static String fileFurnitureMapName = PathForLessonsFiles.path+"furnitureMapa.txt";
    public static String fileMattressesName = PathForLessonsFiles.path+"mattressesMapa.txt";
    public static String fileMattressesName1 = PathForLessonsFiles.path+"mattresses.txt";


    public static Map<Integer, Mattress> mapMattress1 = new HashMap<>();

    public static void copyMap(){
        Iterator<Map.Entry<Integer, Mattress>> iter = mapMattress1.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<Integer,Mattress> entry = iter.next();
            mapMattress.put(entry.getValue().name, entry.getValue());
        }
        System.out.println(mapMattress);
    }

    public static void saveAllData (){
        saveData(fileMattressesName, mapMattress);
        saveData(fileFurnitureMapName, mapFurniture);
        saveData(fileMattressesName1, mapMattress1);
        System.out.println("Data were saved");
    }

    private static void saveData(String fileName, Object obj){
        try {
            File file = new File(fileName);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fos);
            objOut.writeObject(obj);
            fos.close();

        }
        catch (IOException e) {
            System.out.println("Error, data haven't been stored: "+ e.getMessage());

        }
    }

    public static void getAllData (){
        try{
        mapMattress1 = (Map<Integer, Mattress>) getData(fileMattressesName);
        mapFurniture = (Map<String, Furniture>) getData(fileFurnitureMapName);
        }

        catch (ClassCastException e){
            System.out.println("Error, illegal format of data: " +e.getMessage());
        }
        catch (IOException | ClassNotFoundException e) {
        System.out.println("Error, data haven't been received: "+e.getMessage());

        } catch (Exception e) {
            System.out.println("Something wrong with getting data: "+e.getMessage());

        }

    }

    public static Object getData(String fileName) throws Exception{

            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            return o;

    }

    public static void printInf(Collection collection){
        Iterator<Furniture> iter = collection.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next()+"; ");
        }
    }

    public static void deleteOneMattresses (){
//        deleteOne((Furniture)mapMattress);
//        todo QUESTION как в этом случае привести объекты матрасс к фурнитуре
        // todo как найти связь с кроватью. Ведь если мы удаляем со склада матрас, он должен пропадать от кровати
        // todo или он должен быть неудаляем
    }

    public static void deleteOne (Map <String, Furniture> map)throws Exception{
        System.out.println("Enter a name of furniture to delete: ");
        Furniture f = chooseFurniture(map);
        System.out.println("How many goods to delete?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        if (quantity<0){
            throw new IllegalArgumentException("quantity can't be a negative");
        } else if (f.quantity == quantity){
            map.remove(f.name); // todo QUESTION корректно ли так обращаться к объекту в карте
            System.out.println("Object was successful removed: "+f);
        } else if (f.quantity < quantity){
            f.quantity =-quantity;
            System.out.println("Left: "+f);
        }else {
            System.out.println("something went wring");
            Programm.mainMenu();
        }
    }

    public static Furniture chooseFurniture(Map <String, Furniture> map) throws Exception {
        Iterator<Map.Entry<String, Furniture>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Furniture> entry = iterator.next();
            System.out.println("enter " + entry.getKey() + " for " + entry.getValue());
        }
//        if (iterator.next().getValue() instanceof Mattress){
//            System.out.println("Enter \"new\" to create new mattress");
//        } else {
        System.out.println("Enter \"menu\" to interrupt and come back to the main menu");

        Scanner scanner = new Scanner(System.in);
        String chooseMat = scanner.nextLine();
        if (chooseMat.equalsIgnoreCase("menu")){
            return null;
        }
//        if (chooseMat.equalsIgnoreCase("new"))
//            return Bed.creatingMattress(quantity);

        if (!DataStorage.mapMattress.containsKey(chooseMat)){
            throw new Exception("Illegal enter, there is no furniture with this name. ");
        } else {
            return map.get(chooseMat);
        }
    }

}
