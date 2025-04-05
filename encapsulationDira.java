import java.util.Scanner;
// main class yang menjalankan sistem swalayan
public class encapsulationDira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // daftar pelanggan
        Pelanggan[] pelangganList = {
            new Pelanggan("5612345678", "Tom", 2000000, "1234"),    // Gold
            new Pelanggan("3812345678", "Kevin", 1500000, "1162"),    // Silver
            new Pelanggan("7412345678", "Lily", 2500000, "2222")     // Platinum
        };
        
        while (true) {
            System.out.println("\n=== Tiny Mart ===");
            System.out.print("Masukkan nomor pelanggan: ");
            String no = input.nextLine();

            // mencari pelanggan berdasarkan nomor yang dimasukkan
            Pelanggan pelangganAktif = null;
            for (Pelanggan p : pelangganList) {
                if (p.getNomorPelanggan().equals(no)) {
                    pelangganAktif = p;
                    break;
                }
            }
            // jika pelanggan tidak ditemukan
            if (pelangganAktif == null) {
                System.out.println("Nomor pelanggan tidak ditemukan.");
                continue;
            }
            // cek apakah akun diblokir
            if (pelangganAktif.isDiblokir()) {
                System.out.println("Akun anda telah diblokir.");
                continue;
            }
            // autentikasi PIN
            System.out.print("Masukkan PIN: ");
            String pin = input.nextLine();

            if (!pelangganAktif.autentikasi(pin)) {
                System.out.println("Autentikasi gagal.");
                continue;
            }
            // tampilan setelah login berhasil
            System.out.println("Selamat datang, " + pelangganAktif.getNama());
            System.out.println("1. Pembelian");
            System.out.println("2. Top Up");
            System.out.print("Pilih menu (1/2): ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan jumlah pembelian: ");
                double jumlah = input.nextDouble();
                pelangganAktif.beli(jumlah);
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah top up: ");
                double jumlah = input.nextDouble();
                pelangganAktif.topUp(jumlah);
            } else {
                System.out.println("Menu tidak valid.");
            }

            input.nextLine(); 
        }
    }
}
