import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Membuat objek dari masing-masing child produk
        Elektronik komputer = new Elektronik("Laptop", 100000);
        Pakaian jaket = new Pakaian("Hoodie", 100000);
        Kendaraan motor = new Kendaraan("Motor Listrik", 100000);


        // Menampilkan informasi produk
        komputer.cetakInformasi();
        jaket.cetakInformasi();
        motor.cetakInformasi();


        // Membuat objek Scanner untuk input pengguna
        Scanner input = new Scanner(System.in);
        boolean inputValid = false;


        while (!inputValid) {
            try {
                System.out.println("\nMenu:");
                System.out.println("1. Ubah Nama Produk");
                System.out.println("2. Ubah Harga Produk");
                System.out.print("Pilih menu : ");
                int menuChoice = input.nextInt();

                switch (menuChoice) {
                    case 1 -> {
                        int productChoice;
                        do {
                            System.out.println("\nPilih produk yang ingin diubah nama:");
                            System.out.println("1. " + komputer.getNama());
                            System.out.println("2. " + jaket.getNama());
                            System.out.println("3. " + motor.getNama());
                            System.out.print("Pilih produk : ");
                            productChoice = input.nextInt();

                            if (productChoice >= 1 && productChoice <= 3) {
                                System.out.print("Masukkan nama baru: ");
                                input.nextLine();
                                String newName = input.nextLine();

                                if (!newName.trim().isEmpty()) {
                                    switch (productChoice) {
                                        case 1 -> komputer.setNama(newName);
                                        case 2 -> jaket.setNama(newName);
                                        case 3 -> motor.setNama(newName);
                                    }
                                    inputValid = true;
                                } else {
                                    System.out.println("Nama produk tidak boleh kosong.");
                                }
                            } else {
                                System.out.println("Pilihan produk tidak valid.");
                            }
                        } while (!inputValid);
                    }
                    case 2 -> {
                        int priceProductChoice;
                        do {
                            System.out.println("\nPilih produk yang ingin diubah harga:");
                            System.out.println("1. " + komputer.getNama());
                            System.out.println("2. " + jaket.getNama());
                            System.out.println("3. " + motor.getNama());
                            System.out.print("Pilih produk : ");
                            priceProductChoice = input.nextInt();

                            if (priceProductChoice >= 1 && priceProductChoice <= 3) {
                                System.out.print("Masukkan harga baru: ");
                                int newPrice = input.nextInt();

                                switch (priceProductChoice) {
                                    case 1 -> komputer.setHarga(newPrice);
                                    case 2 -> jaket.setHarga(newPrice);
                                    case 3 -> motor.setHarga(newPrice);
                                }
                                inputValid = true;
                            } else {
                                System.out.println("Pilihan produk tidak valid.");

                            }
                        } while (!inputValid);
                    }
                    default -> System.out.println("Menu tidak valid.");
                }

                if (inputValid) {
                    System.out.println("\nInformasi Produk Setelah Perubahan:");
                    komputer.cetakInformasi();
                    jaket.cetakInformasi();
                    motor.cetakInformasi();
                }

            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                input.nextLine();
            }
        }

        input.close();
    }


    }

