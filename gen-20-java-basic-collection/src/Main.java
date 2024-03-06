import java.util.*;

public class Main {
    public static void main(String[] args) {
        //membuat ArrayList untuk menyimpan data barang
        ArrayList<String> listBarang = new ArrayList<>();
        inputBarang(listBarang);
        TampilkanDataBarang.tampilkanDataBarang(listBarang);


        //mengulang method ketika user masuk ke salah satu blok catchnya
        while (true) {
            try {
                TampilkanDataBarang.tampilkanSatuData(listBarang);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Indeks tidak valid.Silahkan masukan lagi");

            } catch (InputMismatchException e) {
                System.out.println("Harus memasukan angka.Silahkan masukan lagi");

            }
        }

        // konversi ArrayList ke HashSet
        Set<String> setBarang = new HashSet<>(listBarang);

        TampilkanDataBarang.tampilkanDataBarang(setBarang);
        //konversi HashSet ke HashMap
        Map<String,Integer> mapBarang = new HashMap<>();
        inputHargaBarang(setBarang, mapBarang);
        TampilkanDataBarang.tampilkanDataBarang(mapBarang);

    }

    public static void inputBarang(ArrayList<String> list){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan data barang , ketik selesai untuk mengakhiri");

        String barang;
        do {
            System.out.print("Nama barang: ");
            barang = input.nextLine();

            // Memeriksa apakah input adalah "selesai"
            if (barang.equalsIgnoreCase("selesai")) {
                break; // Keluar dari loop jika input adalah "selesai"
            }

            // Memeriksa apakah input hanya berisi spasi
            if (!barang.trim().isEmpty() ) {
                list.add(barang);
            } else {
                System.out.println("Nama barang tidak boleh kosong. Harap masukan ulang");
            }
        } while (true);
    }


    public static void inputHargaBarang(Set<String> set, Map<String, Integer> map) {
        Scanner input = new Scanner(System.in);
        for (String barang : set) {
            System.out.print("Masukkan harga untuk " + barang + ": ");
            int harga = input.nextInt();
            map.put(barang, harga);
        }
    }


    }

