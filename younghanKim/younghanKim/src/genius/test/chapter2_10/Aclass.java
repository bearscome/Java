package genius.test.chapter2_10;

import genius.test.chapter2_10_1.Cclass;

public class Aclass {
    // public 접근 제한자
    public void print() {
        System.out.println("여기는 Aclass");
    }

    public static void main(String[] args) {
        // Aclass 객체 생성
        Aclass ac = new Aclass();
        ac.print(); // public 접근 제한자

        // Bclass 객체 생성
        Bclass bc = new Bclass();
        bc.print(); // default 접근 제한자

        //Cclass 객체 생성
        Cclass cc =new Cclass();
//        cc.print(); //private 접근 제한자
    }
}
