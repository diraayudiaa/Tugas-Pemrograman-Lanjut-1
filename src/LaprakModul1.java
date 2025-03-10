class Buku {
    public String judul;
    public int tahunTerbit;
    public String kategori;
    public String penulis;

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void printOut() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Kategori: " + kategori);
        System.out.println("Penulis: " + penulis);
        System.out.println("---------------------------");
    }
}

public class LaprakModul1 {
    public static void main(String[] args) {
        // untuk menyimpan daftar buku (5 buku per kategori)
        Buku[] daftarBuku = new Buku[35];

        // menambahkan buku ke daftar buku
        daftarBuku[0] = new Buku();
        daftarBuku[0].setJudul("Teknologi 1");
        daftarBuku[0].setTahunTerbit(2020);
        daftarBuku[0].setKategori("Teknologi");
        daftarBuku[0].setPenulis("Budi Santoso");

        daftarBuku[1] = new Buku();
        daftarBuku[1].setJudul("Teknologi 2");
        daftarBuku[1].setTahunTerbit(2021);
        daftarBuku[1].setKategori("Teknologi");
        daftarBuku[1].setPenulis("Andi Wijaya");

        daftarBuku[2] = new Buku();
        daftarBuku[2].setJudul("Teknologi 3");
        daftarBuku[2].setTahunTerbit(2019);
        daftarBuku[2].setKategori("Teknologi");
        daftarBuku[2].setPenulis("Siti Aminah");

        daftarBuku[3] = new Buku();
        daftarBuku[3].setJudul("STeknologi 4");
        daftarBuku[3].setTahunTerbit(2022);
        daftarBuku[3].setKategori("Teknologi");
        daftarBuku[3].setPenulis("Joko Purnomo");

        daftarBuku[4] = new Buku();
        daftarBuku[4].setJudul("Teknologi 5");
        daftarBuku[4].setTahunTerbit(2023);
        daftarBuku[4].setKategori("Teknologi");
        daftarBuku[4].setPenulis("Rina Setiawan");

        daftarBuku[5] = new Buku();
        daftarBuku[5].setJudul("Filsafat 1");
        daftarBuku[5].setTahunTerbit(2018);
        daftarBuku[5].setKategori("Filsafat");
        daftarBuku[5].setPenulis("Budi Santoso");

        daftarBuku[6] = new Buku();
        daftarBuku[6].setJudul("Filsafat 2");
        daftarBuku[6].setTahunTerbit(2017);
        daftarBuku[6].setKategori("Filsafat");
        daftarBuku[6].setPenulis("Siti Aminah");

        daftarBuku[7] = new Buku();
        daftarBuku[7].setJudul("Filsafat 3");
        daftarBuku[7].setTahunTerbit(2015);
        daftarBuku[7].setKategori("Filsafat");
        daftarBuku[7].setPenulis("Andi Wijaya");

        daftarBuku[8] = new Buku();
        daftarBuku[8].setJudul("Filsafat 4");
        daftarBuku[8].setTahunTerbit(2019);
        daftarBuku[8].setKategori("Filsafat");
        daftarBuku[8].setPenulis("Siti Aminah");

        daftarBuku[9] = new Buku();
        daftarBuku[9].setJudul("Filsafat 5");
        daftarBuku[9].setTahunTerbit(2020);
        daftarBuku[9].setKategori("Filsafat");
        daftarBuku[9].setPenulis("Joko Purnomo");

        daftarBuku[10] = new Buku();
        daftarBuku[10].setJudul("Sejarah 1");
        daftarBuku[10].setTahunTerbit(2018);
        daftarBuku[10].setKategori("Sejarah");
        daftarBuku[10].setPenulis("Rina Setiawan");

        daftarBuku[11] = new Buku();
        daftarBuku[11].setJudul("Sejarah 2");
        daftarBuku[11].setTahunTerbit(2018);
        daftarBuku[11].setKategori("Sejarah");
        daftarBuku[11].setPenulis("Budi Santoso");

        daftarBuku[12] = new Buku();
        daftarBuku[12].setJudul("Sejarah 3");
        daftarBuku[12].setTahunTerbit(2019);
        daftarBuku[12].setKategori("Sejarah");
        daftarBuku[12].setPenulis("Andi Wijaya");

        daftarBuku[13] = new Buku();
        daftarBuku[13].setJudul("Sejarah 4");
        daftarBuku[13].setTahunTerbit(2022);
        daftarBuku[13].setKategori("Sejarah");
        daftarBuku[13].setPenulis("Siti Aminah");

        daftarBuku[14] = new Buku();
        daftarBuku[14].setJudul("Sejarah 5");
        daftarBuku[14].setTahunTerbit(2018);
        daftarBuku[14].setKategori("Sejarah");
        daftarBuku[14].setPenulis("Joko Purnomo");

        daftarBuku[15] = new Buku();
        daftarBuku[15].setJudul("Agama 1");
        daftarBuku[15].setTahunTerbit(2019);
        daftarBuku[15].setKategori("Agama");
        daftarBuku[15].setPenulis("Rina Setiawan");

        daftarBuku[16] = new Buku();
        daftarBuku[16].setJudul("Agama 2");
        daftarBuku[16].setTahunTerbit(2021);
        daftarBuku[16].setKategori("Agama");
        daftarBuku[16].setPenulis("Budi Santoso");

        daftarBuku[17] = new Buku();
        daftarBuku[17].setJudul("Agama 3");
        daftarBuku[17].setTahunTerbit(2021);
        daftarBuku[17].setKategori("Agama");
        daftarBuku[17].setPenulis("Budi Santoso");

        daftarBuku[18] = new Buku();
        daftarBuku[18].setJudul("Agama 4");
        daftarBuku[18].setTahunTerbit(2021);
        daftarBuku[18].setKategori("Agama");
        daftarBuku[18].setPenulis("Budi Santoso");

        daftarBuku[19] = new Buku();
        daftarBuku[19].setJudul("Agama 5");
        daftarBuku[19].setTahunTerbit(2021);
        daftarBuku[19].setKategori("Agama");
        daftarBuku[19].setPenulis("Budi Santoso");

        daftarBuku[20] = new Buku();
        daftarBuku[20].setJudul("Psikologi 1");
        daftarBuku[20].setTahunTerbit(2021);
        daftarBuku[20].setKategori("Psikologi");
        daftarBuku[20].setPenulis("Budi Santoso");

        daftarBuku[21] = new Buku();
        daftarBuku[21].setJudul("Psikologi 2");
        daftarBuku[21].setTahunTerbit(2021);
        daftarBuku[21].setKategori("Psikologi");
        daftarBuku[21].setPenulis("Budi Santoso");

        daftarBuku[22] = new Buku();
        daftarBuku[22].setJudul("Psikologi 3 ");
        daftarBuku[22].setTahunTerbit(2021);
        daftarBuku[22].setKategori("Psikologi");
        daftarBuku[22].setPenulis("Budi Santoso");

        daftarBuku[23] = new Buku();
        daftarBuku[23].setJudul("Psikologi 4");
        daftarBuku[23].setTahunTerbit(2021);
        daftarBuku[23].setKategori("Psikologi");
        daftarBuku[23].setPenulis("Budi Santoso");

        daftarBuku[24] = new Buku();
        daftarBuku[24].setJudul("Psikologi 5");
        daftarBuku[24].setTahunTerbit(2021);
        daftarBuku[24].setKategori("Psikologi");
        daftarBuku[24].setPenulis("Budi Santoso");

        daftarBuku[25] = new Buku();
        daftarBuku[25].setJudul("Politik 1");
        daftarBuku[25].setTahunTerbit(2021);
        daftarBuku[25].setKategori("Politik");
        daftarBuku[25].setPenulis("Budi Santoso");

        daftarBuku[26] = new Buku();
        daftarBuku[26].setJudul("Politik 2");
        daftarBuku[26].setTahunTerbit(2021);
        daftarBuku[26].setKategori("Politik");
        daftarBuku[26].setPenulis("Budi Santoso");

        daftarBuku[27] = new Buku();
        daftarBuku[27].setJudul("Politik 3");
        daftarBuku[27].setTahunTerbit(2021);
        daftarBuku[27].setKategori("Politik");
        daftarBuku[27].setPenulis("Budi Santoso");

        daftarBuku[28] = new Buku();
        daftarBuku[28].setJudul("Politik 4");
        daftarBuku[28].setTahunTerbit(2021);
        daftarBuku[28].setKategori("Politik");
        daftarBuku[28].setPenulis("Budi Santoso");

        daftarBuku[29] = new Buku();
        daftarBuku[29].setJudul("Politik 5");
        daftarBuku[29].setTahunTerbit(2021);
        daftarBuku[29].setKategori("Politik");
        daftarBuku[29].setPenulis("Budi Santoso");

        daftarBuku[30] = new Buku();
        daftarBuku[30].setJudul("Fiksi 1");
        daftarBuku[30].setTahunTerbit(2021);
        daftarBuku[30].setKategori("Fiksi");
        daftarBuku[30].setPenulis("Budi Santoso");

        daftarBuku[31] = new Buku();
        daftarBuku[31].setJudul("Fiksi 2");
        daftarBuku[31].setTahunTerbit(2021);
        daftarBuku[31].setKategori("Fiksi");
        daftarBuku[31].setPenulis("Budi Santoso");

        daftarBuku[32] = new Buku();
        daftarBuku[32].setJudul("Fiksi 3");
        daftarBuku[32].setTahunTerbit(2021);
        daftarBuku[32].setKategori("Fiksi");
        daftarBuku[32].setPenulis("Budi Santoso");

        daftarBuku[33] = new Buku();
        daftarBuku[33].setJudul("Fiksi 4");
        daftarBuku[33].setTahunTerbit(2021);
        daftarBuku[33].setKategori("Fiksi");
        daftarBuku[33].setPenulis("Budi Santoso");

        daftarBuku[34] = new Buku();
        daftarBuku[34].setJudul("Fiksi 5");
        daftarBuku[34].setTahunTerbit(2021);
        daftarBuku[34].setKategori("Fiksi");
        daftarBuku[34].setPenulis("Budi Santoso");

        // output menampilkan semua buku
        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i] != null) {
                daftarBuku[i].printOut();
    }
        }
    }
}
