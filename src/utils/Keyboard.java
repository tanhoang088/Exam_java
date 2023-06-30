package utils;

import java.util.Scanner;

public class Keyboard {
    public static int keyInt(Scanner sc){
        int result;
        while (true){
            try {
                String input = sc.next();
                result = Integer.parseInt(input);
                return result;
            }
            catch (Exception e){
                System.out.print("Try again!");
                continue;
            }
        }

    }
    public static double keyDouble(Scanner sc){
        double result;
        while (true){
            try {
                String input = sc.next();
                result = Double.parseDouble(input);
                return result;
            } catch (Exception e) {
                System.out.print("Try again!");
                continue;
            }
        }
    }
}
