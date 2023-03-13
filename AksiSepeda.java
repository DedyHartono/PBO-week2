public class AksiSepeda {
    public static void main(String[] args) { 
        //membuat objek
        Sepeda MotorBalap= new Sepeda(); 
        Sepeda sepedaMotor= new Sepeda();
        
        //mengakses atribut dan method
        sepedaMotor.jenis = "sepeda Motor";
         sepedaMotor.merk= "Honda";
        int gearSepeda = MotorBalap.gear; 
            System.out.println("Sepeda dengan jenis "+sepedaMotor.jenis);
                System.out.println("Dengan Merk "+sepedaMotor.merk);
                    System.out.println("Memiliki 2 roda ");
        
         System.out.println("Jumlah gear sepeda "+gearSepeda );
        MotorBalap.ngerem(); 
        } 
}
