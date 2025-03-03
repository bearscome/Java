package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        methode1(10);
        System.out.println("main end");
        methode2(20);

    }

    static void methode1(int m1){
        System.out.println("methode1 start");
        int cal = m1 * 2;
        methode2(cal);
        System.out.println("methode1 end");

    }
    static void methode2(int m2){
        System.out.println("methode2 start");
        System.out.println("methode2 end");
    }
}
