package PraktikumPemrogramanLanjut5;

class MahasiswaFILKOM extends Manusia{
    private String NIM;
    private double IPK;

    MahasiswaFILKOM(String Nama, String NIK, boolean JenisKelamin, boolean Menikah, String NIM, double IPK){
        super(Nama, JenisKelamin, NIK, Menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public String getStatus(){
        String angkatan = this.NIM.substring(0, 2);
        char prodi = this.NIM.charAt(6);

        switch(prodi){
            case '2': return "Teknik Informatika, 20" + angkatan;
            case '3': return "Teknik Komputer, 20" + angkatan;
            case '4': return "Sistem Informasi, 20" + angkatan;
            case '6': return "Pendidikan Teknologi Informasi, 20" + angkatan;
            case '7': return "Teknologi Informasi, 20" + angkatan;
        }

        return "";
    }

    public double getBeasiswa(){
        if(this.IPK >= 3 && this.IPK <= 3.5){
            return 50 + getPendapatan();
        } else if(this.IPK > 3.5 && this.IPK <= 4){
            return 75 + getPendapatan();
        } else{
            return 0;
        }
    }

    public String toString(){
        return(
                "\nNama\t\t : " + getNama()
                        + "\nNIK\t\t\t : " + getNIK()
                        + "\nJenis Kelamin: " + getJenisKelamin()
                        + "\nPendapatan\t : " + getBeasiswa()
                        + "\nNIM\t\t\t : " + getNIM()
                        + "\nIPK\t\t\t : " + getIPK()
                        + "\nStatus\t\t : " + getStatus()
        );
    }
}
