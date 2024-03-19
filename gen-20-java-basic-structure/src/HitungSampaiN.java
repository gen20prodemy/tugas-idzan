import java.util.Scanner;

public class HitungSampaiN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int n =input.nextInt();

        String tahapan = hitungNilaiN(n);

        System.out.println((n>0) ? tahapan: "nilai n tidak boleh kurang dari 1");


        input.close();
    }
    public static  String hitungNilaiN(int n){
        int total = 0;
        String tahapan= " ";
        for (int i=1;i<=n;i++){
            total+=i;
            tahapan+=i;
            if(i<n){
                tahapan+="+";
            }
        }
        tahapan += " = " + total;
        return tahapan;
    }
}
