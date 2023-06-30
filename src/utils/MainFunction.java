package utils;

import model.Person;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFunction {
    static List<Person> listPerson = new ArrayList<>();

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose 1 to input Teacher or 2 to input Student: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                Teacher teacher = new Teacher();
                teacher.inputTeacher(sc);
                listPerson.add(teacher);
                break;
            }
            case 2: {
                Student student = new Student();
                student.inputStudent(sc);
                listPerson.add(student);
                break;
            }
        }
    }

    public static void printStudent() {
        System.out.println("***** List of Student *****");
        for (int i = 0; i < listPerson.size(); i++) {
            if (listPerson.get(i) instanceof Student) {
                System.out.println("ID: " + listPerson.get(i).getID() +
                        " | Name: " + listPerson.get(i).getName() +
                        " | Phone Number: " + listPerson.get(i).getPhoneNumber() +
                        " | Address: " + listPerson.get(i).getAddress() +
                        " | Batch: " + ((Student) listPerson.get(i)).getBatch());
            }
        }
        System.out.println("       **********");
    }

    public static void printTeacher() {
        System.out.println("***** List of Teacher *****");
        for (int i = 0; i < listPerson.size(); i++) {
            if (listPerson.get(i) instanceof Teacher) {
                System.out.println("ID: " + listPerson.get(i).getID() +
                        " | Name: " + listPerson.get(i).getName() +
                        " | Phone Number: " + listPerson.get(i).getPhoneNumber() +
                        " | Address: " + listPerson.get(i).getAddress());
            }
        }
        System.out.println("      **********");
    }

    public static void sortStudent() {
        List<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < listPerson.size(); i++) {
            if (listPerson.get(i) instanceof Student) {
                listStudent.add((Student) listPerson.get(i));
            }
        }
        for (int i = 0; i < listStudent.size(); i++) {
            listStudent.sort((o1, o2) ->
                    String.valueOf(o1.getAvgMark()).compareTo(String.valueOf(o2.getAvgMark())));
        }
        System.out.println("***** List of Student *****");
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("ID: " + listStudent.get(i).getID() +
                    " | Name: " + listStudent.get(i).getName() +
                    " | Batch: " + listStudent.get(i).getBatch() +
                    " | Average Mark: " + listStudent.get(i).getAvgMark());
        }
        System.out.println("      **********");
    }

    public static void sortTeacher() {
        List<Teacher> listTeacher = new ArrayList<>();
        for (int i = 0; i < listPerson.size(); i++) {
            if (listPerson.get(i) instanceof Teacher) {
                listTeacher.add((Teacher) listPerson.get(i));
            }
        }
        for (int i = 0; i < listTeacher.size(); i++) {
            listTeacher.sort((o1, o2) ->
                    o1.getName().compareTo(o2.getName()));
        }
        System.out.println("***** List of Teacher *****");
        for (int i = 0; i < listTeacher.size(); i++) {
            System.out.println("ID: " + listTeacher.get(i).getID() +
                    " | Name: " + listTeacher.get(i).getName());
        }
        System.out.println("      **********");
    }

    public static void showTeacherSalary() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.print("Input ID of teacher to show salary: ");
        while (check == false){
            int inputID = sc.nextInt();
            for (int i = 0; i < listPerson.size(); i++) {
                if (listPerson.get(i).getID() == inputID) {
                    if (listPerson.get(i) instanceof Teacher) {
                        System.out.println("ID: " + listPerson.get(i).getID() +
                                " | Name: " + listPerson.get(i).getName() +
                                " | Salary: " + ((Teacher) listPerson.get(i)).getSalary() + "VND");
                        check = true;
                    } else {
                        System.out.println("Wrong ID! Input again: ");
                    }
                }
            }
        }

    }

    public static void showStudentAvgMark() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.println("Input ID of student to show average mark:");
        while (check == false){
            int inputID = sc.nextInt();
            for (int i = 0; i < listPerson.size(); i++) {
                if (listPerson.get(i).getID() == inputID) {
                    if (listPerson.get(i) instanceof Student) {
                        System.out.println("ID: " + listPerson.get(i).getID() +
                                " | Name: " + listPerson.get(i).getName() +
                                " | Average Mark: " + ((Student) listPerson.get(i)).getAvgMark());
                        check  = true;
                    } else System.out.println("Wrong ID!");
                }
            }
        }

    }

    public static void printMenu() {
        System.out.println("\n====== MENU =====");
        System.out.println("1. Input teacher or student");
        System.out.println("2. Print all of student");
        System.out.println("3. Print all of teacher");
        System.out.println("4. Show salary of a teacher");
        System.out.println("5. Show average mark of a student");
        System.out.println("6. Print list of student sorted by average mark");
        System.out.println("7. Print list of teacher sorted by name");
        System.out.println("8. EXIT.");
        System.out.println("==========");
        System.out.print("Input your choice: ");
    }
}
