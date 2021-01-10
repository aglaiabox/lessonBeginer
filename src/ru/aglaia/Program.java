package ru.aglaia;

public class Program {
    public static void main(String[] args) {


            Employee employeeKolya = new Employee();


            Employee employeeVasya = new Employee();
            employeeVasya.name = "Vasya";
            employeeVasya.setSalary(100);
            employeeVasya.print();

            Employee employeePetia;
            employeePetia = new Employee();
            employeePetia.name = "Petya";
            employeePetia.setSalary(200);
            employeePetia.print();
            employeePetia.setSalary(299);
            employeePetia.print();
            System.out.println(employeePetia.name);

            Employee[] employees = new Employee[2];
            employees[0] = employeePetia;
            employees[1] = employeeVasya;

            int sumSalary = Employee.sumSalary(employees);
            System.out.println("сумма зарплат: "+sumSalary);

            System.out.println("Зарплата Пети: " + employeePetia.getSalary());
            employeePetia.changeSalary(50);
            System.out.println("Зарплата Пети после прибавки: " + employeePetia.getSalary());

            System.out.println("сумма зарплат: " + Employee.sumSalary(employees));

            Company laura = new Company("Laura", "221B Baker Street London");
            laura.print();

            laura.workHours = "8:00 - 16:00";
            laura.print();

            laura.setEmployees(employees);



            laura.printArray();

//TODO create Company object and add eployers to it
            // сделать метод, который при добавлении нового работника увеличивает массив
        }

    }