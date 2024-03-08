import ChildClass.CrudFile;
import Pojo.DataFile;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SoalKedua {
    public static void main(String[] args) {
        CrudFile fileCRUD = new CrudFile();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Tambah Data");
                System.out.println("2. Hapus Data");
                System.out.println("3. Tampilkan Data");
                System.out.println("4. Tampilkan Semua Data");
                System.out.println("5. Update Data");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Masukkan ID: ");
                        int addId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan Nama Produk: ");
                        String addName = scanner.nextLine();
                        System.out.print("Masukkan Harga: ");
                        int addPrice = scanner.nextInt();

                        DataFile data = new DataFile(addId, addName, addPrice);
                        fileCRUD.tambahRow(data);
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.print("Masukkan ID untuk dihapus: ");
                        int deleteId = scanner.nextInt();
                        fileCRUD.deleteRow(deleteId);
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("Tampilkan Data:");
                        fileCRUD.displayRow();
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("Tampilkan Semua Data:");
                        fileCRUD.displayAllRows();
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.print("Masukkan ID untuk di update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // consume the newline character
                        System.out.print("Masukkan Nama Produk baru: ");
                        String updateName = scanner.nextLine();
                        System.out.print("Masukkan Harga baru: ");
                        int updatePrice = scanner.nextInt();

                        DataFile newData = new DataFile(updateId, updateName, updatePrice);
                        fileCRUD.updateRow(newData);
                        System.out.println();
                    }
                    case 6 -> {
                        System.out.println("Exiting program.");
                        System.exit(0);
                    }
                    default -> System.out.println("Angka tidak ada di menu pilihan");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Harap memasukkan angka atau input tidak valid");
                scanner.nextLine();
            }
        }
    }
}
