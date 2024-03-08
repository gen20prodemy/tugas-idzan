import ChildClass.CrudMap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrudMap crudMap = new CrudMap();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("1. Tambah Element");
                System.out.println("2. Hapus Element");
                System.out.println("3. Tampilkan Element");
                System.out.println("4. Tampilkan Semmua Element");
                System.out.println("5. Update Element");
                System.out.println("6. Exit");

                System.out.print("Masukan Pilihan: ");
                int choice = scanner.nextInt();
                System.out.println();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Masukan Id: ");
                        int addId = scanner.nextInt();
                        System.out.print("Masukan nama: ");
                        String addName = scanner.next();
                        crudMap.addElement(addId, addName);
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.print("Masukan id untuk di hapus : ");
                        int deleteId = scanner.nextInt();
                        crudMap.deleteElement(deleteId);
                        System.out.println();
                    }
                    case 3 -> {crudMap.displayElement();
                        System.out.println();}
                    case 4 -> {crudMap.displayAllElements();
                        System.out.println();}
                    case 5 -> {
                        System.out.print("Masukan Id untuk di update: ");
                        int updateId = scanner.nextInt();
                        System.out.print("Masukan nama baru: ");
                        String updateName = scanner.next();
                        crudMap.updateElement(updateId, updateName);
                        System.out.println();
                    }
                    case 6 -> {
                        System.out.println("Program Selesai");
                        System.exit(0);}
                    default -> System.out.println("Angka tidak ada di menu pilihan");
                }

            }catch (InputMismatchException e){
                System.out.println("Error : Harap memasukan angka");
                scanner.nextLine();
            }
        }
    }
}