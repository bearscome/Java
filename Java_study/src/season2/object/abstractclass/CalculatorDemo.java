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
