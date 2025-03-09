package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }


    public static int sum(int[] value) {
        int total = 0;

        for (int i : value) {
            total += i;
        }
        ;
        return total;
    }

    public static double average(int[] value) {
        return (double) sum(value) / value.length;
    }

    public static void min(int[] value) {
        int min = value[0];

        for (int i = 0; i < value.length; i++) {
            min = Math.min(min, value[i]);
        }

        System.out.println("sum = " + min);
    }

    public static void max(int[] value) {
        int max = value[0];

        for (int i = 0; i < value.length; i++) {
            max = Math.max(max, value[i]);
        }

        System.out.println("sum = " + max);
    }
}
