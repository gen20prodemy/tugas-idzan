import java.util.Scanner;

public class PerhitunganAritmatika {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     //pemanggilan fungsi fungsi perhitngan aritmatika
      penjumlahan();
      pengurangan();
      perkalian();
      pembagian();
      modulus();
    }

    //Penjumlahan
    public  static void penjumlahan(){
        System.out.println("Penjumlahan");
        int angka1= getInput("Angka pertama");
        int angka2= getInput("Angka kedua");
        int hasilPenjumlahan = angka1+angka2;
        System.out.println(angka1+" + "+angka2+" = " +hasilPenjumlahan);
        System.out.println();
    }

    //Pengurangan
    public  static  void pengurangan(){
        System.out.println("Pengurangan");
        int angka1 =getInput("Angka pertama");
        int angka2 =getInput("Angka kedua");
        int hasilPengurangan =angka1-angka2;
        System.out.println(angka1+" - "+angka2+" = " +hasilPengurangan);
        System.out.println();
    }
    //Perkalian
    public  static  void perkalian(){
        System.out.println("Perkalian");
        int angka1 =getInput("Angka pertama");
        int angka2 =getInput("Angka kedua");
        int hasilPerkalian =angka1*angka2;
        System.out.println(angka1+" * "+angka2+" = " +hasilPerkalian);
        System.out.println();
    }
    //Pembagian
    public  static  void pembagian(){
        System.out.println("Pembagian");
        double angka1 =getInputDouble("Angka pertama");
        double angka2 =getInputDouble("Angka kedua");
        double hasilPembagian =angka1/angka2;
        System.out.println(angka1+" / "+angka2+" = " +hasilPembagian);
        System.out.println();
    }
    //Modulus
    public  static  void modulus(){
        System.out.println("Modulus");
        int angka1 =getInput("Angka pertama");
        int angka2 =getInput("Angka kedua");
        int hasilModulus =angka1%angka2;
        System.out.println(angka1+" % "+angka2+" = " +hasilModulus);
        System.out.println();
    }
    // membuat method get input untuk mempersingkat sintak sehingga tidak perlu mengguankan banyak scanner dan print out
    public static int getInput(String kata) {
        System.out.print(kata + ": ");
        return scanner.nextInt();
    }

    public static double getInputDouble(String kata) {
        System.out.print(kata + ": ");
        return scanner.nextDouble();
    }
}
