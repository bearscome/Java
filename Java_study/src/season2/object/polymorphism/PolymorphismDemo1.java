package season2.object.polymorphism;

class A{
    public String x() {
        return "A.x";
    }

    public String z() {
        return "A.x";
    }
}

class B extends A {
    public String y() {
        return "y";
    }

    public String x() {
        return "B.x";
    }
}

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();

        obj.x();
//        obj.y();
        obj.z();
        /**
         * 인스턴스를 만들 때, 그 인스턴스의 데이터 타입은
         * 그 클래스의 부모 클래스가 될 수도 있다
         */

        System.out.println(obj.x());
        /**
         * 부모 클래스의 B가 아닌,
         * 클래스 B에 정의된 메소드를 실행한다.
         * 부모 클래스의 y 메소드가 정의되어 있지 않기 때문에,
         * obj.y() 호출 시 오류를 리턴한다.
         *
         * 데이터 타입이 부모 클래스일 때,
         * 현재 인스턴스된 메소드는 오버라이딩이 안된 경우라면
         * 현재 인스턴스된 클래스의 메소드는 사용할 수 없다.
         */
    }
}
