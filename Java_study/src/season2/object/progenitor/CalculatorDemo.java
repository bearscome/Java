package season2.object.progenitor;

class Caculaotr {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }

    public String toString() {
        // Object의 toString()의 메소드를 overring을 통해 재정의
//        return "left: " + this.left + ", " + "right: " + this.right;
        return super.toString() + " | "+ "left: " + this.left + ", " + "right: " + this.right;

    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Caculaotr c1 = new Caculaotr();
        c1.setOprands(10, 20);
        System.out.println(c1.toString());
        // "season2.object.progenitor.Caculaotr""@""b4c966a"
        // 인스턴스 위치                          구분자 인스턴스 주소
    }
}
