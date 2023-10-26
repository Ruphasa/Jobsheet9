import java.util.Scanner;
public class LinearSearch24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("berapa banyak elemen yang ada :");
        int elemen = sc.nextInt();
        int[] arrayInt=new int[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("elemen ke-"+(i+1)+" : ");
            arrayInt[i]=sc.nextInt();
        }
        System.out.print("mau nyari elemen berapa : ");
        int key=sc.nextInt();

        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
              hasil=i;
              break;  
            }
        }
        if (hasil == -1) {
            System.out.println("elemen tidak ditemukan");
        }else
        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
    }
}
