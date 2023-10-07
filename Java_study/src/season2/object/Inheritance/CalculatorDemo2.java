package season2.object.Inheritance;

class MultiplicationableCalculaotr extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

public class CalculatorDemo2 {
    public static void main(String[] args) {
        MultiplicationableCalculaotr c1 = new MultiplicationableCalculaotr();
        c1.setOpion(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
    }
}
