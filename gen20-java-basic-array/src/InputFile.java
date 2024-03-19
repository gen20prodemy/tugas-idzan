import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama file : ");
        String fileName = input.nextLine();
        String fileNameTxt = fileName+".txt";
        System.out.print("Masukan isi file : ");
        String kontenFile = input.nextLine();
        createFile(fileNameTxt,kontenFile);
    }

    public static void createFile(String fileName, String content) {
        // BufferedWriter untuk menulis ke file. Objek ini dibuat dengan menggunakan objek FileWriter 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File " + fileName + " berhasil dibuat.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membuat file: " + e.getMessage());
        }
    }
}
