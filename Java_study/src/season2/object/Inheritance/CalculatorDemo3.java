package season2.object.Inheritance;

class DivisionableCaculaotr extends MultiplicationableCalculaotr {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo3 {
    public static void main(String[] args) {
        DivisionableCaculaotr c1 = new DivisionableCaculaotr();
        c1.setOpion(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
}
