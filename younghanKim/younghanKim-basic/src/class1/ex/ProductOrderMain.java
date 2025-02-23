package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] ProductOrderList = new ProductOrder[3];
        int totalPrice = 0;

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;
        ProductOrderList[0] = tofu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        ProductOrderList[1] = kimchi;


        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;
        ProductOrderList[2] = cola;



        for (ProductOrder productOrder : ProductOrderList) {
            System.out.println("상품명: " + productOrder.productName + " 가격: " + productOrder.price + " 수량: " + productOrder.quantity);
            totalPrice += productOrder.price * productOrder.quantity;
        }

        System.out.println("총 결제 금액: " + totalPrice);
    }
}
