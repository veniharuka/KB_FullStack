//package afternoon.access.quiz;
//
//public class Speaker {
//    private int volume;
//    public Speaker(){
//       this.volume = 20;
//    }
//
//    public void volumeUp(){
//        this.volume++;
//        System.out.println("현재 소리 크기는 : " + this.volume);
//        if(this.volume > 100){
//            System.out.println("더 이상 볼륨 조절이 불가능합니다");
//        }
//    }
//
//    public void volumeDown(){
//        this.volume--;
//        System.out.println("현재 소리 크기는 : " + this.volume);
//        if(this.volume < 0){
//            System.out.println("더 이상 볼륨 조절이 불가능합니다.");
//        }
//    }
//
//    public void mute() {
//        this.volume = 0;
//        System.out.println("스피커가 Mute 되었습니다.");
//    }
//
//
//
//
//
//}
package afternoon.access.quiz;

public class Speaker {
    private int volume;

    public Speaker() {
        this.volume = 20;
    }

    public void volumeUp() {
        adjustVolume(1);
    }

    public void volumeDown() {
        adjustVolume(-1);
    }

    public void mute() {
        this.volume = 0;
        System.out.println("스피커가 Mute 되었습니다.");
    }

    private void adjustVolume(int change) {
        this.volume += change;
        System.out.println("현재 소리 크기는 : " + this.volume);
        if (this.volume > 100) {
            System.out.println("더 이상 볼륨 조절이 불가능합니다");
            this.volume = 100;
        } else if (this.volume < 0) {
            System.out.println("더 이상 볼륨 조절이 불가능합니다.");
            this.volume = 0;
        }
    }
}
