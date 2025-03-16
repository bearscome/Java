package extends1.ex;

public class Album extends Item {
    public String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    public void print() {
        itemPrint();
        System.out.println("- artist: " + artist);
    }
}
