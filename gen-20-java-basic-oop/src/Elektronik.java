public class Elektronik extends Produk {
    public Elektronik(String nama , int harga){
        super(nama,harga,new KategoriProduk("Peralatan Elektronik"));
    }

    @Override
    public int getHarga() {
        // Contoh override harga untuk produk Elektronik
        return super.getHarga() + 200000;
    }

    @Override
    public double getDiskonPersen() {
        // Contoh diskon untuk produk Elektronik (misalnya, 5%)
        return 0.10;
    }
}
