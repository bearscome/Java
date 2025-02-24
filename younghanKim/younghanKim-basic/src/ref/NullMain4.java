package ref;

public class NullMain4 {
    public static void main(String[] args) {
        Bigdata bigData = new Bigdata();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // bigData.data는 참조형이라서 처음에 Null로 초기화 되어서
        // bigData.data.value 접근이 불가했지만,
        // data를 선언하면, Null에서 new Data가 선언되어 오류나지 않음
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
