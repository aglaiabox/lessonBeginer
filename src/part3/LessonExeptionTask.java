package part3;
//TODO create your programm to read file name from user and print this file content             DONE
//TODO if we have error on file reading - catch it and try again with new file name from user   DONE
//TODO if file length > 1kB throw some exception
//TODO handle this case and show user to try another file
// у меня не получилось посчитать размер файла и создать исключение. Потому что он считает размер несущаствующего файла
//надо вынести в отдельный метод повторяющийся код

import java.io.*;
import java.util.Scanner;

public class LessonExeptionTask {
    public static void main(String[] args) {
        printFileContent();
    }

    private static void printFileContent() {
        System.out.println("Enter a name of the file to print");
        Scanner scan = new Scanner(System.in);
        boolean toContinue = true;
        String name = null;
        while (toContinue) {
            try {
                name = scan.next();
                String fullPathName = PathForLessonsFiles.path + name;
                File file = new File(fullPathName);
                long size = file.length();
                System.out.println(file.length());// whu it reterns 0???


                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) { // выдает как ошибку, но я не понимаю почему
                    System.out.println(line);

                }

                if (size > 1) { // че-то я не поняла
                    throw new IllegalArgumentException("your file is too big");
                }

                toContinue = false;
            } catch (FileNotFoundException e) {
                try{
                    String fullPathName = PathForLessonsFiles.path + name+".txt";
                    File file = new File(fullPathName);
                    long size = file.length();
                    if (size > 1024) {

                    }

                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = br.readLine()) != null) { // выдает как ошибку, но я не понимаю почему
                        System.out.println(line);
                        toContinue = false;
                    }
                }
                catch (FileNotFoundException ec){
                    System.out.println("file not exist");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            } catch (IOException e) {
                System.out.println("something wrong");
            } finally {

            }
        }
    }

}
