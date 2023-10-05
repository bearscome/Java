package season2.object.Calculator;

class Calcurator3 {
    // static을 사용하면 클래스 메소드로 적용된다.
    public static void sum(int _left, int _right) {
        System.out.println(_left + _right);
    }

    public static void avg(int _left, int _right) {
        System.out.println((_left + _right) / 2);
    }
}

public class CaculatorDemo3 {
    public static void main(String[] args) {
        Calcurator3.sum(10, 20);
        Calcurator3.avg(10, 20);

        Calcurator3.avg(20, 40);
        Calcurator3.avg(20, 40);

        // class로 직접 접근해서 사용 가능
        // 1. 어떠한 상태값이 필요하지 않고 메소드만 사용하면 인스턴스를 사용할 필요가 없다.
        // 2. 인스턴스를 사용할 경우 메모리를 사용하기 때문에 불 필요하다.

        // 인스턴스를 만들어 사용하는 경우는 서로 다른 값을 대입할 떄.
        // 각 값에 따라 다르게 출력되어야 할 때 인스턴스를 만들어서 사용
    }
}
