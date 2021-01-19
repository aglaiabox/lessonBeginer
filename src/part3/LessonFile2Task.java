package part3;

import java.io.*;
import java.util.LinkedList;

public class LessonFile2Task {




    public static void main(String[] args) throws Exception {
        //todo read file with some russian text using FileInputSreame
        //todo read file with some russian text using BufferedReader
//        inputBuffered("russianpoem");
//        inputStream("poem.txt");


        //todo read all file to list of string (by lines)           Done
        //todo read all file to 1 string                            Done
//        String a = readToString("trains.s");
//        System.out.println(a);
//        LinkedList<String> list = readToList("trains.s");
//        System.out.println(list);

        //todo add stop word to text and read
String textUntilStopWord = readUntilStopWord("poem3.txt", "playhouse");
        System.out.println(textUntilStopWord);
        }
        // The proper exception handling - what is it?

        private static String readUntilStopWord (String name, String stopWord) throws Exception{
        String wayAndName = "/Users/aglaia/Documents/"+name;
        InputStream inputStream = new FileInputStream(wayAndName);
        Reader isr = new InputStreamReader(inputStream);
        int i = isr.read();
        while (i !=-1){
            char ch = (char) i;
            while (i !=)
            i = isr.read(); // почему это можно здесь, а можно засунуть в усоловие while
        }
        isr.close();

//        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//            String s;
//            StringBuilder line = new StringBuilder();
//            StringBuilder word = new StringBuilder();
//            String w = null;
//            String textUntilStopWord = null;
//            while ((s = bf.readLine()) != null) {
//                if (s != " ") {
//                    word.append(s);
//                    w = word.toString();
//                    System.out.println(w);
//                    System.out.println("//");
//                } else if (s == " "){
//                    if (w != stopWord) {
//                        line.append(w);
//                        line.append(' ');
//                    } else {
//                        line.append(w);
//                        textUntilStopWord = line.toString();
//                        break;
//
//                    }
//                }
//            }
//return textUntilStopWord;
        }

    public static void inputBuffered (String name) throws Exception {
        String wayAndName = "/Users/aglaia/Documents/" + name;
        File file = new File(wayAndName);
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String s; //почему стринг а не инт?
        while ((s = bf.readLine()) != null) {
            System.out.println(s); // почему println печатает не букву на строчку?
        }
    }


    private static void inputStream (String name) throws Exception{
        String wayAndName = "/Users/aglaia/Documents/"+name;
        File file = new File(wayAndName);
        FileInputStream fis = new FileInputStream(file);
        int i;
        while ((i = fis.read()) != -1){
            System.out.print((char) i);
        }
    }



    public static String readToString (String name) throws Exception {
        String wayAndName = "/Users/aglaia/Documents/" + name;
        File file = new File(wayAndName);
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String s;
        StringBuilder line = new StringBuilder();
        while ((s = bf.readLine()) != null) {
            line.append(s);
            line.append('\n');
        }
        String res = line.toString();
        // как добавить пробелы между строчками?
        return res;
    }

    public static LinkedList readToList (String name) throws Exception{
        String wayAndName = "/Users/aglaia/Documents/" + name;
        File file = new File(wayAndName);
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        LinkedList<String> list= new LinkedList<>();
        String s;
        while ((s = bf.readLine()) != null){
            list.add(s);
        }
        return list;
    }

    }

