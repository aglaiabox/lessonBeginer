package part3;

import part3.furnitureShop.Material;

public class LessonEnum {
    public static final String FOLDER_PATH = "/path";

    public static void main(String[] args) {
        System.out.println(FOLDER_PATH);
        System.out.println(Material.METAL.toString());
        Material[] values = Material.values();
        Material material = values[2];
        String input = "Wood";
        while (true) {
            try {
                Material materialAgain = Material.valueOf(input.toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("not exist");
            }
        }
    }
}
