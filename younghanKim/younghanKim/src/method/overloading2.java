package method;

public class overloading2 {
    public static void main(String[] args) {

        myMethod(1, 1.2);
        myMethod(1.2, 1);

        // 매개 변수가 다른 경우도 다른 메소드로 판단하여
        // 오버로드가 가능하다.
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a: " + a + ", double b: " + b);
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a: " + a + ", int b: " + b);
    }
}
