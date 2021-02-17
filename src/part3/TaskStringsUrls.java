package part3;

//Read file with list of URLs
        //https://www.travelski.com/guide/france
        //https://www.travelski.com/guide/france/destinations-proches
        //https://www.travelski.com/guide/france/destinations-proches/paris

// Cut base url - https://www.travelski.com/guide if not exist skip url

//Build site tree for /guide like folders structure in windows
    //level1 name
    // - /france
    // - /germany
        //level1.1
        // - /france/destinations-proches
        // - /france/destinations-proches

            //level1.1.1
            // - /france/destinations-proches/paris

//Print list of level1 (/)
//Print list of level 1.1 by prefix (/france)
//Print list of level 1.1.1 by prefix (/france/destinations-proches)

import java.io.*;
import java.util.*;


public class TaskStringsUrls {
    private static Map<String, LinkedList<String>> mapA = new HashMap<>();
    private static int qualityLines = 0;
    private static int qualitiKeys = 0;
    private static int qualityElementsInMap = 0;
    public static void main(String[] args) {
        try {
            ArrayList<String> listLines = readFile("guide_links.txt");
            sort(listLines);
//            printMapAndInf();
            System.out.println("Enter a prefix");
            Scanner scan = new Scanner(System.in);
            String prefixForPrint = scan.next();
            if (mapA.containsKey(prefixForPrint)){
                System.out.println(mapA.get(prefixForPrint));
                System.out.println(mapA.get(prefixForPrint).size());
            } else{
                System.out.println("This prefix doesn't exist. ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not exist");
        } catch (IOException exc) {
            System.out.println("error: " + exc.getMessage());
        }
    }

    private static void printMapAndInf() {
        System.out.println("quality lines: "+qualityLines);
        System.out.println("quality keys: "+qualitiKeys);
        System.out.println("quality elements in Map: " +qualityElementsInMap);
        System.out.println("map size: "+mapA.size());


        Iterator<Map.Entry<String, LinkedList<String>>> iterator=mapA.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println("Key: "+ entry.getKey());
            System.out.println("Values: "+ entry.getValue());
        }
    }

    private static ArrayList<String> readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader((new FileReader(PathForLessonsFiles.path + fileName)));
        String line = br.readLine();
        ArrayList<String> listLines = new ArrayList<>();
        while (line != null) {
            listLines.add(line);
            qualityLines++;
            line = br.readLine();
        }
        return listLines;
    }

    private static void sort(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String line = iterator.next();

            String prefixUrlRight = "/guide/";
            toWorkWithLine(line, prefixUrlRight);
        }
    }

    private static void toWorkWithLine(String line, String prefixUrlRight) {
        int checkIfUrlRight = line.indexOf(prefixUrlRight);

        if (checkIfUrlRight == 0) {
            line = line.substring(6);
            addToMap(line, "/");

            int indexOfSlash =0;
            String keyName;
            while (true){
                indexOfSlash= line.indexOf('/',indexOfSlash);
                if (indexOfSlash==-1)
                    break;
                keyName = line.substring(0,indexOfSlash);
                addToMap(line, keyName);

                indexOfSlash++;
            }
        } else {

        }
    }

    private static void addToMap(String line, String keyName) {
        if (mapA.containsKey(keyName)){
            mapA.get(keyName).add(line);
            qualityElementsInMap++;
        } else {
            LinkedList<String> listInsideMap = new LinkedList<>();
            listInsideMap.add(line);
            mapA.put(keyName, listInsideMap);
            qualitiKeys++;
            qualityElementsInMap++;
        }
    }
}


