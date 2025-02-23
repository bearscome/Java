package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNameList = {"학생1", "학생2", "학생3"};
        int[] studentAgeList = {15, 90, 17};
        int[] studentGradeList = {90, 80, 70};

        for(int i = 0; i < studentNameList.length; i++) {
            System.out.println("이름: " + studentNameList[i] + " 나이: " + studentAgeList[i] + " 성적: " + studentGradeList[i]);
        }

    }
}
