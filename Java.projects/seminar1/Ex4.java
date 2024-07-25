package seminar1;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введи длину массива: ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введи значение массива: ");
            arr[i]=scan.nextInt();
        }

        boolean flaq = true;
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-1-i]) {
                flaq = false;
                break;
            }

        }
        if (flaq) {
            System.out.print("Массив симметричный");
        }
        else{
            System.out.print("Массив не симметричен");
        }

        System.out.print("Значения массива: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
