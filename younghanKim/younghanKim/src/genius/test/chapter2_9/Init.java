package genius.test.chapter2_9;

public class Init {

    // 생성자
    Init() {
        // 생성자 초기화 블럭
        System.out.println("생성자");
    }

    static {
        // class 초기화 블럭
        System.out.println("클래스 초기화 블럭");
    }

    {
        //인스턴스 초기화 블럭
        System.out.println("인스턴스 초기화 블럭");
    }

    public static void main(String[] args) {
        System.out.println("main메서드 시작");
        System.out.println("Init 객체 생성");
        Init init1 = new Init();
        Init init2 = new Init();

        /**
         * 1. 클래스 초기화 블럭
         *  - static{}: 클래스가 메모리에 저장될 때 한 번만 실행
         *  2. 인스턴스 초기화 블럭
         *  - {}: 생성자와 용도와 차이가 없으며, 자주 사용하지 않음
         * */
    }
}
