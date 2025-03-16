# JANJI
Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan Tugas Praktikum 3 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Desain Program
Program ini mensimulasikan sebuah sistem komputer yang terdiri dari beberapa komponen utama:
1. **CPU** (Central Processing Unit)
2. **GPU** (Graphics Processing Unit)
3. **RAM** (Random Access Memory)
4. **Storage** (Penyimpanan: SSD/HDD)
5. **PSU** (Power Supply Unit)
6. **Komputer** (Mengelola komponen-komponen di atas)

Fitur utama program ini meliputi:
- Menambahkan dan menghapus komponen seperti RAM dan Storage
- Mengganti CPU, GPU, dan PSU
- Menampilkan informasi spesifikasi komputer secara real-time
- Menggunakan konsep Object-Oriented Programming (OOP) dengan pemisahan kelas

Program ini telah diimplementasikan dalam tiga bahasa pemrograman:
- **C++**
- **Java**
- **Python**

## Alur Program
1. Membuat objek komponen seperti CPU, GPU, RAM, Storage, dan PSU.
2. Membuat objek komputer dengan komponen awal.
3. Menampilkan spesifikasi awal komputer.
4. Melakukan berbagai operasi:
   - Menambahkan dan menghapus RAM/Storage
   - Mengganti CPU, GPU, atau PSU
   - Menampilkan spesifikasi setelah perubahan
5. Program berjalan hingga semua operasi selesai.

## Struktur Kelas dan Hubungannya
### **Komponen (Superclass / Parent Class)**
- Atribut:
  - `merk` (String) → Merek komponen
  - `nama` (String) → Nama model komponen
- Metode:
  - Getter dan setter untuk atribut di atas.
  - `displayInfo()` → Menampilkan informasi komponen.

### **CPU dan GPU (Subclass dari Komponen)**
- **CPU:**
  - Atribut tambahan:
    - `jumlahCore` (int) → Jumlah core CPU.
    - `kecepatanGHz` (double) → Kecepatan dasar dalam GHz.
    - `maxOverclock` (double) → Kecepatan maksimum overclock.
  - Metode tambahan:
    - Getter dan setter untuk atribut tambahan.
- **GPU:**
  - Atribut tambahan:
    - `vramGB` (int) → Kapasitas memori VRAM dalam GB.
    - `maxOverclock` (double) → Kecepatan maksimum overclock GPU.
  - Metode tambahan:
    - Getter dan setter untuk atribut tambahan.

### **RAM dan Storage (Subclass dari Komponen)**
- **RAM:**
  - Atribut tambahan:
    - `kapasitasGB` (int) → Kapasitas RAM dalam GB.
    - `ddr` (String) → Tipe DDR (DDR4/DDR5).
  - Metode tambahan:
    - Getter dan setter untuk atribut tambahan.
- **Storage:**
  - Atribut tambahan:
    - `kapasitasGB` (int) → Kapasitas penyimpanan dalam GB.
    - `tipeDrive` (String) → Jenis drive (HDD/SSD).
  - Metode tambahan:
    - Getter dan setter untuk atribut tambahan.

### **PSU (Subclass dari Komponen)**
- Atribut tambahan:
  - `watt` (int) → Daya PSU dalam watt.
  - `sertifikasi` (String) → Sertifikasi efisiensi PSU (80+ Gold, Platinum, dll.).
- Metode tambahan:
  - Getter dan setter untuk atribut tambahan.

### **Komputer (Komposisi dengan Komponen)**
- Atribut:
  - `nama` (String) → Nama komputer.
  - `cpu` (CPU) → Objek CPU.
  - `gpu` (GPU) → Objek GPU.
  - `ramList` (List<Ram>) → Daftar objek RAM.
  - `storageList` (List<Storage>) → Daftar objek penyimpanan.
  - `psu` (PSU) → Objek PSU.
- Metode:
  - `addRam(Ram newRam)` → Menambahkan RAM ke dalam daftar.
  - `removeRam(int index)` → Menghapus RAM berdasarkan indeks.
  - `addStorage(Storage newStorage)` → Menambahkan Storage ke dalam daftar.
  - `removeStorage(int index)` → Menghapus Storage berdasarkan indeks.
  - `changeCpu(Cpu newCpu)` → Mengganti CPU.
  - `changeGpu(Gpu newGpu)` → Mengganti GPU.
  - `changeRam(int index, Ram newRam)` → Mengganti RAM pada indeks tertentu.
  - `changeStorage(int index, Storage newStorage)` → Mengganti Storage pada indeks tertentu.
  - `changePsu(Psu newPsu)` → Mengganti PSU.
  - `tampilkanInfo()` → Menampilkan spesifikasi komputer.

### **Hubungan Antar Kelas**
1. **Inheritance (Pewarisan)**
   - CPU, GPU, RAM, Storage, dan PSU merupakan subclass dari Komponen.
   - CPU dan GPU memiliki tambahan fitur overclock.
2. **Composition (Komposisi)**
   - Komputer terdiri dari berbagai komponen sebagai bagian integralnya.
   - RAM dan Storage menggunakan List untuk menampung lebih dari satu komponen.
   - Jika Komputer dihapus, objek komponennya masih dapat digunakan di tempat lain.

## Cara Menjalankan Program

### C++
1. Pastikan compiler C++ (misalnya `g++`) telah terinstal.
2. Compile program:  
   ```sh
   g++ -o program main.cpp Cpu.cpp Gpu.cpp Ram.cpp Storage.cpp Psu.cpp Komputer.cpp
   ```
3. Jalankan program:  
   ```sh
   ./program
   ```

### Java
1. Pastikan Java Development Kit (JDK) telah terinstal.
2. Compile program:  
   ```sh
   javac *.java
   ```
3. Jalankan program:  
   ```sh
   java App
   ```

### Python
1. Pastikan Python telah terinstal.
2. Jalankan program:  
   ```sh
   python main.py
   ```

## Catatan
- Pastikan setiap file berada dalam satu folder yang sama agar program berjalan dengan benar.
- Jika terjadi error, periksa kembali dependensi dan pastikan semua file telah dikompilasi.

Selamat mencoba! 🚀

