package season2.object.Constructor;

class Calcuator {
    int left, right;

    public Calcuator (int _left, int _right) {
        /*
        * 생성자(constructor)
        * Class가 생성될 때 생성자가 실행되도록 약속되어 있다.
        * 생성자는 Class 이름과 정확히 동일해야 한다.
        * 생성자는 초기화(전역 변수에 값을 할당)를 담당한다.
        * 생성자는 어떤 메소드보다 먼저 실행되도록 약속되어 있다.
        *
        * 만약 해당 생성자가 없을 경우 자바에서 자동으로 생성한다.
        *
        * */
        this.left = _left;
        this.right = _right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalcuatorDemo1 {
    public static void main(String[] args) {
        Calcuator c1 = new Calcuator(10, 20);
        c1.sum();
        c1.avg();

        Calcuator c2 = new Calcuator(10, 20);
        c2.sum();
        c2.avg();

        /*
        * 인스턴스를 만든 후 옵션(left, right)을 제공한다면 코드를 작성한 사람 이외의
        * 다른 사람이 해당 인스턴스 생성 시 옵션 설정의 함수를 놓칠 수 있다.
        * 놓칠 염려를 제거하기 위해 인스턴스 생성 시 옵션 설정을 강제하여 실수를 방지한다.
        * 기존 코드는 아래와 같았다.
        *
        * Calculator c1 = new Calculator();
        * c1.sepOperands(10, 20);
        * c1.sum();
        * c1.avg()
        *
        * */
    }
}
