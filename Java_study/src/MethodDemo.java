import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodDemo {
    public static int numbering(int _init, int _limit) {
        // public 몰라
        // static 몰라
        // int는 리턴 하는 타입 -> int를 리턴한다.
        int i = _init;
        int limit = _limit;
        int output = 0;

        while (i < limit) {
            output += i;
            i++;
        }

        return output;
    }

    public static void main(String[] args) {
        // void는 리턴하는 값이 없다.
        int num = numbering(1,5);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(num);
            out.close();
        } catch (IOException e) {
            System.out.println("Fail Saved File");
            throw new RuntimeException(e);
        }

        System.out.println(num);
    }
}
