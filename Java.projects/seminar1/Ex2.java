package seminar1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введи итерацию");
        int n = scan.nextInt();
        int k = getK(scan, n);
        System.out.println("k = " + k);
    }

    private static int getK(Scanner scan, int n) {
        int k = 0;
        System.out.printf("Введи значение а:");
        int a = scan.nextInt();
        int b;
        for (int i = 0; i < n-1; i++) {
            System.out.printf("Введи значение b:");
            b = scan.nextInt();
            if (a > 0 && b < 0) {
                System.out.println(k);
                k++;
            }
            a = b;
        }
        return k;
    }

}
