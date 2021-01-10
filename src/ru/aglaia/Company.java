package ru.aglaia;

public class Company {
    Employee[] employees;
    private String name;
    private String address;
    String workHours = "null";




    public void setEmployees(Employee[]array){
        employees = array;
    }

    public Employee[] getEmployees(){
        return employees;
    }

    public void printArray () {
        for (int i = 0; i < employees.length; i++) {
            employees[i].print();
        }
    }


    public Company(){}

    public Company(String name){
        this.name = name;
    }


    public Company(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public void setName(String a){
        name = a;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void print () {
        System.out.print("Welcome to " + name + " company located in " + address + ". ");
// if (workHours.length() != 0) {
// System.out.print("We work for you: " + workHours + ". ");
// }
        switch (workHours){
            case "null":
                break;
            default:
                System.out.print("We work for you: " + workHours + ". ");
        }
        System.out.println();
    }





}
