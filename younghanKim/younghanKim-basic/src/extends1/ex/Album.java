package extends1.ex;

public class Album extends Item {
    public String artist;

    public Album(String name, int price, String artist) {
        super(name, price);

        System.out.println("- artist: " + artist);
        this.artist = artist;
    }
}
