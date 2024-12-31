package genius.test.chapter2_11;

public class Test {
    // static 변수
    private static Test instance = new Test(); // 접근제한자, static, 타입, 변수 명 = 객체 생성

    // 생성자에 private 접근 제한자
    private Test() {
        System.out.println("생성자");
    }
    // static 메서드
    public static Test getInstance() {
        System.out.println("객체 리턴");
        return instance;
    }
}
