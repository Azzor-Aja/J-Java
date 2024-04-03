package mobil;
public class RegistrasiMobil {
    public static void main(String args[]) {
        Mobil m1 = new Mobil();
        m1.setNoPlat(12345);
        m1.setWarna("Abu-Abu Metalik");
        m1.setManufaktur("SUZUKI");
        m1.setTahun(2015);
        System.out.println("----------DATA MOBIL----------");
        System.out.println("No Plat :"+m1.getNoPlat());
        System.out.println("Warna Mobil:"+m1.getWarna());
        System.out.println("Mrk Mobil :"+m1.getManufaktur());
        System.out.println("Tahun :"+m1.getTahun());
        System.out.println("------------------------------");
    }

}
