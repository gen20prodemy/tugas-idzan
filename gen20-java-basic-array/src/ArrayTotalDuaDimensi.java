import java.util.Arrays;
import java.util.Scanner;

public class ArrayTotalDuaDimensi {
    public static void main(String[] args) {
    int[][] arrayBilangan2D= inputArray2D();
        System.out.println(Arrays.deepToString(arrayBilangan2D));
        int [] totalHitungArray2D = hasilHitungArray2D(arrayBilangan2D);
        System.out.print("hasil penjumlahan array 2D kedalam array 1D:");
        System.out.println(Arrays.toString(totalHitungArray2D));


    }



    public  static int[][] inputArray2D(){
        Scanner input =new Scanner(System.in);
        System.out.print("Masukan Baris Array: ");
        int barisArray = input.nextInt();
        System.out.print("Masukan Kolom Array: ");
        int kolomArray = input.nextInt();
        int [][] array = new int[barisArray][kolomArray];
        for (int i=0; i<barisArray;i++){
            for (int j=0; j<kolomArray;j++) {
                System.out.print("Masukan array untuk indeks "+"["+ i+"]"+"["+ j+"]"+" : ");
                array[i][j] = input.nextInt();
            }

        }
        return  array;
    }

    public static int[] hasilHitungArray2D(int[][] array){
        int[] totalPerBaris = new int[array.length] ;
        int i = 0;
        // iterasi untuk setiap barisnya
        for (int[] baris : array){
            //inisiasi total untuk mereset ketika berpindah baris
            int total = 0;

            // iterasi untuk setiap nilai (kolom) pada baris akan dijumlahkan
            for (int nilai : baris){
                total += nilai;
            }
            //menyimpan  total per indeks
            totalPerBaris[i]=total;
          // pindah ke baris selanjutnya
          i++;
        }
        return  totalPerBaris;
    }

}

