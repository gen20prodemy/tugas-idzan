import java.util.Arrays;
import java.util.Scanner;

public class ArrayTotalBilangan {
    public static void main(String[] args) {
 int[] arrayBilangan = inputArray();

        System.out.println(Arrays.toString(arrayBilangan));
        int total = hitungTotal(arrayBilangan);
        System.out.println("hasil penjumlahan array : " +total);

    }


    public  static int[] inputArray(){
     Scanner input =new Scanner(System.in);
        System.out.print("Masukan Panjang Array: ");
     int panjangArray = input.nextInt();
     int [] array = new int[panjangArray];
     for (int i=0; i<panjangArray;i++){
         System.out.print("Masukan array untuk indeks "+ i+" : ");
         array[i] = input.nextInt();
     }
     return  array;
    }

    public static int hitungTotal (int[] array) {
        int total = 0;

        //iterasi untuk setiap nilai dari indeks awal sampai akhir pada array akan dijumlahkan
        for (int j : array) {
            total += j;
        }
        return  total;
    }



}
