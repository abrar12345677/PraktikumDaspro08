/*
Absen : 01
hargaPerCup = 15000 + (P mod 6) × 1000
hargaPerCup = 15000 + (1 mod 6) × 1000 = Rp 16000

Syarat minimal belanja untuk diskon = 80000 + (1 mod 5) × 10000 → Rp 90000

Persentase diskon = 5 + (1 mod 6) % → 6%
*/

package Praktikum08;
import java.util.Scanner;

public class StudiKasus101 {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);

        int hargaPerCup = 16000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Total jumlah cup : ");
        jumlahCup = abror.nextInt();
        System.out.print("Uang yang dibayar : Rp");
        uangBayar = abror.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 90000) {
            diskon = totalHarga * 6 / 100;            
        }
        
        totalBayar = totalHarga - diskon;
        
        System.out.println("Total Harga : " + totalHarga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total Bayar : " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian : " + kembalian);            
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang Kurang : " + kurang);        
        }

        abror.close();
    }
}