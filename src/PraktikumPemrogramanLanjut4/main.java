package PraktikumPemrogramanLanjut4;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======= Toko Labkomdas =======");
        System.out.println("Menyediakan 3 Tipe Jaket");
        System.out.println("1. Jaket A : Rp. 100.000");
        System.out.println("2. Jaket B : Rp. 125.000");
        System.out.println("3. Jaket C : Rp. 175.000");
        System.out.println("Pilih Jenis Jaket");
        System.out.print("Tipe jaket yang anda pesan: ");
        String tipe = input.next();
        System.out.print("Jumlah jaket yang anda pesan: ");
        int jumlah = input.nextInt();
        System.out.println("");
        Jaket pesanan = new Jaket(tipe, jumlah);
        pesanan.display();
    }
}
