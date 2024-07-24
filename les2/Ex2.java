package les2;

public class Ex2 {
    public static void main(String[] args) {
        String data = "aaaabbcddd";
        StringBuilder result = getResString(data);
        System.out.println(result.toString());
    }

    private static StringBuilder getResString(String data) {
        StringBuilder result = new StringBuilder();
        result.append(data.charAt(0));
        for (int i = 0; i < data.length()-1; i++) {
            if (data.charAt(i)!=data.charAt(i+1)) {
                result.append(data.charAt(i+1));
            }
        }
        return result;
    }
}
