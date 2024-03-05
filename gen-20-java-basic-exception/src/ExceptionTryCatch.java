import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionTryCatch {
    public static void main(String[] args) {
    double hasil = AritmatikaException();
        System.out.println(hasil);
    }
    //method untuk melakukan operasi pembagian yang didalamnya ada penanganan exception
    public static int AritmatikaException(){
        Scanner input = new Scanner(System.in);
        // Menggunakan try-with-resources statement agar sumber daya Scanner ditutup secara otomatis
        try (input) {
            System.out.println("Pembagian");
            System.out.print("Masukan angka 1: ");
            int num1 = input.nextInt();
//            input.close();
            System.out.print("Masukan angka 2: ");
            int num2 = input.nextInt();
            return num1 / num2;
          // handling error ketika tipe data yang di input tidak sesuai
        } catch (InputMismatchException e) {
            System.out.println("Input tidak sesuai dengan tipe data yang diharapkan.");
            return 0;
          // handling error ketika angka baginya berupa 0
        } catch (ArithmeticException e) {
            System.out.println("Pembagi tidak boleh 0");
            return 0;
         // handling error ketika salah menaruh kode input.close
        }catch (IllegalStateException e) {
            System.out.println("Scanner tidak dalam keadaan yang benar.");
            return 0;
        }

    }
}
