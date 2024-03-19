import java.util.Scanner;

public class SegitigaDenganLooping {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

       segitigaSikuSiku();
       segitigaSamaKaki();


    }

    public static void segitigaSikuSiku(){
        System.out.print("Masukan tinggi: ");
        int tinggiSegitiga = scanner.nextInt();
        int lebarbintang=1;
        //perulangan ini akan melooping tinggi segitiganya
        for (int i = 0;i<tinggiSegitiga;i++){
            //perulangan ini akan melooping lebar segitiganya
            for (int j = 0 ; j<lebarbintang;j++){
                System.out.print("*");
            }
            lebarbintang+=2;
            //pindah ke baris baru saat looping selesai
            System.out.println();
        }
        //memberi spasi untuk segitiga selanjutnya
        System.out.println();
    }

    public static void segitigaSamaKaki(){
        System.out.print("Masukan tinggi: ");
        int tinggiSegitiga = scanner.nextInt();
        int lebarbintang=1;
        //perulangan ini akan melooping tinggi segitiganya
        for (int i = 0;i<tinggiSegitiga;i++){
            //memberi spasi agar segitiganya terpusat ke tengah
            for (int j=0 ;j<tinggiSegitiga-i;j++){
                System.out.print(" ");
            }
            //perulangan ini akan melooping lebar segitiganya
            for (int k = 0 ; k<lebarbintang;k++){
                System.out.print("*");
            }
            lebarbintang+=2;

            //pindah ke baris baru saat looping selesai
            System.out.println();
        }
    }
}
