import java.util.Scanner;

public class UjianUklMudahKiri2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai awal");
        int nilaiAwal = input.nextInt();

        
        System.out.println("Masukkan Nilai Akhir");
        int nilaiAkhir = input.nextInt();

    
        for(int i = nilaiAwal; i >= nilaiAkhir; i--){
            if (i % 2 == 0) {
                System.out.println( i + " adalah bilangan genap ");
        } else {
            System.out.println( i + " adalah bilangan ganjil ");
        }
    }   

        
    }
}

