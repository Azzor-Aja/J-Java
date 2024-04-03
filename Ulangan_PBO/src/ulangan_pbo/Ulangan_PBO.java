package ulangan_pbo;
import java.util.Scanner;

public class Ulangan_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;
        
        do {
            System.out.println("======================================");
            System.out.println("=  Program Perhitungan Bangun Datar  =");
            System.out.println("======================================");
            System.out.println("=  Menu:                             =");
            System.out.println("=  1. Persegi                        =");
            System.out.println("=  2. Persegi Panjang                =");
            System.out.println("=  3. Lingkaran                      =");
            System.out.println("=  4. Segitiga                       =");
            System.out.println("=  0. Keluar                         =");
            System.out.println("======================================");
            System.out.print("    Pilih bangun datar (0-4): ");
            int pilihan = input.nextInt();
            System.out.println("======================================");
            System.out.println("");
            
            switch (pilihan) {
                case 1:
                    hitung(input, "persegi");
                    break;
                case 2:
                    hitung(input, "persegi panjang");
                    break;
                case 3:
                    hitung(input, "lingkaran");
                    break;
                case 4:
                    hitung(input, "segitiga");
                    break;
                case 0:
                    System.out.println("======================================");
                    System.out.println("=           Terima kasih!            =");
                    System.out.println("======================================");
                    System.exit(0);
                    break;
                default:
                    System.out.println("======================================");
                    System.out.println("=        Pilihan tidak valid.        =");
                    System.out.println("======================================");
                    break;
            }
            
            do {
                System.out.println("");
                System.out.println("======================================");
                System.out.println("   Apakah ingin menghitung lagi?");
                System.out.print("  (Y/y untuk ya, N/n untuk tidak): ");
                ulang = input.next();
                System.out.println("======================================");
                System.out.println("");
            } while (!ulang.equalsIgnoreCase("Y") && !ulang.equalsIgnoreCase("N"));
        } while (ulang.equalsIgnoreCase("Y"));
        
        System.out.println("Terima kasih!");
        
        input.close();
    }
    
    public static void hitung(Scanner input, String namaBangun) {
        System.out.println("======================================");
        System.out.println("=    Apa yang ingin Anda hitung??    =");
        System.out.println("======================================");
        System.out.println("=  Menu:                             =");
        System.out.println("=  1. Luas                           =");
        System.out.println("=  2. Keliling                       =");
        System.out.println("======================================");
        System.out.print("    Pilih (1/2): ");
        int pilihan = input.nextInt();
        System.out.println("======================================");
        
        switch (pilihan) {
            case 1:
                hitungLuas(input, namaBangun);
                break;
            case 2:
                hitungKeliling(input, namaBangun);
                break;
            default:
                System.out.println("======================================");
                System.out.println("=       Pilihan tidak valid.         =");
                System.out.println("======================================");
                break;
        }
    }
    
    public static void hitungLuas(Scanner input, String namaBangun) {
        switch (namaBangun) {
            case "persegi":
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=            Luas Persegi            =");
                System.out.println("======================================");
                System.out.print("  Masukkan sisi persegi: ");
                double sisiPersegi = input.nextDouble();
                double luasPersegi = sisiPersegi * sisiPersegi;
                System.out.println("  Luas persegi: " + luasPersegi);
                System.out.println("======================================");
                break;
            case "persegi panjang":
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=        Luas Persegi Panjang        =");
                System.out.println("======================================");
                System.out.print("  Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.print("  Masukkan lebar persegi panjang: ");
                double lebar = input.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                System.out.println("  Luas persegi panjang: " + luasPersegiPanjang);
                System.out.println("======================================");
                break;
            case "lingkaran":
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=           Luas Lingkaran           =");
                System.out.println("======================================");
                System.out.print("  Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
                System.out.println("  Luas lingkaran: " + luasLingkaran);
                System.out.println("======================================");
                break;
            case "segitiga":
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=           Luas Segitiga            =");
                System.out.println("======================================");
                System.out.print("  Masukkan alas segitiga: ");
                double alasSegitiga = input.nextDouble();
                System.out.print("  Masukkan tinggi segitiga: ");
                double tinggiSegitiga = input.nextDouble();
                double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
                System.out.println("  Luas segitiga: " + luasSegitiga);
                System.out.println("======================================");
                break;
            default:
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=    Nama bangun tidak dikenali.     =");
                System.out.println("======================================");
                break;
        }
    }
    
    public static void hitungKeliling(Scanner input, String namaBangun) {
        switch (namaBangun) {
            case "persegi":
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=          Keliling Persegi          =");
                System.out.println("======================================");
                System.out.print("  Masukkan sisi persegi: ");
                double sisiPersegi = input.nextDouble();
                double kelilingPersegi = 4 * sisiPersegi;
                System.out.println("  Keliling persegi: " + kelilingPersegi);
                System.out.println("======================================");
                break;
            case "persegi panjang":
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=      Keliling Persegi Panjang      =");
                System.out.println("======================================");
                System.out.print("  Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.print("  Masukkan lebar persegi panjang: ");
                double lebar = input.nextDouble();
                double kelilingPersegiPanjang = 2 * (panjang + lebar);
                System.out.println("  Keliling persegi panjang: " + kelilingPersegiPanjang);
                System.out.println("======================================");
                break;
            case "lingkaran":
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=          Keliling Lingkaran        =");
                System.out.println("======================================");
                System.out.print("  Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                double kelilingLingkaran = 2 * Math.PI * jariJari;
                System.out.println("  Keliling lingkaran: " + kelilingLingkaran);
                System.out.println("======================================");
                break;
            case "segitiga":
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=          Keliling Segitiga         =");
                System.out.println("======================================");
                System.out.print("  Masukkan sisi pertama segitiga: ");
                double sisi1 = input.nextDouble();
                System.out.print("  Masukkan sisi kedua segitiga: ");
                double sisi2 = input.nextDouble();
                System.out.print("  Masukkan sisi ketiga segitiga: ");
                double sisi3 = input.nextDouble();
                double kelilingSegitiga = sisi1 + sisi2 + sisi3;
                System.out.println("  Keliling segitiga: " + kelilingSegitiga);
                System.out.println("======================================");
                break;
                
            default:
                System.out.println("");
                System.out.println("======================================");
                System.out.println("=    Nama bangun tidak dikenali.     =");
                System.out.println("======================================");
                break;
        }
    }
}