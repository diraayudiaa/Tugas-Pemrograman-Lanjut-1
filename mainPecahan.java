import java.util.Scanner;

public class mainPecahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pecahanDira kalk = new pecahanDira(); // ✅ Membuat objek dari class pecahanDira

        System.out.println("Masukkan angka pertama:");
        double angka1 = input.nextDouble();

        System.out.println("Masukkan angka kedua:");
        double angka2 = input.nextDouble();

        // ✅ Memanggil static method dari class pecahanDira
        System.out.println("Penjumlahan: " + pecahanDira.tambah(angka1, angka2));
        System.out.println("Pengurangan: " + pecahanDira.kurang(angka1, angka2));

        // ✅ Memanggil non-static method dari objek kalk
        System.out.println("Perkalian: " + kalk.kali(angka1, angka2));
        System.out.println("Pembagian: " + kalk.bagi(angka1, angka2));

        System.out.println("\nMasukkan pembilang untuk pecahan:");
        int pembilang = input.nextInt();

        System.out.println("Masukkan penyebut untuk pecahan:");
        int penyebut = input.nextInt();

        // ✅ Memanggil method untuk menyederhanakan pecahan
        System.out.println("Pecahan sederhana: " + kalk.sederhana(pembilang, penyebut));

        input.close();
    }
}
