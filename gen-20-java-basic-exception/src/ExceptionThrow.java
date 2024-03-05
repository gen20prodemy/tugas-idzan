import java.util.Scanner;

public class ExceptionThrow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukan angka positif: ");
            int angka= input.nextInt();
            ValidasiAngkaPositif(angka);
            System.out.println("Input Valid: " + angka);
        } catch (IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void ValidasiAngkaPositif(int angka)  {
        // memasukan error handling jika angka kurang dari 1
        if (angka <= 0) {
            throw new IllegalArgumentException("Input harus lebih dari 0");
        }
    }

}
