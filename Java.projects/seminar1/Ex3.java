package seminar1;

public class Ex3 {
    public static void main(String[] args) {
        String str = "qwert";
        String result = str.substring(str.length() / 2) + str.substring(0, str.length() / 2);
        System.out.println("Result: " + result);
    }
}
