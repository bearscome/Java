package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int [] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성 (배열 크기의 메모리 확보 (4byte * 5 = 20byte) => 메모리 확보 후 메모리 주소 반환 )

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("students = " + students[0]);




        for(int i = 0; i < students.length; i++) {
            System.out.println("students["+ (i+1) +"] = " + students[i]);
        }
    }
}
