package season2.object.Calculator;

class Calcurator {
    // class = 지금부터 Calcurator의 설계도를 선언한다.
    // 독립된 프로그램으로 봐야한다. 변수 및 메소드도 별도다.
    static double PI = 3.14;
    // 모든 class마다 해당 변수를 가진다.
    // static이 있으면 해당 변수가 클래스의 소속이 된다.
    // 클래스의 변수가 된다는 것은 모든 인스턴스에서 해당 값을 동일하게 가진다.
    static int base = 0;
    // 클래스 맴버 (static)

    int left, right;
    // 인스텐스 맴버
    public void setOpion(int _left, int _right) {
        this.left = _left;
        this.right = _right;
    }
    public void sum() {
        System.out.println(this.left + this.right + base);
    }
    public void avg() {
        System.out.println((this.left + this.right + base) / 2);
    }
}

public class CalcuratorDemo {
    public static void main(String[] args) {
        Calcurator c1 = new Calcurator();
        // new Calcurator = 인스턴스
        // Calcurator = 객체 (class)
        // new라는 연산자를 통해서 변수에 해당 클래스를 통해 만든 인스턴스를 만들어서
        c1.setOpion(10, 20);
        c1.sum();
        System.out.println(c1.PI);


        Calcurator c2 = new Calcurator();
        // c2는 Calcurator의 데이터 타입을 가진다.
        c2.setOpion(20, 40);
        // c1, c2의 인스턴스가 다르기 때문에 넘기는 값도 다르니, c1의 인스턴스, c2의 인스턴스로 나눌 수 있다.
        c2.avg();
        System.out.println(c2.PI);


        System.out.println(Calcurator.PI);
        // 클래스를 통해서 클래스 맴버 변수를 가져올 수 있다.

        Calcurator.base = 10;
        // 클래스 맴버의 값을 변경하여 해당 인스턴스의 값이 변경되기 때문에
        // constans가 아닌 클래스 내부에 선언하여 모든 클래스를 동일하게 변경을 할 수 있다.
        c1.sum();
        c2.sum();
    }
}
