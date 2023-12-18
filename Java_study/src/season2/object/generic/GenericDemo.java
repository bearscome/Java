package season2.object.generic;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person{
    public Object info;
    Person(Object info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person p1 = new Person("부장");
        // Person의 Object의 타입이 들어가기 때문에 타입에러가 안난다
        // Object이기 때문에 type이 안전하지 않다.
        EmployeeInfo ei = (EmployeeInfo) p1.info;
    }
}
