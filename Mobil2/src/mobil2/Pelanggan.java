package mobil2;

public class Pelanggan {
 public String nama;
 public int kode;
 public Pelanggan(String nm , int kd){
 this.nama = nm;
 this.kode = kd;
 }
 public void infoPelanggan(){
 System.out.printf("Nama:%s dengan Kode Pelangan : %s\n",nama,kode);
 }

}
