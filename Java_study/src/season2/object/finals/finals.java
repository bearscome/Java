package season2.object.finals;

class Calculator {
    final static double PI = 3.14;

    void setOperands(int left, int right) {
//        PI = 4;
//        final 이기 때문에 수정이 불가하다.
    }

    final void b() {}
}

class B extends Calculator {
//    void b() {}
//    메소드가 final 이기 때문에 수정이 불가하다.
}

final class D {}

//class E extends D {};
// final이기 떄문에 상속이 불가하다.
public class finals {
    public static void main(String[] args) {
//        Calculator.PI = 3;
//        final이기 때문에 클래스로 접근해도 수정할 수 없다.
    }
}
