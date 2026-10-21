import java.util.Scanner;

class SiakadFor12 {
    void main() {
        // Deklarasi
        Scanner sc = new Scanner(System.in);

        double nilai,
               tertinggi = 0,
               tereendah = 100;

        // Logika For
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < tereendah) {
                tereendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + tereendah);
        
        sc.close();
    }
}