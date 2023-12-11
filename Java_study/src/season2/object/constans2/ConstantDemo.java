package season2.object.constans2;

class Fruit {
    public static final Fruit  APPLE = new Fruit(); // 자기 자신을 인스턴스
    public static final Fruit  PEACH = new Fruit();
    public static final Fruit  BANANA = new Fruit();

}
class Company {
    public static final Company  GOOGLE = new Company();
    public static final Company  APPLE = new Company();
    public static final Company  ORACLE = new Company();
}

public class ConstantDemo {

//    if(Fruit.APPLE === Company.APPLE) {
        // 의미가 혼동될 수 있는 것을 에러를 런타임으로 잡아서
        // 오류를 컴파일러가 검출해줄 수 있다.
//    }


    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;
        switch (type) {
            // switch조건은 데이터 타입이 제한적이다 (int, char, byte, String, ...)
            case Fruit.APPLE:
                System.out.println("57");
                break;
            case Fruit.PEACH:
                System.out.println("34");
                break;
            case Fruit.BANANA:
                System.out.println("93");
                break;

        }
    }
}
