package part3;

import part3.train.ComparatorDepartureTime;
import part3.train.Destination;
import part3.train.Train;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

//TODO 2 read trains from file                      DONE
//TODO 3 print all trains sorted by timeDeparture   DONE
//TODO 5 REDO use archive

public class LessonDeserialize {
    public static void main(String[] args) throws Exception {
        init();
        System.out.println(intrains());
        System.out.println(sortByTimeDepartment(intrains()));

    }

    private static void init() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PathForLessonsFiles.path + "destinations.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        List<Destination> destinationList = (List<Destination>) o;
        System.out.println(destinationList.toString());
    }

    private static List<Train> intrains() throws IOException, ClassNotFoundException{
        FileInputStream fisTr = new FileInputStream(PathForLessonsFiles.path +"trains.bin");
        ObjectInputStream ois = new ObjectInputStream(fisTr);
        Object o = ois.readObject();
        List<Train> trainsList = (List<Train>) o;
        return trainsList;
    }

    private static List<Train> sortByTimeDepartment (List<Train> listTrain){
        ComparatorDepartureTime comparatorDepartureTime = new ComparatorDepartureTime();
        listTrain.sort(comparatorDepartureTime);
        return listTrain;
    } //забыла про компоратор. Надо еще заданий на компоратор и итератор

//    private static List<Train> unarchiveTrains (){
//
//    }

}
