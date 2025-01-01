package genius.test.chapter4_2;

public class SmartPhoneEx {
    public static void main(String[] args) {

        Phone p = new Phone();
        p.name = "전화기";
        p.company = "삼성";
        p.color = "화이트";

        System.out.println("Phone 객체 출력");
        System.out.println(p.name);
        System.out.println(p.company);
        System.out.println(p.color);
        p.call();
        p.receive();

        System.out.println("-----------------------------");

        SmartPhone sp = new SmartPhone();
        sp.name = "아이폰";
        sp.company = "애플";
        sp.color = "블랙";


        System.out.println("SmartPhone 객체 출력");
        System.out.println(sp.name);
        System.out.println(sp.company);
        System.out.println(sp.color);
        sp.call();
        sp.receive();
        sp.installApp();
    }
}
