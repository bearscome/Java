package static1;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
//        Data3.count++; -> 자기의 class이기 때문에 안 붙여도 돼 - static만 가능
        count++;
    }
}
