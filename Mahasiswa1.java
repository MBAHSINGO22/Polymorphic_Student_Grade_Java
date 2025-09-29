package Modul_8;

public class Mahasiswa1 extends Mahasiswa {
    public Mahasiswa1(String NIM, String Nama, String tglLahir, double UTS1, double UTS2, double UAS) {
        super(NIM, Nama, tglLahir, UTS1, UTS2, UAS);
    }

    public String konversiNilaiFinal() {
        double nilaiFinal = hitungNilaiFinal();
        if (nilaiFinal >= 80) {
            return "A";
        } else if (nilaiFinal >= 70) {
            return "B";
        } else if (nilaiFinal >= 56) {
            return "C";
        } else if (nilaiFinal >= 45) {
            return "D";
        } else {
            return "E";
        }
    }
}


