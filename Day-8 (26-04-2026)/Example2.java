import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Arisu");
        map.put(2, "Usagi");
        map.put(3, "Chisiya");

        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
