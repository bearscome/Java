package season2.object.exception;

class A {
    private int[] arr = new int[3];
    A() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }

    public void z(int _first, int _twice) {
        try {
            System.out.println(arr[_first] / arr[_twice]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException" + e);
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        // 여러개의 오류 타입에 따라 확인이 가능하다.
    }
}

public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
//        a.z(10, 1);
//        ArrayIndexOutOfBoundsException: 배열의 인덱스를 벗어났다
        a.z(1, 0);
//        ArithmeticException: 0으로 나눌 수 없다
    }
}
