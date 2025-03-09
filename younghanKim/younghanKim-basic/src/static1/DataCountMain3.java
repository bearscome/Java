package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        // 스테틱 변수인 경우 힙 영역에서 메소드 영역으로 변수 확인하로 감
        // 정적 변수의 경우 인스턴스를 통한 접근은 추천하지 않는디ㅏ.
        // 코드를 읽을 때 마치 인스턴스 변수에 접근하는 것처럼 보일 수 있다
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
    }
}
