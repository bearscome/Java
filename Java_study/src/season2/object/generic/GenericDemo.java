package season2.object.generic;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    // 복수의 제네릭이 필요한 경우 콤마가 필요하며, 네이밍이 달라야한다.
    // 제네릭은 레퍼런스 타입(참조형)만 올 수 있다. (기본 데이터[int, char] 타입은 못 온다.)
    // 기본 데이터 타입은 wrapper 클래스(오브젝트)를 사용하면 된다.
    // int -> Integer, double -> Double
    public T info;
    public S id;
    Person(T info, S id){
        this.info = info;
        this.id = id;
    };
}
public class GenericDemo {
    public static void main(String[] args) {
//        Integer id = new Integer(3); // new Integer는 Java 9부터 사용하지 않는 생성자이다.
        Integer id = 1;
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
        System.out.println(p1.id.intValue());
    }
}
