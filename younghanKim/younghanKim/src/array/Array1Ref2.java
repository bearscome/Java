package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int [] students; // 배열 변수 선언
        students = new int[]{90, 80, 70}; // 배열 생성과 초기화


        for(int i = 0; i < students.length; i++) {
            System.out.println("students["+ (i+1) +"] = " + students[i]);
        }
    }
}
