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
            // 어떤 오류? (/by zero)
            System.out.println("오류가 발생했습니다" + e.toString());
            // 어떤 exception(java.lang.ArithmeticException), 어떤 오류
            System.out.println("오류가 발생했습니다" + e.getStackTrace());
            // 예외가 발생했을 때 실행되는 로직
        }

//        계산된 값은:
//        오류가 발생했습니다/ by zero


        System.out.println("DIVIDE END");
//        catch문 이후에 있는 함수 실행
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculaotr c1 = new Calculaotr();
        c1.setOprands(10, 0);
        c1.division();
    }
}
