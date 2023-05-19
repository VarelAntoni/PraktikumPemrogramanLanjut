package PraktikumPemrogramanLanjut5;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("A", true, "111", true);
        System.out.println(manusia1);
        Manusia manusia2 = new Manusia("B", false, "222", true);
        System.out.println(manusia2);
        Manusia manusia3 = new Manusia("C", false, "222", false);
        System.out.println(manusia2);

        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("Muhammad Varel Antoni", "1471090207040005", true, false, "225150707111075", 2.7);
        System.out.println(mahasiswaFILKOM1);
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("Muhammad Varel Antoni", "1471090207040005", true, false, "225150707111075", 3.4);
        System.out.println(mahasiswaFILKOM2);
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("Muhammad Varel Antoni", "1471090207040005", true, false, "225150707111075", 4);
        System.out.println(mahasiswaFILKOM3);

        Pekerja pekerja1 = new Pekerja(1000, 2021, 7, 15, 2, "D", "34567", true, true);
        System.out.println(pekerja1);
        Pekerja pekerja2 = new Pekerja(3000, 2014, 4, 12, 4, "E", "56789", false, true);
        System.out.println(pekerja2);
        Pekerja pekerja3 = new Pekerja(7000, 2023, 2, 5, 10, "F", "12345", true, true);
        System.out.println(pekerja3);

        Manager manager1 = new Manager("HRD", 7500, 2008, 2, 4, 3, "G", "678910", true, false);
        System.out.println(manager1);
    }
}
