package season2.object;

class C1 {
    static int static_variable = 1;
    // class 변수
    int instance_variable = 2;
    // 인스턴스 변수

    static void static_static() {
        // class 메소드
        // class 메소드에서 class 변수에 접근 가능
        System.out.println(static_variable);
    }

    static void static_instance() {
//        class 메소드에서는 인스턴스 변수에 접근 불가.
//        인스턴스 변수는 인스턴스 생성 시 생성
//        System.out.println(instance_variable);
    }

    void instance_static() {
//        인스턴스 메소드에서 class 변수에 접근 가능.
//        class변수는 class 로드 시 생성
        System.out.println(static_variable);
    }

    void instance_instance() {
//        인스턴스 메소드에서 인스턴스 변수 접근 가능
        System.out.println(instance_variable);
    }
}
public class ClassMemberDemo {
    /**
     * 1. 인스턴스 메소드는 클래스 맴버에 접근 할 수 있다
     * 2. 클래스 메소드는 인스턴스 맴버에 접근 할 수 없다.
     *  - 클래스는 인스턴스보다 먼저 생성되기 떄문에 인스턴스 맴버에 접근 할 수 없다.
     *    -> 클래스 변수는 클래스 로드 시 생성되는 변면,
     *    -> 인스턴스 변수는 인스턴스를 생성할 때 생성된다.
     */

    public static void main(String[] args) {
        C1 c = new C1();

        // 인스턴스 변수 -> Non-Static Filed
        // 클래스 변수 -> Static Filed

//        c.static_static();
        // 인스턴스는 class메소드에서 class변수에 접근 가능

//        c.static_instance();
        // class메소드에서 인스턴스변수에 접근 불가

//        c.instance_static();
        // 인스턴스는 인스턴스메소드에서 class변수에 접근 가능

//        c.instance_instance();
        // 인스턴스는 인스턴스메소드에서 인스턴스변수에 접근 가능

//        C1.static_static();
        // class는 class메소드를 통해 class변수에 접근 가능

//        C1.static_instance();
        // class메소드에서 인스턴스변수에 접근 불가

//        C1.instance_static();
//        C1.instance_instance();
        // class에서 인스턴스메소드 접근 불가
        // 인스턴스 메소드는 인스턴스 생성 시 생성

    }
}
