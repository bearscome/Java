package season2.object.reference;

class A {
    public int id;
    A(int id) {
        this.id = id;
    }
}

public class ReferenceDemo1 {
    public static void runValue() {
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, " + a);
        // 기본 데이터 타입은 복제가 일어나기 때문에
        // a, b를 변경해도 영향을 받지 않는다.
    }

    public static void runReference() {
        A a = new A(1);
        A b = a;
        b = new A(1);
        System.out.println("runReference, A: " + a.id + " runReference, B: " + b.id);
        // 인스턴스를 참조할 수 있는 주소 값만 가지고 있기 떄문에
        // a , b의 id를 변경하면 해당 두 변수가 영향을 받는다. (메모리 주소?)
        // 자바스크립트 객체와 동일한 거 같다.
    }

    public static void main(String[] args) {
        runValue();
        runReference();
    }
}
