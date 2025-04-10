public class jaketDira {

    // Harga normal 
    public static final int HARGA_JAKET_A = 100000;
    public static final int HARGA_JAKET_B = 125000;
    public static final int HARGA_JAKET_C = 175000;

    // Harga diskon jika pembelian lebih dari 100 buah
    public static final int DISKON_JAKET_A = 95000;
    public static final int DISKON_JAKET_B = 120000;
    public static final int DISKON_JAKET_C = 160000;

    // Static method untuk hitung total harga jaket A
    public static int hitungJaketA(int jumlah) {
        if (jumlah > 100) {
            return jumlah * DISKON_JAKET_A;
        } else {
            return jumlah * HARGA_JAKET_A;
        }
    }

    // Static method untuk hitung total harga jaket B
    public static int hitungJaketB(int jumlah) {
        if (jumlah > 100) {
            return jumlah * DISKON_JAKET_B;
        } else {
            return jumlah * HARGA_JAKET_B;
        }
    }

    // Static method untuk hitung total harga jaket C
    public static int hitungJaketC(int jumlah) {
        if (jumlah > 100) {
            return jumlah * DISKON_JAKET_C;
        } else {
            return jumlah * HARGA_JAKET_C;
        }
    }
}
