public class Aksi_MobilSport {
    public static void main(String[] s){
        //Pembuat Object
       MobilSport Sport = new MobilSport();
       MobilSport Standart = new MobilSport();

        //Memanggil Attribut dan nilai
        Sport.warna = "Hitam";
        Sport.PlatNomor = "BE 1122 NB";
        Standart.warna = "Putih";
        Standart.PlatNomor = "B 2112 HA";

        System.out.println("Sport warna = "+ Sport.warna);
        System.out.println("Sport Plat = "+ Sport.PlatNomor);

        System.out.println("Standart warna = "+Standart.warna);
        System.out.println("Standart Plat = "+Standart.PlatNomor);

    }
}
