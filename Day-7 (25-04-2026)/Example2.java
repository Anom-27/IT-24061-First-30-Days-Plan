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
