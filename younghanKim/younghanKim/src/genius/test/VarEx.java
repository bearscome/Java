package genius.test;

public class VarEx {
    public static void main(String[] args) {

        // 클래스 변수 사용
        System.out.println(Avante.company);

        // 인스턴스 변수 -> 객체를 통해서 접근 가능
        Avante a1 = new Avante();
        Avante a2 = new Avante();

        a1.color = "white";
        a2.color = "black";

        // 인스턴스변수 출력
        System.out.println("a2 색상: " + a1.color);
        System.out.println("a2 색상: " + a2.color);

        // 클래스 변수를 인스턴스 객체로 출력
        System.out.println("a2 제조사: " + a1.company);
        System.out.println("a2 제조사: " + a2.company);

        // 클래스 변수의 값을 변경
        a1.company = "기아";
        System.out.println("a2 제조사: " + a1.company);
        System.out.println("a2 제조사: " + a2.company);
    }
}
