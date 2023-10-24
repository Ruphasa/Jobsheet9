import java.util.Scanner;
public class tugas9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] nilai = new int[100000];
        int cardinal, wadah=0,total=0;
        double rata2;
        System.out.print("berapa banyak elemen yang ada : ");
        cardinal = sc.nextInt();
        for (int i = 0; i < cardinal; i++) {                            
            System.out.print("masukan nilai ke elemen "+(i+1)+" : ");
            nilai[i]=sc.nextInt();
            total+=nilai[i];
        }for (int i = 0; i < cardinal; i++) {
            for (int j = 1; j < cardinal; j++) {
                if (nilai[j-1]>nilai[j]) {
                    wadah=nilai[j];
                    nilai[j]=nilai[j-1];
                    nilai[j-1]=wadah;
                }
            }
        }rata2 =(double) total/cardinal;
        System.out.println("Rata rata nilai dari elemen = "+rata2);
        System.out.println("Nilai tertinggi = "+nilai[cardinal-1]);
        System.out.println("Nilai terendah = "+nilai[0]);
    }
}
