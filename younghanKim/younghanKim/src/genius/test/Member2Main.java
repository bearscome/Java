package genius.test;

public class Member2Main {
    public static void main(String[] args) {
        Member2 mem = new Member2("홍길동", 30);

        System.out.println(mem.age);
        System.out.println(mem.name);

        Member2 mem1 = new Member2();
        Member2 mem2 = new Member2("홍길동");
        Member2 mem3 = new Member2(30);

    }
}
