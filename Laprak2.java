public class Laprak2 { 
    public static void main(String[] args) {  
        // untuk menyimpan daftar buku (5 buku per kategori) 
        Buku[] daftarBuku = new Buku[35]; 
        
        // menambahkan buku ke daftar buku 
        daftarBuku[0] = new Buku(); 
        daftarBuku[0].setJudul("Teknologi 1");  
        daftarBuku[0].setTahunTerbit(2020); 
        daftarBuku[0].setKategori("Teknologi");  
        daftarBuku[0].setPenulis("Hartono"); 
        daftarBuku[0].setSinopsis("Buku ini membahas perkembangan teknologi terbaru di era revolusi industri 4.0.");
        
        daftarBuku[1] = new Buku(); 
        daftarBuku[1].setJudul("Teknologi 2");  
        daftarBuku[1].setTahunTerbit(2021); 
        daftarBuku[1].setKategori("Teknologi");  
        daftarBuku[1].setPenulis("Wawan"); 
        daftarBuku[1].setSinopsis("Mengulas tentang berbagai inovasi teknologi yang mengubah cara kita hidup sehari-hari.");
        
        daftarBuku[2] = new Buku(); 
        daftarBuku[2].setJudul("Teknologi 3");  
        daftarBuku[2].setTahunTerbit(2019); 
        daftarBuku[2].setKategori("Teknologi");  
        daftarBuku[2].setPenulis("Raharjo"); 
        daftarBuku[2].setSinopsis("Panduan praktis mengenai implementasi teknologi digital dalam bisnis dan kehidupan modern.");
        
        daftarBuku[3] = new Buku(); 
        daftarBuku[3].setJudul("Teknologi 4");
        daftarBuku[3].setTahunTerbit(2022); 
        daftarBuku[3].setKategori("Teknologi");  
        daftarBuku[3].setPenulis("Joko Purnomo"); 
        daftarBuku[3].setSinopsis("Membahas dampak teknologi terhadap perubahan sosial dan budaya di masyarakat kontemporer.");
        
        daftarBuku[4] = new Buku(); 
        daftarBuku[4].setJudul("Teknologi 5");  
        daftarBuku[4].setTahunTerbit(2023); 
        daftarBuku[4].setKategori("Teknologi");  
        daftarBuku[4].setPenulis("Anton"); 
        daftarBuku[4].setSinopsis("Analisis mendalam tentang teknologi kecerdasan buatan dan masa depan otomatisasi.");
        
        daftarBuku[5] = new Buku(); 
        daftarBuku[5].setJudul("Filsafat 1");  
        daftarBuku[5].setTahunTerbit(2018); 
        daftarBuku[5].setKategori("Filsafat");  
        daftarBuku[5].setPenulis("Amel"); 
        daftarBuku[5].setSinopsis("Pengantar filsafat barat mulai dari Socrates hingga pemikir kontemporer era modern.");
        
        daftarBuku[6] = new Buku(); 
        daftarBuku[6].setJudul("Filsafat 2");  
        daftarBuku[6].setTahunTerbit(2017); 
        daftarBuku[6].setKategori("Filsafat");  
        daftarBuku[6].setPenulis("Zahra"); 
        daftarBuku[6].setSinopsis("Pembahasan mengenai filsafat timur dan relevansinya dengan kehidupan manusia saat ini.");
        
        daftarBuku[7] = new Buku(); 
        daftarBuku[7].setJudul("Filsafat 3");  
        daftarBuku[7].setTahunTerbit(2015); 
        daftarBuku[7].setKategori("Filsafat");  
        daftarBuku[7].setPenulis("Devi"); 
        daftarBuku[7].setSinopsis("Eksplorasi konsep eksistensialisme dan dampaknya banyak sekali pada pemikiran manusia modern.");
        
        daftarBuku[8] = new Buku(); 
        daftarBuku[8].setJudul("Filsafat 4");  
        daftarBuku[8].setTahunTerbit(2019); 
        daftarBuku[8].setKategori("Filsafat");  
        daftarBuku[8].setPenulis("Nofita"); 
        daftarBuku[8].setSinopsis("Pembahasan mendalam tentang etika dan moral dalam konteks filsafat praktis.");
        
        daftarBuku[9] = new Buku(); 
        daftarBuku[9].setJudul("Filsafat 5");  
        daftarBuku[9].setTahunTerbit(2020); 
        daftarBuku[9].setKategori("Filsafat");  
        daftarBuku[9].setPenulis("Izza"); 
        daftarBuku[9].setSinopsis("Analisis kritis terhadap berbagai paradigma filsafat dalam memahami realitas dan kebenaran.");
        
        daftarBuku[10] = new Buku(); 
        daftarBuku[10].setJudul("Sejarah 1");  
        daftarBuku[10].setTahunTerbit(2018);  
        daftarBuku[10].setKategori("Sejarah");
        daftarBuku[10].setPenulis("Alya"); 
        daftarBuku[10].setSinopsis("Menyajikan rangkaian peristiwa penting dalam sejarah peradaban manusia sejak zaman kuno.");
        
        daftarBuku[11] = new Buku(); 
        daftarBuku[11].setJudul("Sejarah 2");  
        daftarBuku[11].setTahunTerbit(2018);  
        daftarBuku[11].setKategori("Sejarah");  
        daftarBuku[11].setPenulis("Nazli"); 
        daftarBuku[11].setSinopsis("Mengulas sejarah perkembangan kerajaan-kerajaan besar di berbagai belahan dunia ini.");
        
        daftarBuku[12] = new Buku(); 
        daftarBuku[12].setJudul("Sejarah 3");  
        daftarBuku[12].setTahunTerbit(2019);  
        daftarBuku[12].setKategori("Sejarah");  
        daftarBuku[12].setPenulis("Anya"); 
        daftarBuku[12].setSinopsis("Menceritakan bagaimana sejarah perang dunia dan dampaknya terhadap tatanan global modern.");
        
        daftarBuku[13] = new Buku(); 
        daftarBuku[13].setJudul("Sejarah 4");  
        daftarBuku[13].setTahunTerbit(2022);  
        daftarBuku[13].setKategori("Sejarah");  
        daftarBuku[13].setPenulis("Mega"); 
        daftarBuku[13].setSinopsis("Menggali  dan mengetahui sejarah perkembangan sains dan teknologi dari masa ke masa.");
        
        daftarBuku[14] = new Buku(); 
        daftarBuku[14].setJudul("Sejarah 5");  
        daftarBuku[14].setTahunTerbit(2018);  
        daftarBuku[14].setKategori("Sejarah");  
        daftarBuku[14].setPenulis("Gopi"); 
        daftarBuku[14].setSinopsis("Memaparkan sejarah perjuangan kemerdekaan berbagai bangsa di dunia dengan detail dan jelas.");
        
        daftarBuku[15] = new Buku(); 
        daftarBuku[15].setJudul("Agama 1"); 
        daftarBuku[15].setTahunTerbit(2019);  
        daftarBuku[15].setKategori("Agama");  
        daftarBuku[15].setPenulis("Anet"); 
        daftarBuku[15].setSinopsis("Pengantar umum tentang berbagai agama besar yang ada di dunia dan ajarannya.");
        
        daftarBuku[16] = new Buku(); 
        daftarBuku[16].setJudul("Agama 2"); 
        daftarBuku[16].setTahunTerbit(2021);  
        daftarBuku[16].setKategori("Agama");  
        daftarBuku[16].setPenulis("Niken"); 
        daftarBuku[16].setSinopsis("Mengulas ulang tentang nilai-nilai spiritual dalam kehidupan modern yang kompleks.");
        
        daftarBuku[17] = new Buku(); 
        daftarBuku[17].setJudul("Agama 3"); 
        daftarBuku[17].setTahunTerbit(2021);  
        daftarBuku[17].setKategori("Agama");  
        daftarBuku[17].setPenulis("Vilo");
        daftarBuku[17].setSinopsis("Membahas praktik keagamaan dan pengaruhnya terhadap kehidupan sosial dan masyarakat.");
        
        daftarBuku[18] = new Buku(); 
        daftarBuku[18].setJudul("Agama 4"); 
        daftarBuku[18].setTahunTerbit(2021);  
        daftarBuku[18].setKategori("Agama");  
        daftarBuku[18].setPenulis("Nada Husayna"); 
        daftarBuku[18].setSinopsis("Mengupas teks-teks suci dari berbagai agama dan bagaimana interpretasinya di era modern.");
        
        daftarBuku[19] = new Buku(); 
        daftarBuku[19].setJudul("Agama 5"); 
        daftarBuku[19].setTahunTerbit(2021);  
        daftarBuku[19].setKategori("Agama");  
        daftarBuku[19].setPenulis("Rayhana"); 
        daftarBuku[19].setSinopsis("Analisis tentang bagaimana peran agama dalam konflik permasalahan dan perdamaian dunia.");
        
        daftarBuku[20] = new Buku(); 
        daftarBuku[20].setJudul("Psikologi 1");
        daftarBuku[20].setTahunTerbit(2021);
        daftarBuku[20].setKategori("Psikologi");
        daftarBuku[20].setPenulis("Kevin Ryan");
        daftarBuku[20].setSinopsis("Pagi yang cerah, aku berjalan santai menuju taman kota bersama kekasihku.");

        daftarBuku[21] = new Buku();
        daftarBuku[21].setJudul("Psikologi 2");
        daftarBuku[21].setTahunTerbit(2021);
        daftarBuku[21].setKategori("Psikologi");
        daftarBuku[21].setPenulis("Dira Ayudia");
        daftarBuku[21].setSinopsis("Buku itu menarik perhatian, membuatku terpesona sepanjang malam dan suka untuk membacanya.");

        daftarBuku[22] = new Buku(); 
        daftarBuku[22].setJudul("Psikologi 3");
        daftarBuku[22].setTahunTerbit(2021);
        daftarBuku[22].setKategori("Psikologi");
        daftarBuku[22].setPenulis("Anita");
        daftarBuku[22].setSinopsis("Angin sepoi-sepoi menyentuh wajahku saat duduk di pantai membuatku mengantuk");

        daftarBuku[23] = new Buku(); 
        daftarBuku[23].setJudul("Psikologi 4");
        daftarBuku[23].setTahunTerbit(2021);
        daftarBuku[23].setKategori("Psikologi");
        daftarBuku[23].setPenulis("Heri");
        daftarBuku[23].setSinopsis("Teman-teman berkumpul bersama, berbagi cerita tentang petualangan kemarin yang sangat seru.");

        daftarBuku[24] = new Buku();  
        daftarBuku[24].setJudul("Psikologi 5");
        daftarBuku[24].setTahunTerbit(2021);
        daftarBuku[24].setKategori("Psikologi");
        daftarBuku[24].setPenulis("Heru");
        daftarBuku[24].setSinopsis("Aku selalu menikmati kopi hitam di pagi hari yang tenang sendirian.");

        daftarBuku[25] = new Buku(); 
        daftarBuku[25].setJudul("Politik 1");
        daftarBuku[25].setTahunTerbit(2021);
        daftarBuku[25].setKategori("Politik");
        daftarBuku[25].setPenulis("Yudi");
        daftarBuku[25].setSinopsis("Di atas bukit, kita bisa melihat dan menikmati pemandangan kota yang indah.");

        daftarBuku[26] = new Buku(); 
        daftarBuku[26].setJudul("Politik 2");
        daftarBuku[26].setTahunTerbit(2021);
        daftarBuku[26].setKategori("Politik");
        daftarBuku[26].setPenulis("Syarif");
        daftarBuku[26].setSinopsis("Saat hujan turun, suasana di dalam rumah terasa nyaman karena dingin.");

        daftarBuku[27] = new Buku(); 
        daftarBuku[27].setJudul("Politik 3");
        daftarBuku[27].setTahunTerbit(2021);
        daftarBuku[27].setKategori("Politik");
        daftarBuku[27].setPenulis("Bintang");
        daftarBuku[27].setSinopsis("Dia menyukai musik klasik, terutama lagu-lagu Beethoven yang terkenal, aku juga menyukainya.");

        daftarBuku[28] = new Buku(); 
        daftarBuku[28].setJudul("Politik 4");
        daftarBuku[28].setTahunTerbit(2021);
        daftarBuku[28].setKategori("Politik");
        daftarBuku[28].setPenulis("Rizky");
        daftarBuku[28].setSinopsis("Makanan enak membuat kita lebih bahagia, terutama jika berbagi kepada sesama.");

        daftarBuku[29] = new Buku(); 
        daftarBuku[29].setJudul("Politik 4");
        daftarBuku[29].setTahunTerbit(2021);
        daftarBuku[29].setKategori("Politik");
        daftarBuku[29].setPenulis("Rania");
        daftarBuku[29].setSinopsis("Setiap akhir pekan, kami berkeliling kota mencari tempat baru untuk berlibur.");

        daftarBuku[30] = new Buku(); 
        daftarBuku[30].setJudul("Politik 5");
        daftarBuku[30].setTahunTerbit(2021);
        daftarBuku[30].setKategori("Politik");
        daftarBuku[30].setPenulis("Kalyca");
        daftarBuku[30].setSinopsis("Anak-anak bermain bola di lapangan sambil tertawa ceria bersama sebelum petang.");

        daftarBuku[31] = new Buku(); 
        daftarBuku[31].setJudul("Fiksi 1");
        daftarBuku[31].setTahunTerbit(2021);
        daftarBuku[31].setKategori("Fiksi");
        daftarBuku[31].setPenulis("Sinin");
        daftarBuku[31].setSinopsis("Setiap malam, aku menikmati menonton film di layar besar karena sangat seru.");

        daftarBuku[32] = new Buku(); 
        daftarBuku[32].setJudul("Fiksi 2");
        daftarBuku[32].setTahunTerbit(2021);
        daftarBuku[32].setKategori("Fiksi");
        daftarBuku[32].setPenulis("Rafly");
        daftarBuku[32].setSinopsis("Pagi yang cerah, aku berjalan santai menuju taman kota dan membawa anjingku.");

        daftarBuku[33] = new Buku(); 
        daftarBuku[33].setJudul("Fiksi 3");
        daftarBuku[33].setTahunTerbit(2021);
        daftarBuku[33].setKategori("Fiksi");
        daftarBuku[33].setPenulis("Vania");
        daftarBuku[33].setSinopsis("Suasana di kafe itu tenang, dengan musik lembut mengalun membuatku mengantuk");

        daftarBuku[34] = new Buku(); 
        daftarBuku[34].setJudul("Fiksi 4");
        daftarBuku[34].setTahunTerbit(2021);
        daftarBuku[34].setKategori("Fiksi");
        daftarBuku[34].setPenulis("Laila");
        daftarBuku[34].setSinopsis("Mereka berjalan di sepanjang pantai, menikmati sunset yang indah, mereka sangat romantis.");

        daftarBuku[0].printOut();
        daftarBuku[1].printOut();
        daftarBuku[2].printOut();
        daftarBuku[3].printOut();
        daftarBuku[4].printOut();
        daftarBuku[5].printOut();
        daftarBuku[6].printOut();
        daftarBuku[7].printOut();
        daftarBuku[8].printOut();
        daftarBuku[9].printOut();
        daftarBuku[10].printOut();
        daftarBuku[11].printOut();
        daftarBuku[12].printOut();
        daftarBuku[13].printOut();
        daftarBuku[14].printOut();
        daftarBuku[15].printOut();
        daftarBuku[16].printOut();
        daftarBuku[17].printOut();
        daftarBuku[18].printOut();
        daftarBuku[19].printOut();
        daftarBuku[20].printOut();
        daftarBuku[21].printOut();
        daftarBuku[22].printOut();
        daftarBuku[23].printOut();
        daftarBuku[24].printOut();
        daftarBuku[25].printOut();
        daftarBuku[26].printOut();
        daftarBuku[27].printOut();
        daftarBuku[28].printOut();
        daftarBuku[29].printOut();
        daftarBuku[30].printOut();
        daftarBuku[31].printOut();
        daftarBuku[32].printOut();
        daftarBuku[33].printOut();
        daftarBuku[34].printOut();

        System.out.println(" Method Copy:");
        Buku bukuCopy = daftarBuku[0].copy();
        System.out.println("Buku Original:");
        daftarBuku[0].printOut();
        System.out.println("Buku Copy:");
        bukuCopy.printOut();

        
        // cekTingkatKesamaan method
        System.out.println(" Method Cek Tingkat Kesamaan:");
        System.out.println("Kesamaan antara Buku 0 dan Buku 1: " + 
                           daftarBuku[0].cekTingkatKesamaan(daftarBuku[1]) + "%");
        System.out.println("Kesamaan antara Buku 0 dan Copy-nya: " + 
                           daftarBuku[0].cekTingkatKesamaan(bukuCopy) + "%");
        
        // menampilkan beberapa buku 
        System.out.println("\nContoh Beberapa Buku Lainnya:");
        for (int i = 0; i < 5; i++) {  
            if (daftarBuku[i] != null) { 
                daftarBuku[i].printOut(); 
            } 

        }
        
      daftarBuku[0].hitungRoyalti(10000.0);
      daftarBuku[1].hitungRoyalti(10000.0,15.0);
        }     
    }

