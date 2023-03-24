package PraktikumPemrogramanLanjut;

class Buku{
    String Judul;
    String Penerbit;
    String Penulis;
    int JumlahHal;
    int TahunTerbit;
    String Sinopsis;

    Buku(String Judul, String Penerbit, String Penulis, int JumlahHal, int TahunTerbit, String Sinopsis) {
        this.Judul = Judul;
        this.Penerbit = Penerbit;
        this.Penulis = Penulis;
        this.JumlahHal = JumlahHal;
        this.TahunTerbit = TahunTerbit;
        this.Sinopsis = Sinopsis;
    }
    void display(){
        System.out.println("\nJudul PraktikumPemrogramanLanjut.Buku\t\t\t\t\t: " + this.Judul + "\nPenerbit\t\t\t\t\t: " + this.Penerbit
                + "\nPenulis\t\t\t\t\t\t: " + this.Penulis + "\nJumlah Halaman\t\t\t\t: " + this.JumlahHal + "\nTahun Terbit\t\t\t\t: "
                + this.TahunTerbit + "\nSinopsis\t\t\t\t\t: " + this.Sinopsis);
    }
    public int HitungKata(String sinopsis){
        int HasilHitung = 0;
        for (int i = 0; i < sinopsis.length(); i++){
            if (sinopsis.charAt(i)==' '){
                HasilHitung++;
            }
        }
        HasilHitung = HasilHitung + 1;
        return HasilHitung;
    }
}