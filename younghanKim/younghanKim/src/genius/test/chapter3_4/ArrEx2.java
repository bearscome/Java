package genius.test.chapter3_4;

public class ArrEx2 {
    public static void main(String[] args) {
        // 원본 배열
        int [] arr1 = {1,2,3,4,5};

        // 복사할 대상 배열
        int [] arr2 = new int[10];

        /**
         * 복사
         * System.arraycopy(src, srcPos, dest, destPos, length);
         * src: 원본 (arr1)
         * srcPos: 시작 인덱스
         * dest: 대입할 변수 (arr2)
         * destPos: 시작 인덱스
         * length: 개수
         *
         * */
        System.arraycopy(arr1, 2, arr2, 2, 2);

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
