package season2.object.constans2;

//class Fruit {
//    public static final Fruit  APPLE = new Fruit(); // 자기 자신을 인스턴스
//    public static final Fruit  PEACH = new Fruit();
//    public static final Fruit  BANANA = new Fruit();
//
//}
enum Fruit {
    APPLE, PEACH, BANANA
}

//class Company {
//    public static final Company  GOOGLE = new Company();
//    public static final Company  APPLE = new Company();
//    public static final Company  ORACLE = new Company();
//}
enum Company {
    GOOGLE, APPLE, ORACLE
}

// enum은 열거형이며, 서로 연관된 상수들의 집합이다.
// 코드가 단순해진다
// 인스턴스 생성과 상속을 방지한다.
// 키워드 enum을 사용하기 떄문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.

public class ConstantDemo {

//    if(Fruit.APPLE === Company.APPLE) {
        // 의미가 혼동될 수 있는 것을 에러를 런타임으로 잡아서
        // 오류를 컴파일러가 검출해줄 수 있다.
//    }


    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;
        switch (type) {
            // switch조건은 데이터 타입이 제한적이다 (int, char, byte, String, ...)
            // switch의 type은 Fruit의 타입이다.
            case APPLE:
                System.out.println("57");
                break;
            case PEACH:
                System.out.println("34");
                break;
            case BANANA:
                System.out.println("93");
                break;

        }
    }
}
