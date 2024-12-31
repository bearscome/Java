package genius.test.chapter3_4;

import java.util.Arrays;

public class ReferenceEx {
    public static void main(String[] args) {
        // 배열 객체 생성
        int [] arr = {1, 2, 3};

        // 다른 배열 객체 선언
        int [] arr2 = arr;

        // 같은지 비교
        System.out.println("arr == arr2 = " + (arr == arr2));
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr2[1] = " + arr2[1]);

        arr2[1] = 4; // 참조형 이기 때문에 기존 배열 변수도 변경됨
        System.out.println(arr2[1]);
        System.out.println(arr[1]);

        int [] arr3 = {1,2,3};
        System.out.println(arr == arr3); // 값은 일치하지만 다른 주소를 참조하고 있음

        // 앞에서 배운 배열 복사
        int [] arr4 = Arrays.copyOf(arr3, arr3.length);
        System.out.println(arr == arr4);
    }
}
