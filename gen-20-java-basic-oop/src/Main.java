public class Main {
    public static void main(String[] args) {

        // Membuat objek dari masing masing child produk
        Elektronik komputer = new Elektronik("Laptop", 100000);
        Pakaian jaket = new Pakaian("Hoodie",100000);
        Kendaraan motor = new Kendaraan("Motor Listrik", 100000);

        // Menampilkan informasi produk
        komputer.cetakInformasi();
        jaket.cetakInformasi();
        motor.cetakInformasi();
    }
}