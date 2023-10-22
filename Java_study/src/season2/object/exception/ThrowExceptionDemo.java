package season2.object.exception;

import java.io.*;

class B {
    void run() throws FileNotFoundException, IOException {
    /* 만약 exception이 일어날 경우 B의 run에
     * try, catch문을 사용할 수 있지만, C 클래스에 넘길 수도 있다.
     * B -> C -> ThrowExceptionDemo으로 넘길 수 있다.
     */
        BufferedReader bReader = null;
        String input = null;

        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();

        System.out.println(input);
    }
}

class C {
    void run() {
        B b = new B();
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
        C c = new C();
        c.run();
    }
}
