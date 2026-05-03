import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Watermelon");
        list.add("Lychee");
        list.add("Guava");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
