package access.ex;

public class MaxCount {
    private int count;
    private int maxCount;

    public MaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public void increment() {
        if(count >= maxCount) {
            System.out.println("최대 갑슬 초과할 수 없습니다.");
        }
        else {
            count++;
        };
    }

    public int getCount() {
        return count;
    }
}
