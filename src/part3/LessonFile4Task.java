package part3;
// todo прочитать текст из файла,
//  разбить его по словам,
//  отсортировать в алфавитном порядке и
//  сохранить в другой файл

import java.io.*;
import java.util.*;

//todo читаю текст из файла и делаю словарь -
// чтобы пользователь вводит букву и
// получает все слова на эту букву. Использовать hash map

// Удалить цифры?
public class LessonFile4Task {
    public static Map<Character, ArrayList<String>> mapa = new HashMap<>();
    public static void main(String[] args) throws Exception{
        String text = readFile("poem.txt");
        String text1 = deleteDoubleSpases(text);
        System.out.println(text);

        String[] wordsInAlphaberOrder = sortWordsInAlphaberOrder(text1);

        writeToFile(wordsInAlphaberOrder, "sortedWords.txt");


// делаю словарь -  пользователь вводит букву и получает все слова на эту букву.
//        addWordsToMapa(text1);
//        System.out.println("Enter a letter");
//        Scanner scan = new Scanner(System.in);
//        String st = scan.next();
//        char ch = st.charAt(0);
//        System.out.println( mapa.get(ch));
    }

    private static void writeToFile(String[] wordsInAlphaberOrder, String fileName) throws IOException {
        File file = new File(PathForLessonsFiles.path+fileName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < wordsInAlphaberOrder.length; i++) {
        bw.write(wordsInAlphaberOrder[i]);
        bw.write("\n");}
    }

    private static String[] sortWordsInAlphaberOrder(String text1) {
        String[] words = text1.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = deletePunctuations(words[i]);
//            System.out.println(words[i]);
        }
        Arrays.sort(words);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        return words;
    }

    private static void addWordsToMapa(String text) {
        String [] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words [i];
            char firstLetter = word.charAt(0);
            firstLetter = Character.toLowerCase(firstLetter); // ignore case for the key
            System.out.println(firstLetter);

            word = deletePunctuations(word);

            if (!mapa.containsKey(firstLetter)){
                ArrayList<String> listWordsOneFirstLetter = new ArrayList<>();
                listWordsOneFirstLetter.add(word);
                mapa.put(firstLetter,listWordsOneFirstLetter);
                System.out.println("New letter " +firstLetter+" was created. "+"Word "+word+" was added to dictionary. ("+i+"/"+words.length );
            } else {
                ArrayList<String>listWordsOneFirstLetter = mapa.get(firstLetter);
                listWordsOneFirstLetter.add(word);
                System.out.println("Letter " +firstLetter+" even exist. "+"Word "+word+" was added to dictionary. ("+i+"/"+words.length);

            }
        }
    }

    private static String deletePunctuations(String word) {
        int indexLastLetter = word.length() - 1;
        char lastSymbol = word.charAt(indexLastLetter);
        if (lastSymbol == ',' || lastSymbol == '.' || lastSymbol == ':' || lastSymbol == ';' || lastSymbol == '"' || lastSymbol == '-'|| lastSymbol == ')') {
            word = word.substring(0, indexLastLetter);
        }

        char firstSymbol = word.charAt(0);
        if (firstSymbol == '"' || firstSymbol == '(' || firstSymbol == '-') {
            word = word.substring(1);
        }
        return word;
    }

    private static String readFile(String name) throws IOException {
        File file = new File(PathForLessonsFiles.path + name);
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String st;
        while ((st = br.readLine()) != null){
        stringBuilder.append(st);
//        stringBuilder.append(" ");
        }
        String text = stringBuilder.toString();
        return text;
    }

    private static String deleteDoubleSpases (String text){
        StringBuffer stringBuffer = new StringBuffer(text);
        for (int i = 0; i < stringBuffer.length(); i++) {
            int iNext = i+1;
            char ch = stringBuffer.charAt(i);
            if (ch == ' '){
                char chNext = stringBuffer.charAt(iNext);
                if (chNext == ' '){
                    stringBuffer.deleteCharAt(iNext);
                }

            }
        }
        text = stringBuffer.toString();
        return text;
    }
}
