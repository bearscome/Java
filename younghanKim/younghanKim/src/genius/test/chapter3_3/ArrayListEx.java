package genius.test.chapter3_3;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("홍길동");
        al.add(1);
        al.add(95.5);

        // 0번 인덱스 출력
        System.out.println(al.get(0));

        // 객체 길이 출력
        System.out.println(al.size());

        for(int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
