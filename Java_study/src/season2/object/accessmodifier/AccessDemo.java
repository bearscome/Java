package season2.object.accessmodifier;

import season2.object.package3.C;

/***
 * 메소드의 접근 제어자가 "public"이면 내, 외부에서 해당 메소드 사용 가능
 * 메소드의 접근 제어자가 "private"이면 내부에서 사용은 가능하나, 외부에서 사용 불가
 */

class A{
    public String y() {
        return "public void y()";
    }

    private String z() {
        return "public void z()";
    }

    public String x() {
        return z();
    }
}

class Calculator {
    private int left, right;
//    private가 없을 경우 클래스 접근으로 값을 변경 할 수 있다.
//    클래스 접근으로 변경하는 것을 막으려면 private를 선언해야 한다.

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    private int _sum() {
//        private를 설정함에 따라 인스턴스는 현재 sum의 로직을 몰라도 된다.
//        인스턴스에서 접근을 할 수 없기 때문에 public을 선언한 다른 메서드를 사용해야 한다.
        return this.left + this.right;
    }

    public void sumDecoPlus() {
        System.out.println("+++++++" + _sum() + "++++++");
    }

    public void sumDecoMinus() {
        System.out.println("-------" + _sum() + "-----");
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
//        System.out.println(a.z());
        System.out.println(a.x());

        Calculator c = new Calculator();
        c.setOperands(10, 20);
        c.sumDecoPlus();
        c.sumDecoMinus();
    }
}
