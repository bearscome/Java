package static2.ex;

public class Car {
    private static int total;
    private String carName;

    public Car(String carName) {
        this.carName = carName;
        total++;

        System.out.println("차량 구입, 이름: " + carName);
    }

    static void showTotalCars() {
        System.out.println("구매한 차량 수: " + total);
    }
}
