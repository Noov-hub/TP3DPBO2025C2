#include "Komputer.cpp"

int main() {
    // Membuat objek awal
    Cpu cpu(8, 3.6, 5.0, "Intel", "Core i7-12700K");
    Gpu gpu(12, 2.3, "NVIDIA", "RTX 3060");
    Ram ram1(16, "DDR5", "Corsair", "Vengeance");
    Storage storage1(1000, "SSD", "Samsung", "EVO");
    Psu psu(750, "Seasonic", "Focus Plus", "Gold");


    // Membuat komputer
    Komputer pc("PC Gaming", cpu, gpu, {ram1}, {storage1}, psu);
    pc.tampilkanInfo();

    // Menambahkan RAM
    Ram ram2(16, "DDR5", "G.Skill", "Trident Z");
    pc.addRAM(ram2);
    pc.tampilkanInfo();

    // Menghapus RAM pertama
    pc.removeRAM(0);
    pc.tampilkanInfo();

    // Mengganti CPU
    Cpu newCPU(10, 4.0, 5.5, "AMD", "Ryzen 9 5900X");
    pc.changeCPU(newCPU);
    pc.tampilkanInfo();

    // Mengganti GPU
    Gpu newGPU(16, 2.7, "AMD", "RX 6800 XT");
    pc.changeGPU(newGPU);
    pc.tampilkanInfo();

    // Mengganti Storage
    Storage newStorage(2000, "SSD", "Western Digital", "Black SN850");
    pc.changeStorage(0, newStorage);
    pc.tampilkanInfo();

    return 0;
}
