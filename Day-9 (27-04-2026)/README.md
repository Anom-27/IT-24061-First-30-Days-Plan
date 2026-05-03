# Example-1
```java
import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);

        for (int num : list) {
            System.out.println(num);
        }
    }
}
```
# Example-2
```java
import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("X");
        list.add("Y");
        list.addFirst("Start");
        list.addLast("End");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
```
