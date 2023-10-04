public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b);
//      (int 10)/ (int) 3 = 3으로 남는다 int는 정수이기 때문에 소수점 뒤 데이터 손실이 일어난다
        System.out.println(c/d);
//      (float 10) / (float 3) = 3.333~ float는 실수이기 때문에 소수점 뒤 데이터 손실은 일어나지 않는다.
        System.out.println(a/d);
//      (int 10) / (float 3) = 3.3333~ 정수 / 실수는 형 변환을 통해 실수로 변환된다.

        System.out.println(c/b);
//      실수 / 정수도 (a/d, c/d)와 동일
    }
}
