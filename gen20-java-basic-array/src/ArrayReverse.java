import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arrayBilangan = inputArray();
        System.out.println(Arrays.toString(arrayBilangan));
        int[]  arrayReverse = reverseArray(arrayBilangan);
        System.out.println(Arrays.toString(arrayReverse));
    }

    public  static int[] inputArray (){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan panjang array: ");
        int panjangArray = input.nextInt();
        int[] array = new int[panjangArray];
        for (int i =0;i<array.length;i++){
            System.out.print("Masukan nilai array untuk indeks "+i+" : ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static int[] reverseArray(int[] array){
        int[] arrayReverse = new int[array.length];

        for(int i=0;i<array.length;i++){
         // nilai dari indeks pertama akan dimasukan dari belakang yaitu urutan paling akhir -1-i
         arrayReverse[i] = array[array.length-1-i];
        }

        return  arrayReverse;
    }
}
