import java.util.Scanner;

public class UjianUklSedangKiri2 {
  static void volumeTabung(int r, int t) {
    double phi = 3.14;
    double hasil = phi * r * r * t;
    System.out.println("volume tabung: " + hasil);
 }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Masukkan jari jari tabung");
    int j = scanner.nextInt();
    System.out.println("Masukkan tinggi tabung");
    int t = scanner.nextInt();
    volumeTabung(j, t);
 } 
}
