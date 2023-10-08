package season2.object.overloading;

public class example2 {
    void A() {
        System.out.println("void A()");
    }
    void A(int arg1) {
        System.out.println("void A(int arg1)");
    }
    void A(String arg1) {
        System.out.println("void A(String arg1)");
    }

//    int A() {System.out.println("void A(String arg1)");}
//    메소드 이름이 같고 파라미터가 같은데 리턴 값이 다를 경우 오류를 리턴한다.
//    작성자가 A()메소드를 실행시키면 자바는  int A()인지 void A()인지 알 수 없다.
//    리턴 값이 다르거나, 매개변수 이름이 다르다면 오버로딩을 할 수 없다.

    public static void main(String[] args) {
        example2 od = new example2();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}

class example3 extends example2 {
    void A(String arg1, String arg2){
        // example2에 2개의 매개변수가 없기 때문에 오버라이딩
        System.out.println("sub");
    }

    void A() {
        // example2에 해당 메소드가 있기 때문에 오버로딩
        System.out.println("sub:");
    }

    public static void main(String[] args) {

    }
}
