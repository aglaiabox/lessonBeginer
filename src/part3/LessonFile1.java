package part3;

import part3.train.Train;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class LessonFile1 {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/aglaia/Documents/test.s");
        FileOutputStream fos = new FileOutputStream(file, true);
        fos.write("hello file".getBytes());
        fos.write(System.lineSeparator().getBytes());
        fos.write("hihihi".getBytes());
        fos.close();
    }

    public static void writeToFile(List<Train> trainList) throws Exception {
        String fileName = "/Users/aglaia/Documents/trains.s";
        File file = new File(fileName);
        FileOutputStream fos = new FileOutputStream(file);

        for (Train train: trainList) {
            String str = train.writeMe();
            fos.write(str.getBytes());
            fos.write(System.lineSeparator().getBytes());
        }
        fos.close();
        System.out.println("saved to file=" + fileName);
    }
}
