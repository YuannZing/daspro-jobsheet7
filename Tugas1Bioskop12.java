import java.util.Scanner;

public class Tugas1Bioskop12 {
    void main() {
        // deklarasi
        Scanner sc = new Scanner(System.in);

        int tiket, totalTiket = 0, totalPenjualan = 0,
                hargaTiket = 50000;

        double diskon=0, totalHarga=0;

        // logika loop
        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            tiket = sc.nextInt();

            if (tiket == 0) {
                break;
            }

            if (tiket > 0 && tiket <= 4) {
                totalHarga = tiket * hargaTiket;
            }
            else if (tiket > 4 && tiket <= 10) {
                diskon = 0.1;
                totalHarga = tiket * (hargaTiket - (hargaTiket * diskon));
            }
            else if (tiket > 10) {
                diskon = 0.15;
                totalHarga = tiket * (hargaTiket - (hargaTiket * diskon));
            }
            else{
                System.out.println("Jumlah tiket tidak valid, Inputkan ulang!");
                continue;
            }
            System.out.println("Diskon yang didapat : " + (int) (diskon*100) + "%");
            System.out.println("Total yang harus dibayar: Rp." +(int) totalHarga);

            totalTiket += tiket;
            totalPenjualan += totalHarga;
        }

        System.out.println("=====================================");
        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total penjualan tiket selama satu hari: Rp." + totalPenjualan);
        sc.close();
    }
}
