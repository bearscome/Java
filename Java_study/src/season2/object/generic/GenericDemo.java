package season2.object.generic;
//interface InterFaceInfo {
//    int getLevel();
//}
//
//class EmployeeInfo2 implements InterFaceInfo {
//    int level;
//    EmployeeInfo2(int level) {
//        this.level = level;
//    }
//    public int getLevel() {
//        return this.level;
//    }
//}

abstract class Info {
    public abstract int getLevel();
    // abstract는 추상화 클래스, 메소드
};

class EmployeeInfo extends Info {
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; };
    public int getLevel() {
        return this.rank;
    };
};
class Person<T extends Info>{
    // 제네릭을 사용할 경우 제넥릭의 래퍼런스를 제한하고 싶다면
    // extends Object를 사용하면 해당 Object와 Object의 자식만 제네릭으로 사용이 가능하다.
    // 제네릭에서 extends는 해당 래퍼런스의 부모를 가르키는 것이다.
    // 제네릭에서 super는 해당 래퍼런스를 제외한 모든 래퍼런스를 받는 것이다 (실용성이 거의 없음)
    public T info;
    Person(T info) {
        this.info = info;
        info.getLevel();
        // 제네릭에서 extends info를 했기 때문에 해당 메소드 사용할 수 있다.
    };
};
public class GenericDemo {
    public static void main(String[] args) {
        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
//        Person<String> p2 = new Person<String>("부장");
        // String은 Info의 자식이 아니기 때문에 에러가 나타난다.
    }
}
