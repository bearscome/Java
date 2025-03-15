package final1.ex;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
        // this.id = id; final로 선언되어 있어서 변경하지 못함
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + " name: " + name);
    }

    public final void test() {
        System.out.println("test");
    }
}
