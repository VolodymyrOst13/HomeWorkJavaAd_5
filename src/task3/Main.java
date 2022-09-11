package task3;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {

    private String info;
    private int num;
    private boolean test;

    public Main(){

    }

    public Main(String info, int num, boolean test) {
        this.info = info;
        this.num = num;
        this.test = test;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.info = "test";
        main.num = 1;
        main.test = true;

        Main main1 = new Main("text", 123, false);

        try {
            Class<?> c = Class.class;
            System.out.println("Constructors:");
            Constructor constructors[] = c.getConstructors();
            for (int i = 0; i < constructors.length; i++){
                System.out.println(" " + constructors[i]);
            }

            System.out.println("Fields:");
            Field fields[] = c.getFields();
            for (int i = 0; i < fields.length; i++){
                System.out.println(" " + fields[i]);
            }

            System.out.println("Methods: ");
            Method methods[] = c.getMethods();
            for (int i = 0; i < methods.length; i++){
                System.out.println(" " + methods[i]);
            }
        }catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
