package part3;

import part3.train.Destination;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

//TODO 2 read trains from file
//TODO 3 print all trains sorted by timeDeparture
//TODO 5 REDO use archive

public class LessonDeserialize {
    public static void main(String[] args) throws Exception {
        init();


    }

    private static void init() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PathForLessonsFiles.path + "destinations.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        List<Destination> destinationList = (List<Destination>) o;
        System.out.println(destinationList.toString());
    }
}
