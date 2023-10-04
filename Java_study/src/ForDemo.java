public class ForDemo {
    public static void main(String[] args) {
        for (int i = 5; i < 20; i = i + 2) {
            System.out.println("IIII: " + i);

            if(i == 9) {
                System.out.println("contine: " + i);
                continue;
            }

            System.out.println("for: " + i);


            if(i == 13) {
                break;
            }

            for(int j = 0; j < 5; j++) {
                System.out.println("I: " + i + "J: " + j);
            }
        }
    }
}
