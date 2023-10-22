package season2.object.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        String input = null;

        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            input = bReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(input);
    }
}
