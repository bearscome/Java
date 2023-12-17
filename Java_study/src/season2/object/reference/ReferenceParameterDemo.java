package season2.object.reference;

public class ReferenceParameterDemo {

    static void _value(int b){
        b = 2;
        System.out.println("b: " + b);
        // return문이 없으니까 변화가 없겠지.
        // JS도 동일하게 변경이 안된다.
        // int b = a;
        // b = 2;
        // a = 1
        // 기본 데이터형 이기 때문에 변수를 참조하는 것이 아닌 복제이기 때문에 변경이 안된다.
    }

    public static void runValue(){
        int a = 1;
        _value(a);
        System.out.println("runValue, "+a);
    }

    static void _reference1(A b){
        System.out.println("b" + b.id); // 1
        b = new A(2);
        System.out.println("b" + b.id); // 2

        // 파라미터로 받은 b의 new A(1)와
        // 함수 안에 있는 b의 new A(2)는
        // 생성자이기 때문에 참조하는 곳이 다르다
        // 서로 영향을 주지 않기 때문에 1이다.
    }

    public static void runReference1(){
        A a = new A(1);
        _reference1(a);
        System.out.println("runReference1, "+a.id);
    }

    static void _reference2(A b){
        b.id = 2;
        // 생성자가 아니기 때문에 영향을 받는다
    }

    public static void runReference2(){
        A a = new A(1);
        _reference2(a);
        System.out.println("runReference2, "+a.id);
    }

    public static void main(String[] args) {
        runValue(); // runValue, 1
        runReference1(); // runReference1, 1
        runReference2(); // runReference2, 2
    }

}
