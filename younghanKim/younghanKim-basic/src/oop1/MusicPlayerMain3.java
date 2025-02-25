package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData MusicPlayerData = new MusicPlayerData();

        on(MusicPlayerData);
        volumeUp(MusicPlayerData);
        volumeUp(MusicPlayerData);
        volumeDown(MusicPlayerData);
        showStatus(MusicPlayerData);
        off(MusicPlayerData);
    }

    static void on (MusicPlayerData MusicPlayerData) {
        // 음악 플레이어 켜기
        MusicPlayerData.isOn  = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off (MusicPlayerData MusicPlayerData) {
        // 음악 플레이어 끄기
        MusicPlayerData.isOn= false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp (MusicPlayerData MusicPlayerData) {
        // 볼륨증가
        MusicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨: " + MusicPlayerData.volume);
    }

    static void volumeDown (MusicPlayerData MusicPlayerData) {
        // 볼륨감소
        MusicPlayerData.volume--;
        System.out.println("음악 플레이어 볼륨: " + MusicPlayerData.volume);
    }

    static void showStatus (MusicPlayerData MusicPlayerData) {
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(MusicPlayerData.isOn) {
            System.out.println("음악 플레이어 ON, 현재 볼륨: " + MusicPlayerData.volume);
        }
        else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
