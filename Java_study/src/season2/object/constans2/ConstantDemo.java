package season2.object.constans2;

//interface FRUIT {
//    int APPLE = 1, PEACH = 2, BANANA = 3;
//}
//
//interface COMPANY {
//    int GOOGLE = 1, APPLE = 2, ORACLE = 3;
//}

public class ConstantDemo {
    public final static int PRUIT_APPLE = 1;
    public final static int PRUIT_PEACH = 2;
    public final static int PRUIT_BANANA = 3;
    // private는 클래스 안에서만 사용
    // final는 상수를 의미
    // static은 클래스 변수
    // int는 숫자

    private final static int COMPANY_GOOGLE = 1;
    private final static int COMPANY_APPLE = 2;
    private final static int COMPANY_ORACLE = 3;

    public static void main(String[] args) {
        int type = PRUIT_APPLE;
        switch (type) {
            case PRUIT_APPLE:
                System.out.println("57");
                break;
            case PRUIT_PEACH:
                System.out.println("34");
                break;
            case PRUIT_BANANA:
                System.out.println("93");
                break;

        }
    }
}
