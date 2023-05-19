package PraktikumPemrogramanLanjut5;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("A", true, "111", true);
        System.out.println(manusia1);

        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("Muhammad Varel Antoni", "1471090207040005", true, false, "225150707111075", 4);
        System.out.println(mahasiswaFILKOM1);

        Pekerja pekerja1 = new Pekerja(1000, 2021, 7, 15, 2, "D", "34567", true, true);
        System.out.println(pekerja1);

        Manager manager1 = new Manager("HRD", 3000, 2008, 2, 4, 3, "G", "678910", true, false);
        System.out.println(manager1);
    }
}
