package genius.test.chapter3_3;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {

        // Member 객체 생성
        Member m = new Member();
        m.setName("홍길동");
        m.setNumber(1);
        m.setScore(89505.4);

        ArrayList al = new ArrayList();
        al.add(m);


        // al.get(0).getName();
        // 객체에 접근이 가능해야 하는데, 접근 할 수 없음

        // 형변환을 통해 접근 해야함
        // get mothode는 object를 리턴하기 때문에 member의 객체가 아니여서 형 변환을 해줘야 
        // member methode 접근 가능
        Member m2 = (Member) al.get(0);
        System.out.println(m2.getName());
        System.out.println(m2.getNumber());
        System.out.println(m2.getScore());


    }
}
