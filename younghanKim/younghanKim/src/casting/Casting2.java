package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.95;
        int intValue;

        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);

        // 기본적으로 자바는 작은 타입에 큰 타입을 대입하지 못함
        // 명시적으로 형을 변환하여 대입하여 확인은 가능
        // 강제이기 때문에 오류는 감수해야지..
    }
}
