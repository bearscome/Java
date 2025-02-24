package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // null pointer exception 예외 발생
        System.out.println("data value = " + data.value); // 예외가 발생하면 밑의 코드는 실행하지 않음
    }
}
