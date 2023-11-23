package season2.object.exception;

import java.io.IOException;

class E {
    void throwArithmeticException() {
        throw new ArithmeticException();
    }

    void throwIOException1() {
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void throwIOException2() throws IOException {
        throw new IOException();
    }

    /**
     * Throwable은 최상위 오브젝트이다
     * 1.Error 오브젝트는 메모리, 하드디스크 등 개발자가 코드상으로 에러를 낸 것이 아닌 오류를 말한다
     * 2.Exception 오브젝트
     *  1. IOException
     *   1 .RuntimeException가 없는 경우에는 checkd
     *   2. try, catch, throws를 명시해야함
     *     - 예외 처리가 필수임
     *  2. RuntimeException -> arithmeticException
     *   1. RuntimeException가 있는 경우에는 unCheckd
     *   2. try, catch, throws를 명시 안 해도 됌
     *     - 예외 처리 필요 없음
     * */
}

public class ThrowExceptionDemo2 {
}
