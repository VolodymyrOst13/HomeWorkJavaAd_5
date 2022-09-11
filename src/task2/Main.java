package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Class<?> c = Integer.class;
        Class<?> c1 = Double.class;
        Class<?> c2 = String.class;
        Class<?> c3 = Boolean.class;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Select information about which class you want to display: " +
                    "\n 1. Integer.class" +
                    "\n 2. Double.class" +
                    "\n 3. String.class" +
                    "\n 4. Boolean.class" +
                    "\n 0. Exit" +
                    "\n" +
                    "\n Enter number ");
            int value = sc.nextInt();
            if (value == 1) {
                System.out.println(c);
            } else if (value == 2) {
                System.out.println(c1);
            } else if (value == 3) {
                System.out.println(c2);
            } else if (value == 4) {
                System.out.println(c3);
            }else if (value >= 4){
                System.out.println("Invalid number");
            } else if (value == 0) {
                break;
            }
            System.out.println();

        }
    }
}
