package ExceptionHandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerFromFileWithThrow {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("test.txt"));
    }
}
