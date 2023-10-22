package season2.object.polymorphism;

interface Programmer {
    public void coding();
}

interface mother {}
interface father {}

class Mother implements Programmer,mother {
    public void coding() {
        System.out.println("moter is coder");
    }
}

class Father implements Programmer, father {
    @Override
    public void coding() {
        System.out.println("fater is coder");
    }
}

public class PolymerphismDemo3 {
    public static void main(String[] args) {
        Father steve = new Father();
        Mother racher = new Mother();
        
        steve.coding();
        racher.coding();

        /**
         * 페르소나 같은 느낌
         * 다양한 인터페이스를 하나의 클래스를 구현한다.
         * 만약 부모님의 직업이 개발자일 경우 하나의 메소드를 강제한다.
         * 엄마의 클래스 안에 프로그래머의 인터페이스를 구현하고,
         * 다양한 엄마의 인터페이스(~의 친구, ~ 상사 등)를 엄마의 클래스 안에 구현한다.
         */
    }
}
