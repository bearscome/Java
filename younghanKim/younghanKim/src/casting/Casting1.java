package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = longValue;
        System.out.println("doubleValue = " + doubleValue);
        // 작은 타입에서 넓은 타입으로 변수를 대입할 수 있다.
        // 큰 타입을 작은 타입으로 변수를 대입할 수 없다.
        // 자바는 변수에 같은 타입을 대입할 수 있는데, 형 변환은 자바에서 자동으로 해준다.
        // - 자동 형변환
        // longValue = (long) intValue;

    }
}
