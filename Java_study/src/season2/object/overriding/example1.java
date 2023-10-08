package season2.object.overriding;

/**
 * overriding은 부모의 메소드와 자식의 메소드의 이름이 같다면
 * 부모의 메소드를 호출하는 것이 아닌 자식의 메소드를 호출한다.
 * --
 * 오버라이딩 시 아래와 같아야 한다.
 *  1. 부모 클래스와 자식 클래스의 메소드의 이름이 같아야 한다.
 *  2. 메소드의 매개변수, 데이터 타입, 순서가 동일해야 한다.
 *  3. 메소드의 리턴 타입이 동일해야 한다.
 */

class Caculator {
    int left, right;

    public void setOperand(int _left, int _right) {
        this.left = _left;
        this.right = _right;
    }

    public void sum() {
        System.out.println(this.left + this. right);
    }

//    public void avg() {
    public int avg() {
        return (this.left + this.right) / 2;
    }
}

class abcableCaculaotr extends Caculator {
    public void sum() {
        System.out.println(this.left + this. right + "입니다.");
    }

//    public int avg() {
    public int avg() {
        return super.avg();
    }
}

public class example1 {
    public static void main(String[] args) {
        abcableCaculaotr c1 = new abcableCaculaotr();
        c1.setOperand(10, 20);
        c1.sum();
        c1.avg();
    }
}


