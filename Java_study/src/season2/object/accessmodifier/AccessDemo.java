package season2.object.accessmodifier;

/***
 * 메소드의 접근 제어자가 "public"이면 내, 외부에서 해당 메소드 사용 가능
 * 메소드의 접근 제어자가 "private"이면 내부에서 사용은 가능하나, 외부에서 사용 불가
 */

class A{
    public String y() {
        return "public void y()";
    }

    private String z() {
        return "public void z()";
    }

    public String x() {
        return z();
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
//        System.out.println(a.z());
        System.out.println(a.x());
    }
}
