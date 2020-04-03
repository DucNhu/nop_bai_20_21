package javabai20.excaption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            Scanner in = new Scanner(new File("text.in"));
            System.out.println("End");
        }
        catch (FileNotFoundException ex) {
            System.out.println("Not file");
        }
        finally {
            System.out.println(1+1);
        }
        System.out.println("Contennue");
    }
}
