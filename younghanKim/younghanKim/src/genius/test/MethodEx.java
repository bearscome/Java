package genius.test;

public class MethodEx {
    void one() {
        two();
        System.out.println("1");
    }
    void two() {
        three();
        System.out.println("2");
    }
    void three() {
        System.out.println("3");
    }
}
