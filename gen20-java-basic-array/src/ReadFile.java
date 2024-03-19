import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama file : ");
        String namaFile = input.nextLine();
        String namaFileTxt = namaFile+".txt";
        readFile(namaFileTxt);
    }

    public static void readFile(String fileName){
        //mengeksekusi kode yang mungkin dapat terjadi error , jika error akan menjalankan
        // membaca teks dari suatu input stream dengan buffering
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Isi file "+ fileName+ " : ");
            String line;
            // iterasi agar semua String terbaca dan disimpan kedalam variabel line sampai tidak ada String lagi
            while ((line= reader.readLine()) != null){
                System.out.println(line);
            }
            // akan memberikan keterangan jika saat membaca file terdapat error
        } catch (IOException e){
            System.out.println("Terjadi error " +e.getMessage());
        }
    }
}
