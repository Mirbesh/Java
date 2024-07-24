package les2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n = getN();
        String Result = getResult(n);
        System.out.println(Result);
    }

    private static int getN() {
        System.out.println("Введите четное число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n % 2 != 0) {
            System.out.println("Введите четное число: ");
            n = scan.nextInt();
        }
        return n;
    }

    // private static String getResult(int n) {
    //     String line1 = "c1";
    //     String line2 = "c2";
    //     String Result = "";
    //     for (int i = 0; i < n; i++) {
    //         if (i % 2 == 0) {
    //             Result += line1;
    //         } else {
    //             Result += line2;
    //         }

    //     }
    //     return Result;
    // }
    private static String getResult(int n) {
        String line1 = "c1";
        String line2 = "c2";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {         
            sb.append(line1).append(line2);
        }
        return sb.toString();
    }
}
