class Buku { 
    public String judul; 
    public int tahunTerbit; 
    public String kategori; 
    public String penulis;
    public String sinopsis; // New attribute
    
    // Constructor for all attributes
    public Buku(String judul, int tahunTerbit, String kategori, String penulis, String sinopsis) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }
    
    // Default constructor
    public Buku() {
        this.judul = "";
        this.tahunTerbit = 0;
        this.kategori = "";
        this.penulis = "";
        this.sinopsis = "";
    }
    
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
    
    // New setter for sinopsis
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    // Method to count words in sinopsis
    public int hitungJumlahKataSinopsis() {
        if (sinopsis == null || sinopsis.trim().isEmpty()) {
            return 0;
        }
        
        String[] kata = sinopsis.trim().split("\\s+");
        return kata.length;
    }
    
    // Method to check similarity with another Buku object
    public double cekTingkatKesamaan(Buku other) {
        if (other == null) {
            return 0.0;
        }
        
        int totalAttributes = 5; // judul, tahunTerbit, kategori, penulis, sinopsis
        double matchScore = 0.0;
        
        // Compare each attribute
        if (this.judul != null && this.judul.equals(other.judul)) {
            matchScore += 1.0;
        }
        
        if (this.tahunTerbit == other.tahunTerbit) {
            matchScore += 1.0;
        }
        
        if (this.kategori != null && this.kategori.equals(other.kategori)) {
            matchScore += 1.0;
        }
        
        if (this.penulis != null && this.penulis.equals(other.penulis)) {
            matchScore += 1.0;
        }
        
        if (this.sinopsis != null && this.sinopsis.equals(other.sinopsis)) {
            matchScore += 1.0;
        }
        
        // Calculate percentage
        return (matchScore / totalAttributes) * 100.0;
    }
    
    // Method to create a copy of this object
    public Buku copy() {
        Buku copy = new Buku();
        copy.setJudul(this.judul);
        copy.setTahunTerbit(this.tahunTerbit);
        copy.setKategori(this.kategori);
        copy.setPenulis(this.penulis);
        copy.setSinopsis(this.sinopsis);
        return copy;
    }

    public void hitungRoyalti(double hargaBuku) {
        double royalti = hargaBuku * 0.1;
        System.out.println("Royalti :" + royalti);
    }

    public void hitungRoyalti(double hargaBuku, double persenRoyalti) {
        double royalti = hargaBuku * (persenRoyalti / 100);
        System.out.println("Royalti:" + royalti);
    }

    
    public void printOut() { 
        System.out.println("Judul Buku: " + judul);  
        System.out.println("Tahun Terbit: " + tahunTerbit); 
        System.out.println("Kategori: " + kategori);  
        System.out.println("Penulis: " + penulis);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Jumlah Kata Sinopsis: " + hitungJumlahKataSinopsis());
        System.out.println("---------------------------");  
    } 
}