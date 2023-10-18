package season2.object.polymorphism;

class A{
    public Character x() {
        return 'x';
    }
}

class B extends A {
    public Character y() {
        return 'y';
    }
}

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();

        obj.x();
        obj.y();
        /**
         * 인스턴스를 만들 때, 그 인스턴스의 데이터 타입은
         * 그 클래스의 부모 클래스가 될 수도 있다
         */
    }
}
