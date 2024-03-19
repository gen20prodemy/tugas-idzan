import java.util.Scanner;


//Buatlah program untuk menerima input bilangan bulat positif n dan menampilkan n bilangan bulat
// positif pertama yang habis dibagi 3 tetapi tidak habis dibagi 2
public class BilanganKhusus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka = input.nextInt();
        Bilangan bilangan = new Bilangan(angka);

        if (angka > 0) {
            bilangan.filterBilangan();
        } else {
            System.out.println("Bilangan harus bulat positif");
        }

        input.close();
    }
}

// pendekatan oop dengan membuat class yang isinya ada method dan attributnya
class Bilangan {
    public int n;

    public Bilangan(int n) {
        this.n = n;
    }

    public void filterBilangan() {
        int count = 0;
        // lakukan looping dengan pertambahan 3 sebanyak angka yang dimasukan
        for (int i = 3; count < n; i += 3) {
            // hanya mencetak angka yang tidak habis dibagi 2
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

}