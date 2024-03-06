import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TampilkanDataBarang {
    public static void tampilkanDataBarang(ArrayList<String> list) {
        System.out.println("\nData Barang:");

        for (String barang : list) {
            System.out.println(barang);
        }
        System.out.println("Banyak data barang : " + list.size());
    }

    public static void tampilkanDataBarang(Set<String> set) {
        System.out.println();
        System.out.println("Data Barang Unik:");

        for (String barang : set) {
            System.out.println(barang);
        }
        System.out.println("Banyak data barang: " + set.size());
    }

    public static void tampilkanDataBarang(Map<String, Integer> map) {
        System.out.println();
        System.out.println("\nData Barang dan Harga:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String barang = entry.getKey();
            int harga = entry.getValue();
            System.out.println(barang + ": " + harga);
        }
    }

    public static void tampilkanSatuData(ArrayList<String> list){
        Scanner input = new Scanner(System.in);
        System.out.print("\nPilih indeks data yang ingin ditampilkan (0 - " + (list.size() - 1) + "): ");
        int index = input.nextInt();

        System.out.println("Data Barang pada indeks " + index + ": " + list.get(index));


    }
}
