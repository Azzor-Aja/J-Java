package mobil3;

import java.util.Scanner;
public class Mobil {
    public int noPlat;
    public String warna;
    public String manufaktur;
    public int tahun;
    Scanner inp = new Scanner(System.in);
    int n;
    Mobil[] mbl;
    Pelanggan pl = new Pelanggan("Eljava", 12345);
    public void inputDataMobil() {
        System.out.print("Masukan Jumlah Mobil : ");
        n = inp.nextInt();
        mbl = new Mobil[n];
        for (int i = 0; i < mbl.length; i++) {
            mbl[i] = new Mobil();
            System.out.println("----Data mobil ke-" + (i + 1)
            + "-----");
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
    public void infoMobil() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%s\t\t%s\t%s\t\t%s\n",
                mbl[i].noPlat, mbl[i].warna,
                mbl[i].manufaktur, mbl[i].tahun);
        }
    }
    public void cekMobil() {
        for (int i = 0; i < n; i++) {
            if (mbl[i].noPlat == pl.getKode()) {
                pl.infoPelanggan();
                System.out.printf("adalah pemilik Mobil %s Warna %s\n", mbl[i].manufaktur,mbl[i].warna);
            }
        }
    }
}

