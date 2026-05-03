# Example-1
```java
class Outer1 {
    int x = 10;

    class Inner1 {
        void show() {
            System.out.println(x);
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Outer1.Inner1 i = o.new Inner1();
        i.show();
    }
}
```
# Example-2
```java
class Outer2 {
    static int x = 20;

    static class Inner2 {
        void show() {
            System.out.println(x);
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        Outer2.Inner2 i = new Outer2.Inner2();
        i.show();
    }
}
```
