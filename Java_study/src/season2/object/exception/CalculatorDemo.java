package season2.object.exception;

class Calculaotr {
    int left, right;
    public void setOprands(int _left, int _right) {
//        if(_right < 1) {
//            throw new IllegalAccessException("두 번째 인자는 1보다 커야합니다");
//        };
//        sum, minus일 경우 두 번쨰 인자가 0으로 들어올 수 있으니
//        division에서 exception을 던지는게 좋음

       this.left = _left;
       this.right = _right;
    }

    public void division() {
        if(this.right < 1) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
            // Exception이 발견되면 catch문을 실행하고 해당 함수를 빠져나온다.
        };


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

        try {
            c1.division();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
