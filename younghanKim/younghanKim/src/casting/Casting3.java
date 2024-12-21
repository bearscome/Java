package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고 값
        long maxIntOver = 2147483648L; // int 최고 값 + 1 초과
        int intValue = 0;

        intValue = (int) maxIntValue; // 형 변환
        System.out.println("intValue = " + intValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println("intValue = " + intValue);

        // 값이 오버플로우가 된다면 최소점(int -214783648 )부터 시작하게 된다
    }
}
