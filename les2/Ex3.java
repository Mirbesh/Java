package les2;
import java.util.Scanner;;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        boolean flag = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Полиндром");
        }
        else {
            System.out.println("Не полиндром");
        }
    }
}
