package ref;

public class MethodeChange2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        System.out.println("value = " + data.value);
        changeReference(data);
        System.out.println("value = " + data.value);
    }

    public static void changeReference(Data data) {
        data.value = 20;
    }
}
