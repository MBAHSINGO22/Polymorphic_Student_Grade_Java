<h1 align="center">🎓 Polymorphic Student Grade Java</h1>
<p align="center">
  <b>Demo Polimorfisme dan Pewarisan untuk Pengelolaan Nilai Mahasiswa di Java</b><br>
  <sub>Proyek Java yang mengimplementasikan konsep inheritance dan polymorphism dalam pengelolaan data mahasiswa S1 dan S2.</sub>
</p>

<div align="center">

[![Java](https://img.shields.io/badge/Java-17-red?logo=oracle)](https://www.oracle.com/java/)
[![OOP](https://img.shields.io/badge/Concept-Inheritance%20%26%20Polymorphism-blue)]()
[![Educational](https://img.shields.io/badge/Type-OOP%20Project-green)]()
[![Author](https://img.shields.io/badge/Author-MBAHSINGO22-brightgreen)](https://github.com/MBAHSINGO22)

</div>

---

## 📖 Deskripsi Proyek

**Polymorphic_Student_Grade_Java** adalah proyek Java yang mendemonstrasikan penggunaan **pewarisan (inheritance)** dan **polimorfisme (polymorphism)** untuk mengelola data mahasiswa S1 dan S2.  
Program ini mendukung input data, perhitungan nilai akhir berdasarkan bobot, konversi ke huruf sesuai jenjang, dan penyaringan mahasiswa S1 yang lulus.

Proyek ini berfokus pada:
- 📊 **Mahasiswa.java** – Kelas induk dengan atribut dasar (`NIM`, `nama`, `tanggal lahir`, `UTS1`, `UTS2`, `UAS`) dan metode `hitungNilaiAkhir()`.
- 🔍 **Mahasiswa1.java** – Kelas turunan untuk mahasiswa S1 dengan metode konversi nilai huruf berdasarkan skala (A: ≥80, B: ≥70, C: ≥56, D: ≥45, E: <45).
- 🔍 **Mahasiswa2.java** – Kelas turunan untuk mahasiswa S2 dengan metode konversi nilai huruf berbeda (A: ≥85, B: ≥70, C: ≥56, D: ≥45, E: <45).
- 🛠️ **MainMahasiswa.java** – Kelas utama yang menerima input, menyimpan data dalam array bertipe `Mahasiswa`, menampilkan daftar mahasiswa, dan menyaring mahasiswa S1 yang lulus.

---

## 📂 Struktur File

```
Polymorphic_Student_Grade_Java/
├── src/Modul_8/
├── MainMahasiswa.java      # 🛠️ Kelas utama untuk pengujian
├── Mahasiswa.java          # 📊 Kelas induk untuk data mahasiswa
├── Mahasiswa1.java         # 🔍 Kelas turunan untuk mahasiswa S1
├── Mahasiswa2.java         # 🔍 Kelas turunan untuk mahasiswa S2
```

---

## 🧰 Teknologi

- ☕ Java 17+
- 🧪 IDE: IntelliJ IDEA / NetBeans / Eclipse / Terminal (javac)

---

## 🧪 Catatan

- Program menerima input jumlah mahasiswa, jenjang (`1` untuk S1, `2` untuk S2), dan detail data mahasiswa melalui konsol.
- Nilai akhir dihitung menggunakan rumus:
  ```
  Nilai Akhir = 0.3 × UTS1 + 0.3 × UTS2 + 0.4 × UAS
  ```
- Konversi nilai ke huruf berbeda antara S1 dan S2.
- Mahasiswa S1 dianggap **lulus** jika nilai huruf bukan `E`.
- Program menggunakan **array bertipe superclass** untuk menyimpan semua objek mahasiswa.

---

## 📈 Contoh Output

```
Masukkan jumlah mahasiswa: 2

Data untuk mahasiswa ke-1
Masukkan jenjang (1 untuk S1, 2 untuk S2): 1
Masukkan NIM: 235314100
Masukkan Nama: SISKO
Masukkan Tanggal Lahir: 22
Masukkan Nilai UTS 1: 90
Masukkan Nilai UTS 2: 90
Masukkan Nilai UAS: 70

Data untuk mahasiswa ke-2
Masukkan jenjang (1 untuk S1, 2 untuk S2): 2
Masukkan NIM: 235314099
Masukkan Nama: EUGENIUS
Masukkan Tanggal Lahir: 25
Masukkan Nilai UTS 1: 90
Masukkan Nilai UTS 2: 90
Masukkan Nilai UAS: 90

Daftar Mahasiswa:
Nama: SISKO, Jenjang: S1, Nilai: A
Nama: EUGENIUS, Jenjang: S2, Nilai: A

Mahasiswa S1 yang lulus:
Nama: SISKO, Nilai: A
```

---

## 🧠 Fitur

- Pewarisan (`Inheritance`) dan Polimorfisme (`Polymorphism`)
- Perhitungan nilai akhir berbasis bobot
- Konversi nilai ke huruf sesuai jenjang
- Penyaringan mahasiswa S1 yang lulus
- Penggunaan `instanceof` untuk pengecekan tipe objek

---

## 👨‍💻 Pengembang

**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)
