package genius.test.chapter3_4;

public class ArrEx {
    public static void main(String[] args) {

        // 원본 배열
        int [] arr1 = {1,2,3,4,5};

        // 복사할 대상 배열
        int [] arr2 = new int[10];

        // 배열 복사
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // 복사된 배열 확인
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
