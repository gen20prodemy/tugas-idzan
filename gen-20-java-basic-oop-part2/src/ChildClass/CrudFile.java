package ChildClass;

import Operations.CrudOperationsFile;
import Pojo.DataFile;

import java.io.*;
import java.util.Scanner;

public class CrudFile extends CrudOperationsFile {

    private  static  String FILE_PATH ="data.text";


    @Override
    public void tambahRow(DataFile data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH, true))){
                writer.println(data);}
            catch(IOException e){
                System.out.println("Error: " +e.getMessage());
            }
        }


    @Override
    public void updateRow(DataFile newData) {
        try {
            // Membuat objek File untuk file asli
            File inputFile = new File(FILE_PATH);
            // Membuat objek File untuk file sementara
            File tempFile = new File("temp.txt");

            boolean idFound = false;

            // Membuka file asli untuk dibaca dan file sementara untuk ditulis
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {

                String line;
                // Iterasi melalui setiap baris dalam file asli
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(" ");
                    int id = Integer.parseInt(parts[0]);

                    if (id == newData.getId()) {
                        writer.println(newData);
                        idFound = true;
                        System.out.println("Data berhasil di update");
                    } else {
                        writer.println(line);
                    }
                }
            }

            // Mengganti file asli dengan file sementara
            if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
                System.err.println("Error updating the file.");
            }

            if (!idFound) {
                System.out.println("ID data tidak ditemukan");
            }
        } catch (IOException e) {
            System.out.println("Error: " +e.getMessage());
        }
    }


    @Override
    public void deleteRow(int id) {
        try {
            File inputFile = new File(FILE_PATH);
            File tempFile = new File("temp.txt");

            boolean idFound = false;

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(" ");
                    int currentId = Integer.parseInt(parts[0]);

                    if (currentId == id) {
                        idFound = true;
                        System.out.println("Data berhasil dihapus");
                    } else {
                        writer.println(line);

                    }
                }
            }

            if (!idFound) {
                System.out.println("ID data tidak ditemukan");
            }


            if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
                System.err.println("Error updating the file.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @Override
   public void displayRow()  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID yang ingin ditampilkan: ");
        int idToDisplay = scanner.nextInt();
        boolean idFound = false;

        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(FILE_PATH));
        } catch (FileNotFoundException e) {
            System.out.println("Error: " +e.getMessage());
        }
        while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ");
                int id = Integer.parseInt(parts[0]);

                if (id == idToDisplay) {
                    System.out.println(line);
                    idFound=true;
                    break;
                }
            }

        if (!idFound) {
            System.out.println("ID data tidak ditemukan");
        }

    }

    @Override
    public void displayAllRows()  {
        File file = new File(FILE_PATH);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " +e.getMessage());
        }

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
