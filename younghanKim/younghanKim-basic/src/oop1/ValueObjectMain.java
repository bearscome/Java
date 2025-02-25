package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();
        data.add();
        data.add();
        data.add();

        System.out.println("데이터의 총 합은 " + data.value);
    }
}
