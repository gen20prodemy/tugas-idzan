public class Pakaian extends Produk {
    public Pakaian(String nama, int harga) {
        super(nama, harga, new KategoriProduk("Pakaian"));
    }


    @Override
    public int getHarga() {
        // Contoh override harga untuk produk Pakaian
        return super.getHarga() + 50000;
    }

    @Override
    public double getDiskonPersen() {
        // Contoh diskon untuk produk Pakaian (misalnya, 5%)
        return 0.05;
    }
}
