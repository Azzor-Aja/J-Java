package mobil3;

public class RegistrasiMobil {
    public static void main(String args[]) {
        Mobil m1 = new Mobil();
        m1.inputDataMobil();
        System.out.println("--------DATA MOBIL------------");
        System.out.printf("%s\t\t%s\t%s\t%s\t\n", "No.PLAT", "WARNA", "PABRIKAN", "TAHUN");
        System.out.println("------------------------------");
        m1.infoMobil();
        System.out.println("------------------------------");
        System.out.println("Proses Identifikasi....");
        m1.cekMobil();
        System.out.println("--------Terima Kasih----------");
    }

}
