import java.util.Scanner;

public class mainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah pembelian Jaket A: ");
        int jumlahA = input.nextInt();

        System.out.println("Masukkan jumlah pembelian Jaket B: ");
        int jumlahB = input.nextInt();

        System.out.println("Masukkan jumlah pembelian Jaket C: ");
        int jumlahC = input.nextInt();

        int totalA = jaketDira.hitungJaketA(jumlahA);
        int totalB = jaketDira.hitungJaketB(jumlahB);
        int totalC = jaketDira.hitungJaketC(jumlahC);
        int totalKeseluruhan = totalA + totalB + totalC;

        System.out.println("\n=== RINCIAN PEMBELIAN ===");
        System.out.println("Total Jaket A: Rp " + totalA);
        System.out.println("Total Jaket B: Rp " + totalB);
        System.out.println("Total Jaket C: Rp " + totalC);
        System.out.println("Total Seluruh Pembelian: Rp " + totalKeseluruhan);

        input.close();
    }
}
