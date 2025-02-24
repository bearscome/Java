package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] ProductOrderList = new ProductOrder[3];
        int totalPrice = 0;

        ProductOrderList[0] = createOrder("두부", 2000, 2);
        ProductOrderList[1] = createOrder("김치", 5000, 1);
        ProductOrderList[2] = createOrder("콜라", 1500, 2);

        printOrders(ProductOrderList);
        totalPrice = getTotalAmount(ProductOrderList);

        System.out.println("총 가격 = " + totalPrice);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품 명 = "+ order.productName + " 가격 = " + order.price + " 수량 = " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount+= order.price * order.quantity;
        }

        return totalAmount;
    }
}
