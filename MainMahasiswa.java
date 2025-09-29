package Modul_8;

import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class MainMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Minta pengguna untuk memasukkan jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();

        // Membuat array untuk menyimpan referensi ke objek Mahasiswa
        Mahasiswa[] roster = new Mahasiswa[jumlahMahasiswa];

        // Looping untuk meminta data setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data untuk mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan jenjang (1 untuk S1, 2 untuk S2): ");
            int jenjang = input.nextInt();
            input.nextLine();

            // Minta data lainnya untuk setiap mahasiswa
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Tanggal Lahir: ");
            String tglLahir = input.nextLine();
            System.out.print("Masukkan Nilai UTS 1: ");
            double uts1 = input.nextDouble();
            System.out.print("Masukkan Nilai UTS 2: ");
            double uts2 = input.nextDouble();
            System.out.print("Masukkan Nilai UAS: ");
            double uas = input.nextDouble();

            // Menentukan jenis Mahasiswa berdasarkan jenjang dan membuat objeknya
            if (jenjang == 1) {
                roster[i] = new Mahasiswa1(nim, nama, tglLahir, uts1, uts2, uas);
            } else {
                roster[i] = new Mahasiswa2(nim, nama, tglLahir, uts1, uts2, uas);
            }
        }

        // Menampilkan semua mahasiswa
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mhs : roster) {
            // Menentukan jenjang berdasarkan instance
            String jenjang = (mhs instanceof Mahasiswa1) ? "S1" : "S2";
            // Mengkonversi nilai akhir menjadi huruf
            String nilaiHuruf;
            if (mhs instanceof Mahasiswa1) {
                nilaiHuruf = ((Mahasiswa1) mhs).konversiNilaiFinal();
            } else {
                nilaiHuruf = ((Mahasiswa2) mhs).konversiNilaiFinal();
            }
            // Menampilkan detail mahasiswa
            System.out.println("Nama: " + mhs.Nama + ", Jenjang: " + jenjang + ", Nilai: " + nilaiHuruf);
        }

        // Menampilkan mahasiswa S1 yang lulus
        System.out.println("\nMahasiswa S1 yang lulus:");
        for (Mahasiswa mhs : roster) {
            if (mhs instanceof Mahasiswa1) {
                // Konversi nilai akhir menjadi huruf dan cek apakah tidak "E"
                String nilaiHuruf = ((Mahasiswa1) mhs).konversiNilaiFinal();
                if (!"E".equals(nilaiHuruf)) {
                    System.out.println("Nama: " + mhs.Nama + ", Nilai: " + nilaiHuruf);
                }
            }
        }
    }
}
