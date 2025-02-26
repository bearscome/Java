package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
       this(name, age, 50);
        // this를 호출한 경우 생성자 내부에서 자신의 생성자를 호출 할 수 있다
        // this는 인스턴스 자신의 참조 값을 가르킨다
        // this는 생성자 코드의 첫줄에만 작성할 수 있다.
        System.out.println("1");

    }

    MemberConstruct(String name,int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " age: " + age + " grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
}
