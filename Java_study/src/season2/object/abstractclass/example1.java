package season2.object.abstractclass;

abstract class A {
    public abstract int b();
//    abstract는 추상화 메소드이기 때문에 메소드를 구현하지 않는다.
//    A를 상속한 클래스에서 b()메소드를 오버라이딩을 해야한다.
//    클래스 맴버에서 abstract 메소드가 있다면 그 클래스는 무조건 abstract 클래스 이다.

    public void d() {
        System.out.println("world");
    }
}

class B extends A {
//    B클래스에서 A 클래스를 상속받았으므로, 오버라이딩을 해야한다.
    public int b() {
        return 1;
    }
}
public class example1 {
    public static void main(String[] args) {
//        A obj = new A();
//        A클래스는 abstract 클래스이기 때문에 인스턴스화하지 못한다
        B obj = new B();

    }
}
