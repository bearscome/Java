package ref;

public class NullMain3 {
    public static void main(String[] args) {
        Bigdata bigData = new Bigdata();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException
        // Data data = null이기 때문에 value를 들어갈 수 없음
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
