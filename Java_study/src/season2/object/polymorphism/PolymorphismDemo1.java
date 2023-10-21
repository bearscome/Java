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

abstract class Calcurator {
    int right, left;

    public void setOperands(int _right, int _left) {
        this.right = _right;
        this.left = _left;
    }

    int _sum() {
        return this.left + this.right;
    }

    abstract void sum();
    abstract void avg();

    public void run() {
        sum();
        avg();
    }
};

class CaculaorPlus extends Calcurator {
    public void sum(){
        System.out.printf("+++++++++++++++++++++++++++++" + _sum());
    }

    public void avg() {
        System.out.printf("CaculaorPlusCaculaorPlusCaculaorPlus" + (this.right -this.left / 2));
    }
}

class CaculaorMinus extends Calcurator {
    public void sum(){
        System.out.printf("---------------" + _sum());
    }

    public void avg() {
        System.out.printf("CaculaorPlusCaculaorPlusCaculaorPlus" + (this.right -this.left / 2));
    }
}

public class PolymorphismDemo1 {
    public static void execute(Calcurator cal) {
        System.out.printf("ca1 run");
        cal.run();
    }
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

        Calcurator c1 = new CaculaorPlus();
        c1.setOperands(10,20);

        Calcurator c2 = new CaculaorMinus();
        c1.setOperands(30, 40);

        execute(c1);
        execute(c2);

        /**
         * 다양성을 통해 부모의 클래스를 받아 다른 인스턴스라도
         * 동일한 부모의 메소드를 받아 사용할 수 있다.
         * 만약 다른 데이터 타입을 가지고 있다면 execute의 함수에서 매개변수를 받을 때,
         * 서로 다른 c1,c2의 데이터 타입을 정의하여 두 개의 함수를 만들어야 할 것이다.
         */
    }
}
