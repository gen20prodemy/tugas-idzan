public class Produk {
    private String nama;
    private int harga;
    private KategoriProduk kategori;

    public Produk(String nama, int harga, KategoriProduk kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }

    public  void setNama(String nama){
        this.nama = nama;
    }

    public  void setHarga(int harga){
        this.harga=harga;
    }

    // Metode untuk mendapatkan diskon
    public double getDiskonPersen() {
        return 0.0;
    }

    // Metode untuk mendapatkan jumlah diskon
    public double getDiskon() {
        return getHarga() * getDiskonPersen();
    }

    public int getHargaSetelahDiskon() {
        return (int) Math.round(getHarga() - getDiskon());
    }

    // Metode untuk mencetak informasi produk dan diskon
    public void cetakInformasi() {
        System.out.println("##################################");
        System.out.println("Kategori: " + getKategori().getNamaKategori());
        System.out.println("Produk: " + getNama());
        System.out.println("Harga: Rp. " + getHarga());
        System.out.println("Diskon: " + getDiskonPersen() * 100 + "%");
        System.out.println("Harga Setelah Diskon: Rp. " + getHargaSetelahDiskon());
        System.out.println("##################################");
        System.out.println();
    }



    public KategoriProduk getKategori() {
        return kategori;
    }
}
