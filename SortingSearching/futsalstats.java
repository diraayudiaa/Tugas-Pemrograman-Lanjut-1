import java.util.*;

public class futsalstats {
    public static void main(String[] args) {
        ArrayList<pemain> timA = new ArrayList<>(Arrays.asList(
            new pemain(168, 50), new pemain(170, 60), new pemain(165, 56), new pemain(168, 55),
            new pemain(172, 60), new pemain(170, 70), new pemain(169, 66), new pemain(165, 56),
            new pemain(171, 72), new pemain(166, 56)
        ));

        ArrayList<pemain> timB = new ArrayList<>(Arrays.asList(
            new pemain(170, 66), new pemain(167, 60), new pemain(165, 59), new pemain(166, 58),
            new pemain(168, 58), new pemain(175, 71), new pemain(172, 68), new pemain(171, 68),
            new pemain(168, 65), new pemain(169, 60)
        ));

        // a. Sorting
        timA.sort(Comparator.comparingInt(p -> p.tinggi));
        timB.sort(Comparator.comparingInt(p -> p.tinggi));
        System.out.println("Tinggi Asc Tim A: " + timA);
        System.out.println("Tinggi Asc Tim B: " + timB);

        timA.sort((p1, p2) -> Integer.compare(p2.tinggi, p1.tinggi));
        timB.sort((p1, p2) -> Integer.compare(p2.tinggi, p1.tinggi));
        System.out.println("Tinggi Desc Tim A: " + timA);
        System.out.println("Tinggi Desc Tim B: " + timB);

        timA.sort(Comparator.comparingInt(p -> p.berat));
        timB.sort(Comparator.comparingInt(p -> p.berat));
        System.out.println("Berat Asc Tim A: " + timA);
        System.out.println("Berat Asc Tim B: " + timB);

        timA.sort((p1, p2) -> Integer.compare(p2.berat, p1.berat));
        timB.sort((p1, p2) -> Integer.compare(p2.berat, p1.berat));
        System.out.println("Berat Desc Tim A: " + timA);
        System.out.println("Berat Desc Tim B: " + timB);

        // c. Max & Min
        System.out.println("Tim A Max Tinggi: " + getMax(timA, "tinggi"));
        System.out.println("Tim A Min Tinggi: " + getMin(timA, "tinggi"));
        System.out.println("Tim A Max Berat: " + getMax(timA, "berat"));
        System.out.println("Tim A Min Berat: " + getMin(timA, "berat"));

        System.out.println("Tim B Max Tinggi: " + getMax(timB, "tinggi"));
        System.out.println("Tim B Min Tinggi: " + getMin(timB, "tinggi"));
        System.out.println("Tim B Max Berat: " + getMax(timB, "berat"));
        System.out.println("Tim B Min Berat: " + getMin(timB, "berat"));

        // d. Copy ke Tim C
        ArrayList<pemain> timC = new ArrayList<>(timB);
        System.out.println("Tim C (Copy dari Tim B): " + timC);

        // Binary Search Conditions
        System.out.println("Jumlah tinggi 168 di Tim B: " + countByTinggi(timB, 168));
        System.out.println("Jumlah tinggi 160 di Tim B: " + countByTinggi(timB, 160));
        System.out.println("Jumlah berat 56 di Tim A: " + countByBerat(timA, 56));
        System.out.println("Jumlah berat 53 di Tim A: " + countByBerat(timA, 53));

        // Cek kesamaan tinggi atau berat
        boolean adaSama = false;
        for (pemain a : timA) {
            for (pemain b : timB) {
                if (a.tinggi == b.tinggi || a.berat == b.berat) {
                    adaSama = true;
                    break;
                }
            }
            if (adaSama) break;
        }
        System.out.println("Ada tinggi/berat sama antara Tim A dan B? " + (adaSama ? "Ya" : "Tidak"));
    }

    static int getMax(List<pemain> list, String field) {
        return list.stream().mapToInt(p -> field.equals("tinggi") ? p.tinggi : p.berat).max().getAsInt();
    }

    static int getMin(List<pemain> list, String field) {
        return list.stream().mapToInt(p -> field.equals("tinggi") ? p.tinggi : p.berat).min().getAsInt();
    }

    static int countByTinggi(List<pemain> list, int target) {
        return (int) list.stream().filter(p -> p.tinggi == target).count();
    }

    static int countByBerat(List<pemain> list, int target) {
        return (int) list.stream().filter(p -> p.berat == target).count();
    }
}
