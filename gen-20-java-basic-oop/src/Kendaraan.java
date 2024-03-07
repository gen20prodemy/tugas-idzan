public class Kendaraan extends Produk{
    public Kendaraan(String nama, int harga) {
        super(nama, harga, new KategoriProduk("Kendaraan"));
    }


    @Override
    public int getHarga() {
        // Contoh override harga untuk produk Kendaraan
        return super.getHarga() + 500000;
    }

    @Override
    public double getDiskonPersen() {
        // Contoh diskon untuk produk Kendaraan (misalnya, 30%)
        return 0.30;
    }
}
