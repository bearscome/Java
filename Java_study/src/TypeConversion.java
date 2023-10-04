public class TypeConversion {
    public static void main(String[] arg)  {
//        double a = 3.0F;
//        System.out.println(a);

        // 자동 형 변환
        // float를 명시해도 double로 타입을 지정하면 자동적으로 float에서 double로 타입을 변경함
        // float보다 double이 더욱 큰 실수를 가질 수 있기 때문에
        // 데이터의 손실이 없기 때문에

//        float b = 3.0;
//        System.out.println(b);
        // 실수 뒤에 아무 것도 없으면 자동으로 double형으로 변환된다.
        // float을 명시 후 double형 데이터를 대입하니, 오류를 리턴한다.

        // [!]자동 형 변환의 원칙은 표현 범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 하용된다
        // byte -> [short, char] -> int -> long -> float -> double

        int c = 3;
        float d = 1.0F;
        double e = c + d;

        System.out.println(e);

//        float a = 100.0;
//      float를 명시하지 않아서 오류 남
//        int b = 100.0F;
//      int에 float 값을 대입하여 오류 남


//        float a = (float) 100.0;
//        float a = 100.0F;
//        1. 첫 번째 코드는 double 타입의 값을 float 타입으로 명시적으로 형 변환 한다.
//        2. 두 번째 코드는 float 타입의 값을 직접 할당한다.
//        일반 적으로, float 타입의 변수에 float 타입의 값을 할당 하는 것이 좋다.
//        double 타입의 값을 float 타입으로 형 변환하면, 소수점 이하 자릿수가 잘릴 수 있기 떄문이다.
    }
}
