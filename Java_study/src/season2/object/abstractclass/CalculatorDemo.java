package season2.object.abstractclass;

abstract class Calculator {
    int left, right;

     void setOperand(int left, int right) {
        this.left = left;
        this.right = right;
    }

    int _sum() {
        return this.left + this.right;
    }

    abstract void sum();
    abstract void avg();

    void run() {
//        공통 분모로 사용하는 경우에는 하위 클래스가 아닌 상위 클래스에서 정의

        sum();
        avg();
    }
}

class PlusCalculator extends Calculator {
    void sum() {
        System.out.println("+++++" + _sum());
    }

    void avg() {
        System.out.println("+++++" + (this.left + this.right / 2));
    }
}

class MinusCalculator extends Calculator {
    void sum() {
        System.out.println("-----" + _sum());
    }

    void avg() {
        System.out.println("-----" + (this.left + this.right) / 2);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        PlusCalculator PC = new PlusCalculator();
        PC.setOperand(10, 20);
        PC.run();


        MinusCalculator MC = new MinusCalculator();
        MC.setOperand(50, 49);
        MC.run();
    }
}
//오버라이딩
// 1. 정의: 상속 관계에서 자식 클래스가 부모 클래스의 메서드를 재정의하는 것
// 2. 목적: 부모 클래스의 메서드를 자식 클래스의 상황에 맞게 수정하기
// 3. 관계: 상속 관계에서 사용됨	객체 지향 프로그래밍의 기본 개념
//
//추상화
// 1. 정의: 객체의 세부적인 구현을 숨기고, 그 객체가 제공하는 기능에만 집중하는 것
// 2. 목적: 코드의 복잡성을 줄이고, 재사용성을 높이기
// 3. 관계: 객체 지향 프로그래밍의 기본 개념

// 오버라이딩과 추상화의 사용 시 고려 사항
// 오버라이딩은 부모 클래스의 메서드와 동일한 시그니처를 가져야 합니다.
// 추상화는 추상 클래스 또는 인터페이스에서만 사용할 수 있습니다.
// 추상 메서드는 반드시 자식 클래스에서 구현해야 합니다.
