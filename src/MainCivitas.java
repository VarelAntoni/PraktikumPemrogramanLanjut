import java.util.Scanner;

public class MainCivitas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa Civitas1 = new Mahasiswa("Varel", "Laki-Laki", "Pekanbaru", "225150707111075", "Teknologi Informasi", "3.9");
        Dosen Civitas2 = new Dosen("Pak Jono", "Laki-Laki", "Malang", "010101", "15.000.000");
        Tendik Civitas3 = new Tendik("Pak Budi", "Laki Laki", "Malang", "Administrasi","Rp. 10.000.000" );

        Civitas1.display();
        Civitas2.display();
        Civitas3.display();
    }
}
