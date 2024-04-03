package mobil1;
public class RegistrasiMobil {
public static void main(String args[]) {
Mobil1 m1 = new Mobil1();
m1.inputDataMobill();
System.out.println("--------DATA MOBIL------------");
System.out.printf("%s\t\t%s\t%s\t%s\t\n", "No.PLAT","WARNA", "PABRIKAN", "TAHUN");
System.out.println("------------------------------");
m1.infoMobill();
System.out.println("------------------------------");
System.out.println("Proses Identifikasi....");
m1.cekMobill();
System.out.println("--------Terima Kasih----------");

}
}
