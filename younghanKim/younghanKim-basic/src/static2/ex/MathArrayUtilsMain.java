package static2.ex;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5};

        System.out.println("sun = " + MathArrayUtils.sum(value));
        System.out.println("average = " + MathArrayUtils.average(value));

        MathArrayUtils.min(value);
        MathArrayUtils.max(value);

    }
}
