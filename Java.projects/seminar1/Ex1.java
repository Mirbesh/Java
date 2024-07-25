package seminar1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input integer:");
        int n = scanner.nextInt();
        int result = getPrMinusSum(n);
        System.out.println("result: " + result);
    }

    private static int getPrMinusSum(int n) {
        int sum = 0;
        int pr = 1;
        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }

}
