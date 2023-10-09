package season2.object.package3;

import season2.object.package2.*;
import season2.object.package1.*;

public class C {
    public static void main(String[] args) {
//        B b = new B()
//        와일드 카드로 클래스 로드일 때 동일한 이름의 클래스가 있으면
//        모호하기 때문에 오류를 리턴한다.

        season2.object.package2.B b = new season2.object.package2.B();
//        패키지를 명시함으로써 명확하게 명시한다.
    }
}
