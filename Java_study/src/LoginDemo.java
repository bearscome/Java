import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해 주세요");
        String id = sc.next();

//        System.out.println("args: " + args[0]);
//        String id = args[0];

        if(id.equals("test")) {
            System.out.println("TEST");
        } else {
            System.out.println("Wrong");
        }
    }
}
