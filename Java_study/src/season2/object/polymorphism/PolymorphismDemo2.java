package season2.object.polymorphism;

interface I {}

interface I1 {
    public String A();
}

interface I2 {
    public String B();
}

class D implements I1, I2 {
    public String A() {
        return "A";
    }

    public String B() {
        return "B";
    }
}

class C implements I{}
public class PolymorphismDemo2 {
    public static void main(String[] args) {
        I obj = new C();
        /**
         * 클래스 C에서 인터페이스 I를 구현할 때,
         * 데이터 타입을 인터페이스로 지정할 수 있다.
         */

        D objD = new D();
        I1 objI1 = new D();
        I2 objI2 = new D();

        objD.A();
        objD.B();
        /**
         * objD의 데이터 타입은 I1,I2를 구현했기 떄문에 A, B의 메소드를 모두 사용할 수 있다.
         */


        objI1.A();
//        objI1.B();
        /**
         * objI1의 데이터 타입은 I1이기 때문에 B()메소드를 사용할 수 없다.
         */

//        objI2.A();
        objI2.B();
        /**
         * objI2의 데이터 타입은 I2이기 때문에 A()메소드를 사용할 수 없다.
         */

        /**
         * 스마트폰 스마트폰 = new 스마트폰();
         * 인터넷 스마트폰 = new 스마트폰();
         * 전화기 스마트폰 = new 스마트폰()
         */
    }
}
