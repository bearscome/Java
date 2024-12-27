package genius.test;

public class Member2 {
    String name;
    int age;

    /**
     * [생성자]
     * 객체를 초기화 하는 용도
     * 생성자를 여러개 정의할 수 있다 (생성자 오버로딩[매개변수 타입 ,개수, 순서])
     * */
    Member2() {

    }
    Member2(String n) {
        name = n;
    }
    Member2(int a) {
        age = a;
    }
    Member2(String n, int a) {
        name = n;
        age = a;
    }
}
