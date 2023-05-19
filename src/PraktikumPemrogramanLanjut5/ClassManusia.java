package PraktikumPemrogramanLanjut5;

class Manusia {
    private String Nama;
    private boolean JenisKelamin;
    private String NIK;
    private boolean Menikah;


    public Manusia(String Nama, boolean JenisKelamin, String NIK, boolean Menikah) {
        this.Nama = Nama;
        this.NIK = NIK;
        this.JenisKelamin = JenisKelamin;
        this.Menikah = Menikah;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setJenisKelamin(boolean JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setNik(String NIK) {
        this.NIK = NIK;
    }

    public void setMenikah(boolean Menikah) {
        this.Menikah = Menikah;
    }

    public String getNama() {
        return Nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin == true ? ("Laki-laki") : "Perempuan";
    }

    public String getNIK() {
        return NIK;
    }

    public boolean getMenikah() {
        return Menikah;
    }

    public double getTunjangan() {
        if (getMenikah()) {
            if (JenisKelamin == true) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString() {
        return ("\nNama\t\t: " + this.Nama
                + "\nNIK\t\t\t: " + this.NIK
                + "\nJenisKelamin: " + this.getJenisKelamin()
                + "\nPendapatan\t: " + getPendapatan());
    }
}

