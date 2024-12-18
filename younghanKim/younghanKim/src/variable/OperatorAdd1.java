package variable;

public class OperatorAdd1 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증감시키고 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 1;

        a = 1;
        b = 0;

        b = a++; // a의 현재 값을 b에 대입하고, 그 후 a 값을 증감 시킴
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 1

        a++;
        ++a;
        // 변수에 대입하지 않으면 동일한 연산
    }
}
