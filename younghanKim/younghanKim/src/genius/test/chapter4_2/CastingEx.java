package genius.test.chapter4_2;

public class CastingEx {
    public static void main(String[] args) {

        // 부모 클래스
        Phone p = new Phone();

        // 자식 클래스
        SmartPhone sp = new SmartPhone();

        Phone p2 = sp;
        // 부모 클래스 타입에 자식 클래스 대입
        // SmartPhone의 메소드인 installApp 호출 불가

//        SmartPhone sp2 = p;
        // 자식 클래스 타입에 부모 클래스 대입 불가X
        SmartPhone sp2 = (SmartPhone) p; // 형 변환을 통해서 타입 변경 가능

        sp2.installApp();
        p2.installApp();
    }
}
