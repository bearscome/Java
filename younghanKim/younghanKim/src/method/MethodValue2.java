package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeValue(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1);

        /**
         * 자바는 항상 변수의 값을 복사해서 대입한다.
         * 참조형 변수에 있는 값인 참조 값도 복사한다.
         * */
    }

    public static int changeValue(int num2) {
        num2 = num2 * 2;

        return num2;
    }
}
