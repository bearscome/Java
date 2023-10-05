public class MethodDemo {
    public static int numbering(int _a, int _limit) {
        // public 몰라
        // static 몰라
        // int는 리턴 하는 타입 -> int를 리턴한다.
        int i = _a;
        int limit = _limit;
        int ouput = 0;

        while (i < limit) {
            ouput += i;
            i++;
        }

        return ouput;
    }

    public static void main(String[] args) {
        // void는 리턴하는 값이 없다.
        int num = numbering(1,5);

        System.out.println(num);
    }
}
