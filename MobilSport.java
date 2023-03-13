public class MobilSport {
    String warna;
    String PlatNomor;
    int speed = 0;

    void tambahSpeed(){
    speed = speed + 1;
    System.out.println("Speed saat ini = "+speed);
    }

    void kurangSpeed(){
    speed = speed - 1;
    System.out.println("Speed saat ini = "+speed);
    }
}
