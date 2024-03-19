import java.util.Arrays;

public class ArrayBilangan {
    public static void main(String[] args) {

        /*ini adalah salah satu cara membuat variabel array mengunakan satu baris pada contoh tersebut kita akan
        membuat array dengan tipe integer sebanyak 3 elemen*/
        int[] arrayBilangan1 = new int[3];
        // kita dapat mengakses array sesuai indeksnya lalu memasukan nilai untuk indeksnya yang dimulai dari indeks 0
        arrayBilangan1[0] = 1;
        arrayBilangan1[2] =2;
        System.out.print("arrayBilangan1: ");
        printArray(arrayBilangan1);

        int[] arraybilangan2 = getBilangan();
        System.out.print("arrayBilangan2: ");
        printArray(arraybilangan2);

        int[] arraybilangan3 = getBilangan2();
        System.out.print("arrayBilangan3: ");
        System.out.println(Arrays.toString(arraybilangan3));



    }


    // method yang membuat sebuah array dan mengembalikannya
    public  static  int[] getBilangan() {
        int[] angka = {1,2,3};
        return angka;
    }
    // method yang juga membuat array tapi lebih singkat sintaksnya
    public static int[] getBilangan2() {
     return new int[] {4,5,6};
    }

    //method yang berfungsi menampilkan nilai array dari indeks awal sampai akhir
    public static void printArray(int[] array){
        for (int i=0 ; i <array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

}
