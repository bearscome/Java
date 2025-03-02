package access;

public class Speaker {
    int volume;

    Speaker(int volume) {
        this.volume = volume;
    };

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("음량을 증가할 수 업습니다. 최대 음량이빈다");
        }
        else {
            volume += 10;
            System.out.println("음량을 10 증가 합니다. " + volume);
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨을 10 감소합니다.");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
