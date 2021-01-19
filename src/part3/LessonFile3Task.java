package part3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//TODO read from user input replace from and replace to values поменять в тексте ага на ого (то что юзер введет)
    //TODO read some file to String (one string) and replace some characters in String (use special method class String - google it)
    //TODO save result to new file (result.txt)
        //TODO bonus if file exists create new file with name (result_datetime.txt)
public class LessonFile3Task {
    public static void main (String [] args) throws Exception{
        String text = LessonFile2Task.readToString("poem.txt");
        String textCorrecred = replaceWordsInString(text);
        System.out.println(textCorrecred);
        String nameNewDoc = "corrected_text.txt";
        LessonFale1Task.createNewDoc(nameNewDoc);
        LessonFale1Task.addStringToDoc(textCorrecred, nameNewDoc);

    }

    public static String replaceWordsInString (String text) throws Exception{
        System.out.println("Enter a word need to be replaced");
        Scanner scan = new Scanner(System.in);
        String fraseToBeReplaced = scan.next();
        System.out.println("Enter a word for replace");
        String fraseToReplace = scan.next();

        String textCorrected = text.replace(fraseToBeReplaced, fraseToReplace);
return textCorrected;
    }




}
