
public class pecahanDira {

    // message error pembagian dengan nol
    public static final String PESAN_ERROR_PEMBAGIAN = "Pembagian dengan nol tidak diperbolehkan.";

    // static method untuk penjumlahan dua angka
    public static double tambah(double a, double b) {
        return a + b;
    }

    // static method untuk pengurangan dua angka
    public static double kurang(double a, double b) {
        return a - b;
    }

    // non-static method untuk perkalian dua angka
    public double kali(double a, double b) {
        return a * b;
    }

    // non-static method untuk pembagian dua angka, dengan pengecekan pembagi nol
    public double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException(PESAN_ERROR_PEMBAGIAN); // Menggunakan konstanta final
        }
        return a / b;
    }

    // non-static method untuk menyederhanakan pecahan
    public String sederhana(int pembilang, int penyebut) {
        int gcd = gcd(pembilang, penyebut); // Menghitung FPB (GCD)
        return (pembilang / gcd) + "/" + (penyebut / gcd); // Mengembalikan hasil pecahan yang telah disederhanakan
    }

    // mencari FPB 
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b); // mencari GCD
    }
}
