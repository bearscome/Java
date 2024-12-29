package genius.test.chapter2_10;

public class Student {
    private int number;
    private int grade;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade < 1 || grade > 4) {
            System.out.println("학년 오류");
        }
        else {
            this.grade = grade;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
