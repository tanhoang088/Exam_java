package model;

import utils.Keyboard;

import java.security.Key;
import java.util.Scanner;

public class Student extends Person {
    private String batch;
    private double mark1;
    private double mark2;

    public Student(int ID, String name, String phoneNumber, String address, String batch, double mark1, double mark2) {
        super(ID, name, phoneNumber, address);
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public Student() {
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public void inputStudent(Scanner scanner) {
        System.out.print("Input ID: ");
        setID(Keyboard.keyInt(scanner));
        scanner.nextLine();
        System.out.print("\nInput Name: ");
        setName(scanner.nextLine());
        System.out.print("\nInput phone number:  ");
        setPhoneNumber(scanner.next());
        scanner.nextLine();
        System.out.print("\nInput address: ");
        setAddress(scanner.nextLine());
        System.out.print("\nInput batch: ");
        setBatch(scanner.next());
        scanner.nextLine();
        System.out.print("\nInput first mark: ");
        setMark1(Keyboard.keyDouble(scanner));
        System.out.print("\nInput second mark: ");
        setMark2(Keyboard.keyDouble(scanner));
    }

    public double getAvgMark() {
        return (getMark1() + getMark2()) / 2;
    }
}
