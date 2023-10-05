public class ArrayDemo {
    public static void main(String[] args) {
//        String[] a = {"a", "b", "c"};
//        String[] a = new String[4];
//        System.out.println(a[1]);
//        System.out.println(a);

        String [] a = {"a", "b", "c"};

        for (int i = 0; i < a.length; i++) {
            String alpha = a[i];
            System.out.println("안녕 " + alpha);
        }

        for(String e: a) {
            // for-Each 문이래;
            System.out.println("안녕 " + e);
        }
    }
}
