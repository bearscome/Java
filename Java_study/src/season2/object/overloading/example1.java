package season2.object.overloading;

/***
 * overloading
 * 메소드들이 동일한 로직을 가지고 있으나
 * 매개 변수가 개수가 달라져서 메소드를 추가하는 것이 아닌
 * 동일한 매개 변수 명을 추가하여 매개 변수만 변경하는 것이다.
 *
 * 메소드의 이름이 같다고 하더라도, 매개변수가 다른 형식이라면 다른 메소드로 인식하게 된다
 */

class Calculaotr {
    int left, right;
    int thirth = 0;

    public void setOprands(int _left, int _right) {
        this.left = _left;
        this.right = _right;
    }

    public void setOprands(int _left, int _right, int _thirth) {
//        this.left = _left;
//        this.right = _right;
//        동일한 코드라면 자신의 메소드를 호출한다.
        this.setOprands(_left, _right);
        this.thirth = _thirth;
    }

    public void sum() {
        System.out.println(this.left + this.right + this.thirth);
    }
}
public class example1 {
    public static void main(String[] args) {
        Calculaotr c1 = new Calculaotr();
        c1.setOprands(10, 20);
        c1.sum();
        c1.setOprands(10, 20, 30);
        c1.sum();
    }
}
