package PraktikumPemrogramanLanjut4;

class Jaket{
    String Tipe;
    int Harga;
    int Jumlah;
    final int JaketA = 100000;
    final int JaketB = 125000;
    final int JaketC = 175000;

    public Jaket(String Tipe, int Jumlah){
        this.Tipe = Tipe;
        this.Jumlah = Jumlah;
    }

    void HargaJaketA(){
        if (Jumlah>100)
            Harga = JaketA - 5000;
        else
            Harga = JaketA;
    }

    void HargaJaketB(){
        if (Jumlah>100)
            Harga = JaketB - 5000;
        else
            Harga = JaketB;
    }

    void HargaJaketC(){
        if (Jumlah>100)
            Harga = JaketC - 15000;
        else
            Harga = JaketC;
    }

    void display(){
        if (Tipe.equalsIgnoreCase("1")) {
            HargaJaketA();
            setPesanan();
        }
        else if (Tipe.equalsIgnoreCase("2")) {
            HargaJaketB();
            setPesanan();
        }
        else if (Tipe.equalsIgnoreCase("3")) {
            HargaJaketC();
            setPesanan();
        }
        else System.out.println("[ERROR]");
    }

    void setPesanan(){
        String TipeJaket = null;
        if (Tipe.equalsIgnoreCase("1"))
            TipeJaket = "Jaket A";
        else if (Tipe.equalsIgnoreCase("2")) {
            TipeJaket = "Jaket B";
        } else if (Tipe.equalsIgnoreCase("3")) {
            TipeJaket = "Jaket C";
        }
        System.out.println("Jenis yang anda beli : " + TipeJaket);
        System.out.println("Harga                : " + Harga);
        System.out.println("Jumlah jaket         : " + Jumlah + " pcs");
        System.out.println("Total harga          : " + Harga*Jumlah);
    }
}