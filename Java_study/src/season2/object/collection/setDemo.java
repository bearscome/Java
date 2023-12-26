package season2.object.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class setDemo {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        // HashSet은 중복된 값은 제거한다.
        // Javascript의 set이랑 동일하네..
        ArrayList<Integer> B = new ArrayList<Integer>();


        A.add(1);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(3);

        Iterator hi = (Iterator) A.iterator();
        while (hi.hasNext()) {
            System.out.println(hi.next());
        }

//        HashSet<Integer> B = new HashSet<Integer>();
//        B.add(1);
//        B.add(2);
//        B.add(3);
//
//        HashSet<Integer> C = new HashSet<Integer>();
//        C.add(1);
//        C.add(2);
//        C.add(3);
    }
}
