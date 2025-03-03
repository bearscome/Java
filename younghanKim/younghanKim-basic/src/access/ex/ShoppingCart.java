package access.ex;

public class ShoppingCart {
    private Item[] items= new Item[10];
    private int itemCount = 0;

    public void addItem(Item data) {
        if(itemCount >= items.length) {
            System.out.println("10개를 초과할 수 없습니다");
            return;
        }


        items[itemCount] = data;
        itemCount++;
    }

    public void displayItems() {
        for(int i = 0; itemCount > i; i++) {
            Item item = items[i];

            String itemName = item.getName();
            int itemTotalPrice = item.getTotalPrice();
            System.out.println("상품명: " +  itemName + " 합계: " + itemTotalPrice);

        }

        System.out.println("전체 가격의 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int total = 0;

        for(int i = 0; itemCount > i; i++) {
            Item item = items[i];

            total += item.getTotalPrice();
        };

        return total;
    }

}
