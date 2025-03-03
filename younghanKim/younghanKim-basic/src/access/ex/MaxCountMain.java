package access.ex;

public class MaxCountMain {
    public static void main(String[] args) {
        MaxCount counter = new MaxCount(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
