import java.util.Scanner;

public class Pemilihan2Percobaan3_17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input17.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input17.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 20000000)
            pajak = 0.1;
            else if (penghasilan <= 30000000)
            pajak = 0.15;
            else
            pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        }else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 25000000)
            pajak = 0.15;
            else if (penghasilan <= 35000000)
            pajak = 0.2;
            else
            pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("penghasil Bersih : " + gajiBersih);
        } else
            System.out.println("Masukkan Kategori salah");
    }
    
}
