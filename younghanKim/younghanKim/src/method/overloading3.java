package method;

public class overloading3 {
    public static void main(String[] args) {
        add(1, 11);
        add(1.2, 1.2);

        // 만약 add(int, int)가 없을 경우
        // add(1, 11)는 형변환을 통해
        // add(double, double)을 호출한다.
    }

    public static void add(int a, int b) {
        System.out.println("int a: " + a + ", double b: " + b);
    }

    public static void add(double a, double b) {
        System.out.println("double a: " + a + ", int b: " + b);
    }
}
