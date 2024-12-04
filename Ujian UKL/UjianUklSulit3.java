import java.util.Scanner;

public class UjianUklSulit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Masukkan nilai array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Menyimpan apakah elemen sudah dihitung
        boolean sudahDihitung[] = new boolean[array.length];
        
        // Menghitung frekuensi elemen
        for (int i = 0; i < array.length; i++) {
            // Jika elemen sudah dihitung, lewati
            if (sudahDihitung[i]) {
                continue;
            }
            
            int frekuensi = 1;  // Setiap elemen muncul setidaknya sekali
            // Hitung jumlah kemunculan elemen yang sama
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frekuensi++;
                    sudahDihitung[j] = true;  // Tandai elemen yang sudah dihitung
                }
            }
            
            // Menampilkan hasil frekuensi untuk elemen yang belum dihitung
            System.out.println(array[i] + " muncul " + frekuensi + " kali");
        }
    }
}
