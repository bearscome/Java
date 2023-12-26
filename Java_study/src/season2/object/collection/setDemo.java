package season2.object.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class setDemo {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        // HashSet은 중복된 값은 제거한다.
        // Javascript의 set이랑 동일하네..
//        ArrayList<Integer> B = new ArrayList<Integer>();

        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B));
        // false A: 123, B: 345 -> 여집합
        System.out.println(A.containsAll(C));
        // true A: 123, B: 12 -> 부분집합

//        A.addAll(B);
        // B를 A에 모두 넣는다
//        System.out.println(A);
        // [1,2,3,4,5];

//        A.retainAll(B);
        // A와 B의 교집의합의 값을 넣는다
//        System.out.println(A);

//        A.removeAll(B);
        // A와 B의 교집합을 제거한다 (차집합)
//        System.out.println(A);

        //https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/module/516/2164.gif


        Iterator hi = (Iterator) A.iterator();
        // A의 값을 Interator의 type으로 변경 후
        // A를 복제하여 hi에 대입한다
        while (hi.hasNext()) {
            // hasNext() hi 안에 해당 값이 있는지 확인 [true, false]
            System.out.println(hi.next());
            // next() 메소드 호출 시 랜덤으로 해당 값을 리턴 받은 뒤
            // 리턴 받은 값을 hi에서 삭제한다.
        }
    }
}
