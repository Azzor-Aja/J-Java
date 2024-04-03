package javapbo;
import java.util.Scanner;
   
class DiskonHarga {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);

    System.out.println("========================================");       
    System.out.println("=  Program Java Diskon Potongan Harga  =");
    System.out.println("========================================");
    System.out.println();
        
    int total_belanja;
    double harga_akhir, harga_diskon;
    
    System.out.println(); 
    System.out.println("========================================");       
    System.out.println("=    Silahkan Masukan Total Belanja    =");
    System.out.println("========================================");
    
    System.out.print("     Nama Barang : ");
    String name = input.nextLine();
    System.out.print("     Harga Barang: Rp.");
    total_belanja = input.nextInt();
    
    System.out.println("========================================"); 
     
    if ( (total_belanja > 0) && (total_belanja < 500000)) {
        
      harga_diskon = 0.1 * total_belanja;
      harga_akhir = total_belanja - harga_diskon;
      
      System.out.println();
      System.out.println("=========================================");
      System.out.println("=   Selamat, anda mendapat diskon 10%   =");
      System.out.println("=========================================");
      System.out.println("    Nama Barang  = " + name );
      System.out.println("    Diskon 10%   = Rp." + harga_diskon );
      System.out.println("    Harga Diskon = Rp." + harga_akhir  );
      System.out.println("=========================================");
      
    }else if (total_belanja >= 500000) {
        
      harga_diskon = 0.3 * total_belanja;
      harga_akhir = total_belanja - harga_diskon;
      
      System.out.println();
      System.out.println("=========================================");
      System.out.println("=   Selamat, anda mendapat diskon 30%   =");
      System.out.println("=========================================");
      System.out.println("    Nama Barang  = " + name );
      System.out.println("    Diskon 30%   = Rp." + harga_diskon );
      System.out.println("    Harga Diskon = Rp." + harga_akhir  );
      System.out.println("=========================================");
    
    } else {
      System.out.println("anda tidak berbelanja");
    }
  }
}
