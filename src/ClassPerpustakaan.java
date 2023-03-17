   class Buku{
    String Judul;
    String Penerbit;
    String Penulis;
    int JumlahHal;
    int TahunTerbit;

    Buku(String Judul, String Penerbit, String Penulis, int JumlahHal, int TahunTerbit) {
        this.Judul = Judul;
        this.Penerbit = Penerbit;
        this.Penulis = Penulis;
        this.JumlahHal = JumlahHal;
        this.TahunTerbit = TahunTerbit;
    }
    void display(){
        System.out.println("\nJudul Buku\t\t: " + this.Judul + "\nPenerbit\t\t: " + this.Penerbit + "\nPenulis\t\t\t: " + this.Penulis + "\nJumlah Halaman\t: " + this.JumlahHal + "\nTahun Terbit\t: " + this.TahunTerbit);
    }
}
