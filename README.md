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
### Diagram OOP
![image](https://github.com/user-attachments/assets/ebad4478-9d35-48a3-85a0-dca9cff1aaa5)
### **Komponen (Superclass / Parent Class)**
- Atribut:
  - `merk` (String) → Merek komponen
  - `nama` (String) → Nama model komponen
- Metode:
  - Getter dan setter untuk atribut di atas.
  - `displayInfo()` → Menampilkan informasi komponen.

### **OverclockLimit (Superclass tambahan untuk CPU & GPU)**
- Atribut:
  - `maxOverclock` (double) → Kecepatan maksimum overclock.
- Metode:
  - Getter dan setter untuk `maxOverclock`.

### **CPU dan GPU (Subclass dari Komponen dan OverclockLimit)**
- **CPU:**
  - Atribut tambahan:
    - `jumlahCore` (int) → Jumlah core CPU.
    - `kecepatanGHz` (double) → Kecepatan dasar dalam GHz.
  - Metode tambahan:
    - Getter dan setter untuk atribut tambahan.
- **GPU:**
  - Atribut tambahan:
    - `vramGB` (int) → Kapasitas memori VRAM dalam GB.
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
   - CPU dan GPU merupakan subclass dari Komponen dan OverclockLimit (multiple inheritance).
   - RAM, Storage, dan PSU merupakan subclass dari Komponen.
2. **Multiple Inheritance**
   - CPU dan GPU memiliki 2 parent yaitu kelas Overclock dan Komponen
3. **Composition (Komposisi)**
   - Komputer terdiri dari berbagai komponen sebagai bagian integralnya.
   - RAM dan Storage menggunakan List untuk menampung lebih dari satu komponen.
   - Jika Komputer dihapus, objek komponennya masih dapat digunakan di tempat lain.

### Dokum CPP
![Screenshot 2025-03-16 105946](https://github.com/user-attachments/assets/8597ef50-52db-4194-86a0-2b9b95c257b1)

### Dokum Python
![Screenshot 2025-03-16 103748](https://github.com/user-attachments/assets/520b2209-2f35-436d-ae19-7168221ffb2d)

### Dokum java
![Screenshot 2025-03-16 103946](https://github.com/user-attachments/assets/ba577ddc-28a8-42ab-a4ef-9814a3c961a8)

