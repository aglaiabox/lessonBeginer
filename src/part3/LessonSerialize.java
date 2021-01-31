package part3;

import part3.train.Destination;
import part3.train.Train;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//TODO 1 save trains to file                    DONE
//TODO 4 REDO use archive  - ZipOutputStream

public class LessonSerialize {
    public static void main(String[] args) throws IOException {
        Destination newYork = new Destination("New York", "3:15");
        Destination washington = new Destination("Washington", "6:20");
        Destination chikago = new Destination("Chicago", "4:45");
        Destination orlando = new Destination("Orlando", "9:25");
        List<Destination> destinationList = new ArrayList<>();
        destinationList.add(newYork);
        destinationList.add(washington);
        destinationList.add(chikago);
        destinationList.add(orlando);

        Train a = new Train(newYork, 564738, 11, 45, 13,15);
        Train b = new Train(washington, 534537, 12, 45, 6, 20);
        Train c = new Train(newYork, 345624, 10, 14, 3, 25);
        Train d = new Train(chikago, 425375, 15, 34, 4, 45);
        Train e = new Train(orlando, 882736, 19, 00, 8, 26);
        ArrayList<Train> listTrain= new ArrayList<>();
        listTrain.add(a);
        listTrain.add(b);
        listTrain.add(c); listTrain.add(d); listTrain.add(e);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // аррай явлется заглушкой
        FileOutputStream fos = new FileOutputStream(PathForLessonsFiles.path + "destinations.bin");
        ObjectOutputStream objOut = new ObjectOutputStream(fos);// тут был byteArrayOutputStream
        objOut.writeObject(destinationList);
        fos.close();

        FileOutputStream zipFile = new FileOutputStream(PathForLessonsFiles.path +"trainsArchive.zip");
        ZipOutputStream zip = new ZipOutputStream(zipFile);
        ObjectOutputStream objOutTrains = new ObjectOutputStream(zip);
        objOutTrains.writeObject(listTrain);
        zipFile.close();
    }
}
