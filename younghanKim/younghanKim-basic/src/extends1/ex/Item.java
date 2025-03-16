package extends1.ex;

public class Item {
    public String name;
    public int price;

    public Item(String name, int price) {
//        System.out.println("name: " + name + " 가격: " + price);
        this.name = name;
        this.price = price;
    }

    public void itemPrint() {
        System.out.println("이름: " + name + " 가격: " + price);
    }

    public int getPrice() {
        return price;
    }
}
