package pack;

import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new pack.a.User(); // import 문 사용으로 패키지 명 생략 가능
        User2 user2 = new pack.a.User2();
    }
}
