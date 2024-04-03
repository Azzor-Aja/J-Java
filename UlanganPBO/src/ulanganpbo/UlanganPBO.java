package ulanganpbo;

import java.util.Scanner;

public class UlanganPBO{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;

        do {
            System.out.print("Masukkan jumlah siswa: ");
            int jumlahSiswa = input.nextInt();

            // Array untuk menyimpan data siswa
           
            String[] namaSiswa = new String[jumlahSiswa];
            double[] nilaiHarian1 = new double[jumlahSiswa];
            double[] nilaiHarian2 = new double[jumlahSiswa];
            double[] nilaiHarian3 = new double[jumlahSiswa];
            double[] nilaiRataRata = new double[jumlahSiswa];
            char[] grade = new char[jumlahSiswa];

            // Memasukkan data untuk setiap siswa
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.println("Masukkan data untuk siswa ke-" + (i+1) + ":");
                System.out.print("Masukkan nama siswa: ");
                namaSiswa[i] = input.next();

                System.out.print("Masukkan nilai ulangan harian 1: ");
                nilaiHarian1[i] = input.nextDouble();

                System.out.print("Masukkan nilai ulangan harian 2: ");
                nilaiHarian2[i] = input.nextDouble();

                System.out.print("Masukkan nilai ulangan harian 3: ");
                nilaiHarian3[i] = input.nextDouble();

                // Hitung nilai rata-rata
                nilaiRataRata[i] = (nilaiHarian1[i] + nilaiHarian2[i] + nilaiHarian3[i]) / 3;

                // Menentukan grade
                if (nilaiRataRata[i] >= 90 && nilaiRataRata[i] <= 100) {
                    grade[i] = 'A';
                } else if (nilaiRataRata[i] >= 80 && nilaiRataRata[i] < 90) {
                    grade[i] = 'B';
                } else if (nilaiRataRata[i] >= 70 && nilaiRataRata[i] < 80) {
                    grade[i] = 'C';
                } else if (nilaiRataRata[i] >= 60 && nilaiRataRata[i] < 70) {
                    grade[i] = 'D';
                } else {
                    grade[i] = 'E';
                }
            }

            // Menampilkan hasil untuk setiap siswa secara horizontal
            System.out.println("=======================================");
            System.out.println("             Data siswa:");
            System.out.println("=======================================");
            System.out.println("Nama  Nilai1   NIlai2   Nilai3  Rata-rata  Grade");
            for (int i = 0; i < jumlahSiswa; i++) {
            System.out.printf("%s\t %.0f\t %.0f\t   %.0f\t   %.0f\t     %c%n",
                                   namaSiswa[i], nilaiHarian1[i], nilaiHarian2[i], nilaiHarian3[i], nilaiRataRata[i], grade[i]);
            }
            System.out.println("");
            System.out.println("=======================================");
            System.out.print("Ingin mengulang (Y/N)? ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }
}