package lessons.override_overload;

public class DemoOverload {

    void go() {
        System.out.println("Go");
    }

    void go(int a) {
        System.out.println(a);
    }

    String go(String str) {
        return str;
    }

    int go(int x, int y) {
        return x + y;
    }

}