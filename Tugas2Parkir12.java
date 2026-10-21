import java.util.Scanner;

public class Tugas2Parkir12 {
    void main() {
        // deklarasi
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, 
            total=0;

        // logika loop
        while (true) {
            System.out.print("Masukkan jenis (1: mobil, 2: motor, 0: keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else if (jenis == 0) {
                break; // Keluar loop hanya jika input 0
            } else {
                System.out.println("Jenis kendaraan tidak valid, silakan coba lagi.");
            }
        }
        System.out.println("Total pembayaran kendaraan: Rp." + total);
        sc.close();
    }
}
