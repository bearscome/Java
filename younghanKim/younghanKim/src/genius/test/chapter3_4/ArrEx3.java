package genius.test.chapter3_4;

import java.util.Arrays;

public class ArrEx3 {
    public static void main(String[] args) {
        // 원본 배열
        int [] arr1 = {1,2,3,4,5};

        // 복사할 대상 배열
        int [] arr2 = Arrays.copyOf(arr1, 10);

        /**
         * Arrays.copyOf(original, newLength)
         * original: 원본
         * newLength: 개수
         * */

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        for(int v: arr2) {
            System.out.println(v);
        }

    }
}
