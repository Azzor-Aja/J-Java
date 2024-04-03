package mobil1;
import java.util.Scanner;
    public class Mobil1 {
    public int noPlat;
    public String warna;
    public String manufaktur;
    public int tahun;
    Scanner inp = new Scanner(System.in);
    int n;
    Mobil1[] mbl;
    Pelanggan pl = new Pelanggan("Eljava", 12345);

    public void inputDataMobill() {
        System.out.print("Masukan Jumlah Mobil : ");
        n = inp.nextInt();
        mbl = new Mobil1[n];

        for (int i = 0; i < mbl.length; i++) {
            mbl[i] = new Mobil1();
            System.out.println("----Data mobil ke-" + (i + 1)+ "-----");
            System.out.print("Nomor Plat\t:");
            mbl[i].noPlat = inp.nextInt();
            System.out.print("Warna\t\t:");
            mbl[i].warna = inp.next();
            System.out.print("Manufaktur\t:");
            mbl[i].manufaktur = inp.next();
            System.out.print("Tahun\t\t:");
            mbl[i].tahun = inp.nextInt();
            System.out.println("--------------------------");
             }
    }

    public void infoMobill() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%s\t\t%s\t%s\t\t%s\n",
            mbl[i].noPlat, mbl[i].warna,
            mbl[i].manufaktur, mbl[i].tahun);
        }
    }

    public void cekMobill() {
        for (int i = 0; i < n; i++) {
            if (mbl[i].noPlat == pl.getKode()) {
                pl.infoPelanggan();
                System.out.printf("adalah pemilik Mobil %s Warna %s\n", mbl[i].manufaktur,mbl[i].warna);
            }
        }
    }
    }
