package season2.object.Inheritance;

/** 상속
 * 기존의 객체를 그대로 유지하면서 어떤 기능을 추가할 수 있는 방법
 * 즉 기존 객체를 수정하지 않으면서 새로운 객체가 기존의 객체를 기반으로 만드는 방법
 * 이 때, 기존의 객체는 기능을 물려준다는 의미에서 부모 객체가 되고,
 * 새로운 객체는 기존 객체의 기능을 물려받는 의미에서 자식 객체가 된다.
 *
 * 부모 클래스와 자식 클래스의 관계를 상위(super), 클래스와 하위(sub) 클래스라고 표현하기도 한다.
 *
 * 객체에 메소드가 어려운 경우들
 * 1.객체를 자신이 만들지 않았거나, 원 소스를 수정할 수 없을 경우
 * 2.객체가 다양한 곳에서 활용되고 있는데, 하나의 클래스에서만 사용해야 한다면,
 *   해당 객체를 사용하는 다른 곳에서도 해당 메소드를 알아야 하는 경우가 생긴다.
 *
 * */
class Calculator {
    int left, right;
    public void setOpion(int _left, int _right) {
        this.left = _left;
        this.right = _right;
    }
    public void sum() {
        System.out.println(this.left + this.right );
    }
    public void avg() {
        System.out.println((this.left + this.right ) / 2);
    }
}

class SubstructionableCalculator extends Calculator {
    /**
     * SubstructionableCalculator는 Calculator를 상속, 확장 한다.
     * class diagram
     * 현재 클래스에서 메소드가 없다면 상속된 클래스를 찾아 확인한다.
     * */
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstructionableCalculator c1 = new SubstructionableCalculator();
        c1.setOpion(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
