abstract class Civitas {

    protected String Nama;
    protected String JenisKelamin;
    protected String Alamat;

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    public String getNama() {
        return Nama;
    }
    public String getJenisKelamin() {
        return JenisKelamin;
    }
    public String getAlamat() {
        return Alamat;
    }
}

// Dosen
class Dosen extends Civitas{
    private String NIDN;
    private String Gaji;

    public Dosen(String Nama, String JenisKelamin, String Alamat, String NIDN, String Gaji) {
        setNama(Nama);
        setJenisKelamin(JenisKelamin);
        setAlamat(Alamat);
        this.NIDN = NIDN;
        this.Gaji = Gaji;
    }

    void display(){
        System.out.println("\nDosen");
        System.out.println("Nama\t: " + getNama());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Alamat\t: " + getAlamat());
        System.out.println("NIDN\t: " + NIDN);
        System.out.println("Gaji\t: " + Gaji);
    }
}

// Mahasiswa
class Mahasiswa extends Civitas {
    private String NIM;
    private String Jurusan;
    private String IPK;

    Mahasiswa(String Nama, String JenisKelamin, String Alamat, String NIM, String Jurusan, String IPK) {
        setNama(Nama);
        setJenisKelamin(JenisKelamin);
        setAlamat(Alamat);
        this.NIM = NIM;
        this.Jurusan = Jurusan;
        this.IPK = IPK;
    }

    void display(){
        System.out.println("\nMahasiswa");
        System.out.println("Nama\t: " + getNama());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Alamat\t: " + getAlamat());
        System.out.println("NIM\t: " + NIM);
        System.out.println("Jurusan\t: " + Jurusan);
        System.out.println("IPK\t: " + IPK);
    }
}

// Tenaga Pendidik
class Tendik extends Civitas{
    private String Divisi;
    private String Gaji;

    Tendik(String Nama, String JenisKelamin, String Alamat, String Divisi, String Gaji) {
        setNama(Nama);
        setJenisKelamin(JenisKelamin);
        setAlamat(Alamat);
        this.Divisi = Divisi;
        this.Gaji = Gaji;
    }

    void display(){
        System.out.println("\nTenaga Pendidik");
        System.out.println("Nama\t: " + getNama());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Alamat\t: " + getAlamat());
        System.out.println("Divisi\t: " + Divisi);
        System.out.println("Gaji\t: " + Gaji);
    }
}
