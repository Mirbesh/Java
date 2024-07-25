/**
 * program
 */
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);
        iScanner.close();
    }
}