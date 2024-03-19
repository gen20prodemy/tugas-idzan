import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Angka");
        int angka1= scanner.nextInt();
        int angka2= scanner.nextInt();
        int jumlah = angka1+angka2;
        System.out.println("hasil penjumlahan= "+jumlah);
        jumlah+=1;
        System.out.println("jumlah + 1 = " +jumlah);
        cekGanjilGenap(jumlah);

    }

    public static void cekGanjilGenap(int hasil){
    //gunakan logika if modulus untuk menentukan bilangan genap atau ganjilnya
    if (hasil%2==0) {
        //karena hasil dibagi 2 nya 0 maka genap
        System.out.println(hasil+" Adalah bilangan genap");
    } // blok else menampilkan selain dari hasil%2== 0
    else {
        System.out.println(hasil+ " Adalah bilangan ganjil");
    }
    }
}
