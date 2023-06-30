import utils.MainFunction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = 0;
        while (true) {
            MainFunction.printMenu();
            inputNumber = sc.nextInt();
            switch (inputNumber) {
                case 1: {
                    MainFunction.input();
                    break;
                }
                case 2: {
                    MainFunction.printStudent();
                    break;
                }
                case 3: {
                    MainFunction.printTeacher();
                    break;
                }
                case 4: {
                    MainFunction.showTeacherSalary();
                    break;
                }
                case 5: {
                    MainFunction.showStudentAvgMark();
                    break;
                }
                case 6: {
                    MainFunction.sortStudent();
                    break;
                }
                case 7: {
                    MainFunction.sortTeacher();
                    break;
                }
                case 8: {
                    System.exit(0);
                }
            }
        }
    }
}