package part3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;





public class LessonException {
    public static void main(String[] args) {

        try {
            doSomething();
        } catch (IOException r){
            System.out.println("error oi oioioi " + r.getMessage());
        }

        testRuntime();

        System.out.println("we are alive");
    }

    private static void doSomething() throws IOException {

        System.out.println("hi!");
        List<String> allLines = Files.readAllLines(Paths.get(PathForLessonsFiles.path + "poem222.txt"));

        System.out.println("Still working...");


    }

    private static void testRuntime() {
        boolean toContinue = true;

        while (toContinue){
            try {
                System.out.println("Enter number:");
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();

                n = 555 / n;
                System.out.println(n);

                if (n > 100){
                    throw new IllegalArgumentException("your number is too low");
                }
                toContinue = false;

            } catch (InputMismatchException e) {
                System.out.println("your input is not good");
            } catch (ArithmeticException e) {
                System.out.println("go home and study math");
                toContinue = false;
            } catch (Exception e){
                System.out.println("all other cases are here e=" + e.getMessage());
            }
        }


    }
}
