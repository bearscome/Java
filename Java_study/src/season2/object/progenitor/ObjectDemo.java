package season2.object.progenitor;

class Student implements Cloneable{
    // Cloneable의 인터페이스는 비어있지만 자바 버츄얼 머신이 해당 인터페이스를 읽어
    // clone이 가능한 class라는 것을 명시해주는 것이다.
    String name;

    Student(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("1");
        try {
           Student s2 = (Student) s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
