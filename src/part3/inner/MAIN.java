package part3.inner;

import java.util.ArrayList;
import java.util.List;

//TODO read about static
// todo read inner
// todo exersises on java lessons
public class MAIN {
    public static void main(String[] args) {
        Cow cow1 = new Cow(2);
        Cow cow2 = new Cow(3);
        List<Cow> cows = new ArrayList<>();
        cows.add(cow1);
        cows.add(cow2);

       // cows.sort(cow1.new CowComparator());
        cows.sort(new Cow.CowComparator());
        Cow.Milk milk = cow1.new Milk();
        System.out.println(milk.getVolume());
    }
}
