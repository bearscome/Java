package season2.object.progenitor;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        // obj의타입이 Student가 아닐 경우는 Object로 변경하여 전달 받는다.

        Student s = (Student) obj;
        return this.name == s.name;
    }

    public boolean equals(Student obj) {
        return this.name == obj.name;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("1");
        Student s2 = new Student("1");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
