package season2.object.Calculator;

class Calcurator {
    // class = 지금부터 Calcurator의 설계도를 선언한다.
    // 독립된 프로그램으로 봐야한다. 변수 및 메소드도 별도다.
    int left, right;
    public void setOpion(int _left, int _right) {
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

public class CalcuratorDemo {
    public static void main(String[] args) {
        Calcurator c1 = new Calcurator();
        // new Calcurator = 인스턴스
        // Calcurator = 객체 (class)
        // new라는 연산자를 통해서 변수에 해당 클래스를 통해 만든 인스턴스를 만들어서
        c1.setOpion(10, 30);
        c1.sum();

        Calcurator c2 = new Calcurator();
        // c2는 Calcurator의 데이터 타입을 가진다.
        c2.setOpion(30, 50);
        c2.avg();
    }
}
