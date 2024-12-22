package method;

public class MethodCasting {
    public static void main(String[] args) {
        double num1 = 1.5;
        int num2 = 1000;

//        printNumber(num1); // double을 int에 대입하므로 컴파일 오류
        printNumber((int) num1); // 명시적 형 변환을 사용해 double을 int로 변환

        printNumber2(num2);

    }

    public static void printNumber(int num2) {
        System.out.println("num2: " + num2);
    }

    public static void printNumber2(double num2) {
        System.out.println("num2: " + num2 );
    }
}
