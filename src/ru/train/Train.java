package ru.train;
// TODO: Создайте класс Train, содержащий поля:
//  название пункта назначения, номер поезда, время отправления.

public class Train {
    private String destinationName;
    private int number;
    private int timeDeparture;

    public Train(String destinationName, int number, int timeDeparture){
        this.destinationName = destinationName;
        this.number = number;
        this.timeDeparture=timeDeparture;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(int timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    @Override
    public String toString() {
        return "train to "+destinationName+", number "+number+", time of departure is "+timeDeparture;
    }

//    public int compareTo (Train train){
//        if (this.number == train.number){
//            return 0;
//        } else if(this.number < train.number){
//            return -1;
//        } else {
//            return 1;
//        }
//    }
}
