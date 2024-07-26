package MapExample;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people.put(1234, "Mirbek I");
        people.put(1235, "Ilim I");
        people.put(1236, "Asim I");
        people.put(1237, "Mira A");
        System.out.println(people.containsValue("Mirbek I"));
        System.out.println(people.entrySet());
        System.out.println(people.keySet());
        System.out.println(people.containsKey(1234));

    }
}
