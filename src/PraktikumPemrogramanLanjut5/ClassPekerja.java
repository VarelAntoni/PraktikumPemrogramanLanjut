package PraktikumPemrogramanLanjut5;

import java.time.LocalDate;
import java.time.Period;

class Pekerja extends Manusia{
    private double Gaji;
    private LocalDate TahunMasuk;
    private int JumlahAnak;

    Pekerja(double Gaji, int Tahun, int Bulan, int Tanggal, int JumlahAnak, String Nama, String NIK, boolean JenisKelamin, boolean Menikah){
        super(Nama, JenisKelamin, NIK, Menikah);
        this.Gaji = Gaji;
        this.TahunMasuk = LocalDate.of(Tahun, Bulan, Tanggal);
        this.JumlahAnak = JumlahAnak;
    }

    public void setGaji(double Gaji) {
        this.Gaji = Gaji;
    }

    public void setTahunMasuk(LocalDate TahunMasuk) {
        this.TahunMasuk = TahunMasuk;
    }

    public void setJumlahAnak(int JumlahAnak) {
        this.JumlahAnak = JumlahAnak;
    }

    public double getGaji() {
        return Gaji;
    }

    public LocalDate getTahunMasuk() {
        return TahunMasuk;
    }

    public int getJumlahAnak() {
        return JumlahAnak;
    }

    public double getBonus(){
        Period bedaWaktu = Period.between(TahunMasuk, LocalDate.now());
        int lamaBekerja = bedaWaktu.getYears();

        if(lamaBekerja >= 0 && lamaBekerja <= 5){
            return Gaji * (5.0/100);
        } else if(lamaBekerja > 5 && lamaBekerja <= 10){
            return Gaji * (10.0/100);
        } else{
            return Gaji * (15.0/100);
        }
    }

    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan() + 20 * JumlahAnak;
    }

    @Override
    public double getPendapatan() {
        // TODO Auto-generated method stub
        return super.getPendapatan() + getGaji() + getBonus();
    }

    public String toString(){
        return (
                super.toString() +
                        "\nTahunMasuk\t: " + this.TahunMasuk +
                        "\nJumlah Anak\t: " + this.JumlahAnak +
                        "\nGaji\t\t: " + this.Gaji
        );
    }
}
