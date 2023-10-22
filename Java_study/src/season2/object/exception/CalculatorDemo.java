package season2.object.exception;

class Calculaotr {
    int left, right;
    public void setOprands(int _left, int _right) {
       this.left = _left;
       this.right = _right;
    }

    public void division() {
        try {
            System.out.println("계산된 값은: ");
            System.out.println(this.left / this.right);
            System.out.println("입니다.");
        } catch (Exception e) {
            System.out.println("오류가 발생했습니다" + e.getMessage());
            // 예외가 발생했을 때 실행되는 로직
        }

//        계산된 값은:
//        오류가 발생했습니다/ by zero
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculaotr c1 = new Calculaotr();
        c1.setOprands(10, 0);
        c1.division();
    }
}
