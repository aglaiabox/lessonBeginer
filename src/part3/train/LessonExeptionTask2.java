package part3.train;

//TODO /* Исключение при работе с коллекциями Map
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//HashMap<String, String> map = new HashMap<String, String>(null);
//map.put(null, null);
//map.remove(null);

import java.util.HashMap;
import java.util.Map;

public class LessonExeptionTask2 {
    public static void main(String[] args) {
        try {
    Map <String, String> mapa = new HashMap<String, String>(null);

        mapa.put(null, null);
        mapa.remove(null);
    }
    catch (NullPointerException e){
        System.out.println("something wrong");
        System.out.println("Error name: "+ e.getClass().getSimpleName());
    }
}
}
