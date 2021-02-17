package part3;

//Read file with list of URLs
        //https://www.travelski.com/guide/france
        //https://www.travelski.com/guide/france/destinations-proches
        //https://www.travelski.com/guide/france/destinations-proches/paris

// Cut base url - https://www.travelski.com/guide if not exist skip url

//Build site tree for /guide like folders structure in windows
    //level1
    // - /france
        //level1.1
        // - /france/destinations-proches
            //level1.1.1
            // - /france/destinations-proches/paris

//Print list of level1 (/)
//Print list of level 1.1 by prefix (/france)
//Print list of level 1.1.1 by prefix (/france/destinations-proches)

import java.io.*;
import java.util.*;

//3 Сделать класс лист с всеми первого уровня.
// берет ссылку, читает до слеша. Создает объект класса: имя до слеша и лист таких же объектов
// печатает
public class TaskStringsUrls {
    private static Map<String, String> mapA = new HashMap<>();
public static void main (String[] args){
    try{
        ArrayList<String> listLines = readFile("guide_links.txt");

        String line = "/guide/equipement/vetements/chaussettes-ski";
        String[] lineArray = line.split("/");
        if (lineArray[0] == )
    }
    catch (FileNotFoundException e){
        System.out.println("file not exist");
    }
    catch (IOException exc){
        System.out.println("error: "+exc.getMessage());
    }
}

private static ArrayList<String> readFile(String fileName)throws IOException {
    BufferedReader br = new BufferedReader((new FileReader(PathForLessonsFiles.path+fileName)));
    String line = br.readLine() ;
    ArrayList<String> listLines = new ArrayList<>();
    while (line != null){
        System.out.println(line);
        listLines.add(line);
        line= br.readLine();
    }
    System.out.println("list: "+listLines);
    return listLines;
}

private static void sort (ArrayList<String> list){
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()){
        String line = iterator.next();
        String[] lineArray = line.split("/");
        if (lineArray[0]!="/guide/"){
            continue;
        } else {
            line
        }
        for (int i = 1; i < lineArray.length; i++) {
            if (!mapA.containsKey(lineArray[i])){

            }
        }

    }
}


}


