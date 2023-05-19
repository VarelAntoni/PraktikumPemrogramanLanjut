package PraktikumPemrogramanLanjut5;

class Manager extends Pekerja{
    private String Departemen;

    Manager(String Departemen, double Gaji, int Tahun, int Bulan, int Tanggal, int JumlahAnak, String Nama, String NIK, boolean JenisKelamin, boolean Menikah){
        super(Gaji, Tahun, Bulan, Tanggal, JumlahAnak, Nama, NIK, JenisKelamin, Menikah);
        this.Departemen = Departemen;
    }

    public void setDepartemen(String Departemen) {
        this.Departemen = Departemen;
    }

    public String getDepartemen() {
        return Departemen;
    }

    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan() + ((10.0/100) * getGaji());
    }

    public String toString(){
        return(
                super.toString() +
                        "\nDepartemen\t: " + this.Departemen
        );
    }
}
