package part3;

import java.io.*;

public class LessonFile2 {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/aglaia/Documents/trains.s");
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String s;
        while ((s = bf.readLine()) != null){
            System.out.println(s);
        }

    }
}
