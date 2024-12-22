package array.ex.Array;

public class ex1 {
    public static void main(String[] args) {
        int [] student = {90,80,70,60,50};
        int total = 0;
        double average = 0;


        for (int i : student) {
            total += i;
        };

        average = (double) total / student.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
