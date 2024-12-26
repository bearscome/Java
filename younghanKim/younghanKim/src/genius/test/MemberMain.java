package genius.test;

public class MemberMain {
    public static void main(String[] args) {
        // type(Member)은 같지만 다른 객체이다.
        // class는 설계도, 객체는 = 제품

        // "new" 키워드를 사용하여 객체 생성
        // type은 같아도 모든 객체는 다 다르다.
        Member m = new Member();
        Member m2 = new Member();

        if(m == m2) {
            System.out.println("m2 == m1");
        }
        else {
            System.out.println("m2 != m1");
        }
    }
}
