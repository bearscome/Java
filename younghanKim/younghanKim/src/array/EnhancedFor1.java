package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //일반 for
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("numbers = " + numbers[i]);
        };

        // 향산된 for문 = for-each
        for(int number : numbers) {
            System.out.println("number = " + number);
        }
        // index가 필요한 경우에는 forEach문을 사용할 수 없다 (전달 받을 수 없음)
        
    }
}
