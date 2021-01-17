package part3;

import java.io.*;

// todo проситать текст из файла. сделать bufferedInputStream & test by time
//  почему всегда разные данные?
public class LessonFale1Task {
    public static void main (String[] args) throws Exception {

        String nameFile = "/Users/aglaia/Documents/poem.txt";

        inputStream(nameFile);
        inputBuffered(nameFile);


    }

    private static void inputStream(String nameFile) throws IOException{
        long start = System.currentTimeMillis();
        File file = new File(nameFile); // what is it?
        FileInputStream fileInput = new FileInputStream(file);
        int i;

        while((i=fileInput.read())!= -1){
            System.out.print((char)i);
        }
        System.out.println();
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }

    private static void inputBuffered(String nameFile) throws IOException{
        long start = System.currentTimeMillis();
        File file = new File((nameFile));
        BufferedInputStream fileInput = new BufferedInputStream(new FileInputStream(file));
        int i;

        while((i=fileInput.read())!= -1){
            System.out.print((char)i);
        }
        System.out.println();
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }

    public static void createNewDoc(String name) throws FileNotFoundException {
        String wayAndName = "/Users/aglaia/Documents/"+name;
        File file = new File(wayAndName);
        FileOutputStream fos = new FileOutputStream(file, true);

    }


}
