package part3.furnitureShop;

// todo Есть магаз, который торгует мебелью. Моя программа запускается.
// todo Это конссольный аналог управления магазином.
//  Постоянно находится в цикле и спрашивает действия (инструкция - меню по цифрам
//  1 добавить новый товар, 2 удалить товар, 3 задать количество товара, 4 сохранить данные (товары и их количество) в файл (во время запуска программы я загружаю  все товары из этого файла в программу), 5 вывести инфу по товарам (из программы)
//  товары - разные типы мебели (3-4). Вес, материал (материал - это класс, *), название,
//  *** производитель, категория (спальные, кухонные, гостинные). Тип - это разные классы. use enum
//  *** Мне не удалось сделать общий метод по перебору фурнитуры и матраса, это приведение классов с котоым я не справилась
//  Особенности: у кровати длина и ширина, при этом кровать может хранить ссылку на другой товар: матрас. У матраса особенность - толщина
//  у стула особенность качающийся (булевое значение тру фолс) и крутящийся (булевое значение)
//  *** Материал - это класс, к оторого два свойста: вид и цвет. Новый материал добавить USE ENUM
//  введите новый товар -- 1 0 стул, 2 - кровать и тп вписок. Для стола введите тото и тото

// read enumeration enum and do class material through enum
// сделать компоратор и проранжировать мебель по весу (добавить пункт меню)
// прочитать про serialased id и понять как сделать чтобы было ok

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        DataStorage.getAllData();
        mainMenu();

    }

    public static void mainMenu() {
        boolean toContinue = true;
        Scanner scan = new Scanner(System.in);

        while (toContinue) {
            try {
                System.out.println("Choose an action:");
                System.out.println("1 - add a new good");
                System.out.println("2 - delete a good");
                System.out.println("3 - add new material");
                System.out.println("4 - save dates");
                System.out.println("5 - print goods information");
                int choose = scan.nextInt();
                switch (choose) {
                    case 1:
                        addNewFurniture();
                        break;
                    case 2:
                        DataStorage.deleteOne(DataStorage.mapFurniture);
                        break;
                    case 3:
                        System.out.println("temporary unavailable");
                        break;
                    case 4:
                        DataStorage.saveAllData();
                        break;
                    case 5:
                        DataStorage.printInf(DataStorage.mapFurniture.values());
                        DataStorage.printInf(DataStorage.mapMattress.values());
                        break;
                    default:
                        System.out.println("illegal argument");
                }
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage()+". Try again: ");
            }
            catch (Exception e){
                System.out.println(e.getMessage()+". Try again: ");
            }

        }
    }

    public static void addNewFurniture() {
        boolean toContinue = true;
        while (toContinue) {
            try {
            System.out.println("press 1 to add a bed, 2 to add a chair, 3 to add a mattress; 9 to return to the main menu");
            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt();

            toContinue = false;
            switch (choose) {
                case 1:
                    Furniture bed = new Bed();
                    break;
                case 2:
                    Chair chair = new Chair();
                    break;
                case 3:
                    Mattress mat = new Mattress();
                    break;
                case 9:
                    mainMenu();
                    break;

                default:
                    System.out.println("illegal argument, try again.");
                    toContinue = true;
            }

            }
            catch (Exception e){
                System.out.println(e.getMessage()+". Try again: ");
            }
        }
    }
}


