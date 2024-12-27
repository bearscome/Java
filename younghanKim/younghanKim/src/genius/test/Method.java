package genius.test;

public class Method {
    static void printName() {
        // class 생성 없이 바로 호출 가능
        System.out.println("printName() 실행");
    }

    void printEmail() {
        System.out.println("printEmail() 실행");

        //다른 메서드 실행
        printId();
    }

    void printId() {
        System.out.println("printId() 실행");
    }
}
