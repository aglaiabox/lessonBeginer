package part3.inner;

import java.util.Comparator;

public class Cow {
    private int weight;

    public Cow(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public class Milk {
        private final int volume;

        public Milk() {
            volume = weight * 2;
        }

        public int getVolume() {
            return volume;
        }
    }

    public static class CowComparator implements Comparator<Cow>{
        @Override
        public int compare(Cow o1, Cow o2) {
            return o2.weight - o1.weight;
        }
    }
}
