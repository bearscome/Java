package method;

public class overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1,2,3));

        // 매개변수의 개수가 다른 경우 다른 메소드로 판단하여
        // 오버로드가 가능하다.
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    };

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    };
}
