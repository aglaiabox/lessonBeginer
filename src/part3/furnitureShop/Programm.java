package part3.furnitureShop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

// Есть магаз, который торгует мебелью. Моя программа запускается.
// Это конссольный аналог управления магазином.
// Постоянно находится в цикле и спрашивает действия (инструкция - меню по цифрам
// 1 добавить новый товар, 2 удалить товар, 3 задать количество товара, 4 сохранить данные (товары и их количество) в файл (во время запуска программы я загружаю  все товары из этого файла в программу), 5 вывести инфу по товарам (из программы)
// товары - разные типы мебели (3-4). Вес, материал (материал - это класс, *), название, производитель, категория (спальные, кухонные, гостинные). Тип - это разные классы.
//Особенности: у кровати длина и ширина, при этом кровать может хранить ссылку на другой товар: матрас. У матраса особенность - толщина
// у стула особенность качающийся (булевое значение тру фолс) и крутящийся (булевое значение)
// Материал - это класс, к оторого два свойста: вид и цвет. Новый материал добавить
// введите новый товар -- 1 0 стул, 2 - кровать и тп вписок. Для стола введите тото и тото
public class Programm {
    private static ArrayList<Material> listMaterial;
    private static ArrayList<Furniture> listFurniture;
    private static ArrayList<Matrass> listMattrass;
//    private static Map<Integer, Matrass>;

public static void main (String[] args){
    boolean toContinue = true;
    Scanner scan = new Scanner(System.in);

    while (toContinue) {
        System.out.println("Choose an action:");
        System.out.println("1 - add a new good");
        System.out.println("2 - delete a good");
        System.out.println("3 - add new material");
        System.out.println("4 - save dates");
        System.out.println("5 - print goods information");
        int choose = scan.nextInt();
        switch (choose){
            case 1:
                addNewFurniture();
                break;
            case 2:
                System.out.println("temporary unavailable");
                break;
            case 3:
                System.out.println("temporary unavailable");
                break;
            case 4:
                System.out.println("temporary unavailable");
                break;
            case 5:
                System.out.println("temporary unavailable");
                break;
            default:
                System.out.println("illegal argument");
        }

    }
}

private static void addNewFurniture () {
    System.out.println("press 1 for adding a bed, for adding a chair, 3 for adding a mattress; 9 for coming to the main menu");
    Scanner scan = new Scanner(System.in);
    int choose = scan.nextInt();
    boolean toContinue = true;
    while (toContinue){
        toContinue = false;
    switch (choose) {
        case 1:
            addBed();
            break;
        case 3:addNewMattress();
            break;

        default:
            System.out.println("illegal argument, try again.");
            toContinue = true;
    }
    }
    }

    private static void addBed (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name of the bed");
        String name = scanner.nextLine();
        System.out.println("Enter a weight");
        int weight = scanner.nextInt();
        System.out.println("How many ");
        int quantity = scanner.nextInt();
        System.out.println("Enter a width and a length in centimetres");
        int width = scanner.nextInt();
        int length = scanner.nextInt();





        Bed bed = new Bed(name, weight, quantity, width, length);
        listFurniture.add(bed);
    }

    private static void doBedHaveAMattress(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Do it come with a mattress? put 1 for yes and 2 for not");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("choose mattress: ");
                Iterator iterator = listMattrass.iterator();
                while (iterator.hasNext()){
                    int n= 1;
                    System.out.println("press" + n + "for choosing "+ iterator.next());
                    n++;
                }
                int chMat = scanner.nextInt();
                //мы получили матрас. Этот матрас надо поймать, вернуть и добавить к кровати



        }
    }

    private static void chooseMattressForBed(){
    Scanner scanner = new Scanner(System.in);

    }

    private static Matrass addNewMattressToBed (){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name of the chair");
        String name = scanner.nextLine();
        System.out.println("Enter a weight");
        int weight = scanner.nextInt();
        Matrass mat = new Matrass(name,weight,1);
        listMattrass.add(mat);
        return mat;
    }

    private static Matrass addNewMattress (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name of the chair");
        String name = scanner.nextLine();
        System.out.println("Enter a weight");
        int weight = scanner.nextInt();
        System.out.println("How many mattresses?");
        int quantity = scanner.nextInt();
        Matrass mat = new Matrass(name,weight,quantity);
        listMattrass.add(mat);
        return mat;
    }

    private static void addChair (){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name of the chair");
        String name = scanner.nextLine();
        System.out.println("Enter a weight");
        int weight = scanner.nextInt();
        System.out.println("How many ");
        int quantity = scanner.nextInt();
    }
}

