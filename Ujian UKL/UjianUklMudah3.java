import java.util.Scanner;

public class UjianUklMudah3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Bilangan Awal");
        int start = scanner.nextInt();

        System.out.println("Masukkan Bilangan Akhir");
        int end = scanner.nextInt();
        
        for (int a = start; a > end; a--) {
            if (a % 4 == 0) {
                System.out.println(a + ". saya anak angkatan 33");
            } else if (a % 4 == 1) {
                System.out.println(a + ". saya anak moklet"); 
            } else if (a % 4 == 2) {
                System.out.println(a + ". saya anak wikusama"); 
            } else {
                System.out.println(a + ". saya senang");
            }
        }
        System.out.println("1. saya anak moklet");
    }
}
    

