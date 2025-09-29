package Modul_8;

public class Mahasiswa {
    protected String NIM;
    protected String Nama;
    protected String tglLahir;
    protected double UTS1;
    protected double UTS2;
    protected double UAS;

    public Mahasiswa(String NIM, String Nama, String tglLahir, double UTS1, double UTS2, double UAS) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.tglLahir = tglLahir;
        this.UTS1 = UTS1;
        this.UTS2 = UTS2;
        this.UAS = UAS;
    }

    public String getNim() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public double getUts1() {
        return UTS1;
    }

    public double getUts2() {
        return UTS2;
    }

    public double getUas() {
        return UAS;
    }

    public double hitungNilaiFinal() {
        return 30 * UTS1 / 100 + 30 * UTS2 / 100 + 40 * UAS / 100;
    }
}
