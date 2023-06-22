import java.util.*;

public class program2 {
    public static void main(String [] aStrings) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "one");
        db.put(2, "two");
        db.put(3, "three");
        db.put(5,"five");
        System.out.println(db);

        for (var item: db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}
