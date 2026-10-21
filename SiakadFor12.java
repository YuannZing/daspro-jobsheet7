import java.util.Scanner;

class SiakadFor12 {
    void main() {
        // Deklarasi
        Scanner sc = new Scanner(System.in);

        double nilai,
               tertinggi = 0,
               tereendah = 100;

        // Counter mahasiswa lulus dan tidak lulus
        int lulus = 0, tidakLulus = 0;

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
            // Penambahan logika kelulusan (batas minimal 60)
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + tereendah);

        // Output hasil jumlah lulus dan tidak lulus
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        
        sc.close();
    }
}