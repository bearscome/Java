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

        //        Iterator hi = (Iterator) A.iterator();
//        while (hi.hasNext()) {
//            System.out.println(hi.next());
//        }

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
    }
}
