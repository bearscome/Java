package season2.object.exception;

//class DivideException extends RuntimeException {
//class DivideException extends ArithmeticException {
class DivideException extends Exception {
    DivideException() {
        super();
    }

    DivideException(String msg) {
        super(msg);
    }
}

class Calculaotr {
    int left, right;
    public void setOprands(int _left, int _right) {
       this.left = _left;
       this.right = _right;
    }

    public void division() {
        try {
            if(this.right < 1) {
                throw new DivideException("0으로 나눌 수 없습니다.");
            };
        } catch (DivideException e) {
            e.printStackTrace();
        }

        System.out.println("DIVIDE END");
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculaotr c1 = new Calculaotr();
        c1.setOprands(10, 0);

        try {
            c1.division();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
