package Praktikum08;
import java.util.Scanner;

public class StudiKasus201pkm {
    public static void main(String[] args) {
        Scanner abror = new Scanner(System.in);
        
        String nama,jenisKegiatan,pesan;
        int jmlDokumen, peringkatJuara, statusDana;
        int status;

        System.out.print("Nama Mahasiswa : ");
        nama = abror.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = abror.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            jmlDokumen = abror.nextInt();
            System.out.print("Peringkat juara : ");
            peringkatJuara = abror.nextInt();
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                 pesan = "Selamat anda mendapatkan dana penghargaan";                
             if (jmlDokumen < 4) {
                int selisih = 4 - jmlDokumen;
                    pesan = "Dokumen tidak lengkap (kurang "+ selisih + " dokumen), Dana penghargaan tidak diberikan";        
                }   
            } else {
                pesan = "Maaf anda tidak mendapatkan dana penghargaan";
            } 

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            jmlDokumen = abror.nextInt();
            System.out.print("Status Pendanaan (1/0) : ");
            statusDana = abror.nextInt();
            if (statusDana == 1) {
                pesan = "Selamat anda mendapatkan dana penghargaan";                
                if (jmlDokumen < 4) {
                int selisih = 4 - jmlDokumen;
                    pesan = "Dokumen tidak lengkap (kurang "+ selisih + " dokumen), Dana penghargaan tidak diberikan"; }                      
            } else {
                pesan = "Maaf anda tidak mendapatkan dana penghargaan";
            } 

        } else {
            pesan = "Maaf anda tidak mendapatkan dana penghargaan";
        }       
        System.out.println("Status : "+pesan);
    
    }
}

