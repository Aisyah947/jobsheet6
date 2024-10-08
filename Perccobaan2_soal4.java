import java.util.Scanner;

public class Perccobaan2_soal4 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        int pilihan_menu;
        String member;
        String jenisPembayaran;
        double diskon;
        int harga;
        double total_bayar;

        System.out.println("----------------------------");
        System.out.println("===== MENU KAFE JTI ========");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input17.nextInt();
        input17.nextLine(); 
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input17.nextLine();
        System.out.print("Masukkan jenis pembayaran (QRIS): ");
        jenisPembayaran = input17.nextLine();
        System.out.println("---------------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
        } else if (member.equalsIgnoreCase("n")) {
            diskon = 0.0;
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        } else {
            System.err.println("Masukkan pilihan menu dengan benar");
            return;
        }

        total_bayar = harga - (harga * diskon);

        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            total_bayar -= 1000; 
            System.out.println("Anda menggunakan QRIS, mendapatkan potongan tambahan Rp. 1.000.");
        }

        System.out.println("Total bayar setelah diskon dan potongan QRIS = " + total_bayar);
        System.out.println("-----------------------------------------");
    }
}
    
