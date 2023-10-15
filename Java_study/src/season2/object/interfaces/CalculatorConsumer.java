package season2.object.interfaces;

// implements = 구현하다.
// interface는 진짜 인터페이스 정의서처럼 사용되는 것 같다.
// 공통 클래스 or util에서 사용하기 좋은 정의 같다.

class CalculaotrDummy implements Calculatorable {
    public void setOprands(int first, int second, int third) {

    }

    public int sum() {
        return 60;
    }

    public int avg() {
        return 30;
    }
}

public class CalculatorConsumer {
    public static void main(String[] args) {
        CalculaotrDummy a = new CalculaotrDummy();
        a.setOprands(30, 30, 30);
        a.sum();
    }
}
