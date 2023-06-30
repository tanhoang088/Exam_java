package model;

import utils.Keyboard;

import java.security.Key;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Scanner;

public class Teacher extends Person {
    private double salary;
    private int workDay;

    public Teacher(int ID, String name, String phoneNumber, String address, double salary, int workDay) {
        super(ID, name, phoneNumber, address);
        this.salary = salary;
        this.workDay = workDay;
    }

    public Teacher() {
    }

    public String getSalary() {
        double finalSalary = getWorkDay() * 800000;
        return NumberFormat.getCurrencyInstance().format(finalSalary);
    }

//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public void inputTeacher(Scanner scanner) {
        System.out.print("Input ID: ");
        setID(Keyboard.keyInt(scanner));
        scanner.nextLine();
        System.out.print("\nInput Name: ");
        setName(scanner.nextLine());
        //scanner.nextLine();
        System.out.print("\nInput phone number:  ");
        setPhoneNumber(scanner.next());
        scanner.nextLine();
        System.out.print("\nInput address: ");
        setAddress(scanner.nextLine());
        //scanner.nextLine();
        System.out.print("\nInput number of work day: ");
        setWorkDay(Keyboard.keyInt(scanner));
    }

}
