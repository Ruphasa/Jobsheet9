import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double rata2, total=0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("masukan nilai mahasiswa ke-"+i+" : ");
            nilaiMhs[i] = sc.nextInt();
        } for (int i = 0; i < nilaiMhs.length; i++) {
            total+=nilaiMhs[i];
        }
        rata2=total/nilaiMhs.length;
        System.out.println("rata-rata nilai = "+rata2);
    }
}
