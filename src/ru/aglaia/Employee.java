package ru.aglaia;

public class Employee {
    String name;
    private int salary;
    int position;

    public int getSalary (){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
        position++;
    }

    public int changeSalary (int n){
        salary+=n;
        return salary;
    }


    public void print(){
        System.out.println("Me: " + name + " and my salary: " + salary + " position: " + position);
    }

    public static int sumSalary(Employee[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++){
            int n = array[i].getSalary();
            sum+=n;
        }
        return sum;
    }
}

