package part3;

import java.io.*;

// todo проситать текст из файла. сделать bufferedInputStream & test by time
//  почему всегда разные данные?
public class LessonFale1Task {
    public static void main (String[] args) throws Exception {

        String nameFile = "/Users/aglaia/Documents/poem.txt";
        String nameFile2 = "/Users/aglaia/Documents/poem2.txt";

        long timeInputStream = inputStream(nameFile);
        long timeInputBuffered = inputBuffered(nameFile2);


        String str = "time buffered = "+timeInputBuffered +", time stream = "+timeInputStream;
        addStringToDoc(str);
        System.out.println(str);

// как сделать перенос строки когда записываешь в файл?
    }

    public static void countTime(){
        // можно ли сделать метод который принимает в качестве аргумента другой метод - чтобы посчитать его время
    }

    public static long inputStream(String nameFile) throws IOException{
        long start = System.currentTimeMillis();
        File file = new File(nameFile); // what is it?
        FileInputStream fileInput = new FileInputStream(file);
        int i;

        StringBuilder stringBuilder = new StringBuilder();
        while((i=fileInput.read())!= -1){
            stringBuilder.append((char)i);
        }
        System.out.println(stringBuilder);
        long finish = System.currentTimeMillis();
        System.out.print("time inputStream: ");
        System.out.println(finish-start);
        return finish-start;
    }

    public static long inputBuffered(String nameFile) throws IOException{
        long start = System.currentTimeMillis();
        File file = new File((nameFile));
        BufferedInputStream fileInput = new BufferedInputStream(new FileInputStream(file));
        int i;

        StringBuilder stringBuilder = new StringBuilder();
        while((i=fileInput.read())!= -1){
            stringBuilder.append((char)i);
        }
        System.out.println(stringBuilder);
        long finish = System.currentTimeMillis();
        System.out.print("time inputBuffered: ");
        System.out.println(finish-start);
        return finish-start;
    }

    public static void createNewDoc(String name) throws FileNotFoundException {
        String wayAndName = "/Users/aglaia/Documents/"+name;
        File file = new File(wayAndName);
        FileOutputStream fos = new FileOutputStream(file, true);

    }

    public static void addStringToDoc(String str) throws IOException{
        FileOutputStream fos = new FileOutputStream("/Users/aglaia/Documents/test.s", true);
        fos.write(str.getBytes());
        fos.close();
    }


}
