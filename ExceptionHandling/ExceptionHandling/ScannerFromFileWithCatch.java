package ExceptionHandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerFromFileWithCatch {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("D:\\Java\\Tung_Neo\\src\\ExceptionHandling\\test.txt"));
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
