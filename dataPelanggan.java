class Pelanggan { //untuk menyimpan data transaksi tiap pelanggan
    private final String nomorPelanggan;
    private final String nama;
    private double saldo;
    private final String pin;
    private int percobaanSalah = 0;
    private boolean diblokir = false;

    // konstruktor
    public Pelanggan(String nomorPelanggan, String nama, double saldo, String pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
    }
    // getter nomor pelanggan
    public String getNomorPelanggan() {
        return nomorPelanggan;
    }
    //getter nama pelanggan
    public String getNama() {
        return nama;
    }
    // untuk cek apakah akun pelanggan telah diblokir
    public boolean isDiblokir() {
        return diblokir;
    }

     // autentikasi menggunakan PIN pelanggan
     public boolean autentikasi(String inputPIN) {
        if (diblokir) return false; // jika sudah diblokir, otomatis gagal

        if (this.pin.equals(inputPIN)) {
            percobaanSalah = 0; // reset percobaan jika berhasil
            return true;
        } else {
            percobaanSalah++; // untuk tambahkan hitungan salah
            if (percobaanSalah >= 3) {
                diblokir = true; // blokir akun setelah 3 kali gagal
            }
            return false;
        }
    }
    //top up saldo
    public void topUp(double jumlah) {
        saldo += jumlah;
        System.out.println("Top up berhasil. Saldo saat ini: Rp " + saldo);
    }
    //transaksi pembelian
    public void beli(double jumlah) {
        if (saldo - jumlah < 10000) {
            System.out.println("Transaksi gagal. Saldo tidak mencukupi (minimum Rp10.000 harus tersisa).");
            return;
        }
        // cek apakah saldo setelah pembelian masih di atas Rp10.000
        double cashback = hitungCashback(jumlah);
        saldo = saldo - jumlah + cashback;
        System.out.println("Transaksi berhasil.");
        System.out.println("Cashback: Rp " + cashback);
        System.out.println("Saldo saat ini: Rp " + saldo);
    }
    // Hitung cashback berdasarkan jenis rekening dan jumlah
    private double hitungCashback(double jumlah) {
        String kodeJenis = nomorPelanggan.substring(0, 2);
        double cashback = 0;

         // cashback jika pembelian > 1jt
        if (jumlah > 1000000) {
            switch (kodeJenis) {
                case "38": cashback = jumlah * 0.05; break; // Silver
                case "56": cashback = jumlah * 0.07; break; // Gold
                case "74": cashback = jumlah * 0.10; break; // Platinum
            }
        } else {
        // Cashback normal untuk Gold dan Platinum
            switch (kodeJenis) {
                case "56": cashback = jumlah * 0.02; break;
                case "74": cashback = jumlah * 0.05; break;
            }
        }

        return cashback;
    }
}