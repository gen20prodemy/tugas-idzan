//variabel adalah tempat menyimpan nilai pada pemrograman di dalam memori komputer

public  class AtributVariabel {
   //variabel yang di dalam suatu class utama dan diluar method disebut variabel global
    static byte  umur = 28;
    //variabel yang tidak memiliki static harus membuat object/instance terlebih dahulu saat memanggilnya
    String negara = "Indonesia";


    public static void main(String[] args) {
        AtributVariabel obj = new AtributVariabel();
        int angka = 7;
        // mengunakan final berarti membuat variabel menjadi konstanta sehingga nilainya menjadi tetap tidak bisa diubah
        final double  phi = 3.14;

        String kota = "Jakarta";

        System.out.println(angka);
        System.out.println(kota);
        System.out.println(obj.negara);
        System.out.println(umur);
        System.out.println(phi);
    }
}
