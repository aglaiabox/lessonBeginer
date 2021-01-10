package ru.aglaia;

public class Main {
    public static void main (String[] args){
        Company laura = new Company("Laura", "221B Baker Street London");
        laura.print();

        laura.workHours = "8:00 - 16:00";
        laura.print();
        Employee[] employees = new Employee[3];


        laura.getEmployees();
        for (int i = 0; i < laura.employees.length; i++) {
            System.out.println(laura.getEmployees());
        }

//        Branch petrarka = new Branch("Petrarka", "Russia Moskow Kreml");
//        petrarka.print();
    }
}
