import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int counterL=0,counterT=0,mahasiswa;
        double rataL,rataT, totalT=0,totalL=0;
        System.out.print("berapa banyak mahasiswa : ");
        mahasiswa = sc.nextInt();
        for (int i=0; i < mahasiswa; i++) {
            System.out.print("masukan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }for (int i=0; i < mahasiswa; i++) {
            if (nilaiMhs[i]>70) {
                totalL+=nilaiMhs[i];
                counterL++;
            }else{
                totalT+=nilaiMhs[i];
                counterT++;
        }
    }
    rataL=totalL/counterL;
    rataT=totalT/counterT;
    System.out.println("rata-rata nilai mahasiswa lulus = "+rataL);
    System.out.println("rata-rata nilai mahasiswa tidak lulus = "+rataT);
    }
}
