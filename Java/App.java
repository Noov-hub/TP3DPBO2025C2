public class App {
    public static void main(String[] args) {
        // Membuat objek awal
        Cpu cpu = new Cpu(8, 3.6, 5.0, "Intel", "Core i7-12700K");
        Gpu gpu = new Gpu(12, 2.3, "NVIDIA", "RTX 3060");
        Ram ram1 = new Ram(16, "DDR5", "Corsair", "Vengeance");
        Storage storage1 = new Storage(1000, "SSD", "Samsung", "EVO");
        Psu psu = new Psu(750, "Gold", "Seasonic", "Focus Plus");

        // Membuat komputer
        Komputer pc = new Komputer("PC Gaming", cpu, gpu, psu);
        pc.addRAM(ram1);
        pc.addStorage(storage1);
        System.out.println("\n=== Spesifikasi Awal ===");
        pc.tampilkanInfo();

        // Menambahkan RAM
        System.out.println("\n=== Menambahkan RAM ===");
        Ram ram2 = new Ram(16, "DDR5", "G.Skill", "Trident Z");
        pc.addRAM(ram2);
        pc.tampilkanInfo();

        // Menghapus RAM pertama
        System.out.println("\n=== Menghapus RAM pertama ===");
        pc.removeRAM(0);
        pc.tampilkanInfo();

        // Mengganti CPU
        System.out.println("\n=== Mengganti CPU ===");
        Cpu newCPU = new Cpu(10, 4.0, 5.5, "AMD", "Ryzen 9 5900X");
        pc.changeCPU(newCPU);
        pc.tampilkanInfo();

        // Mengganti GPU
        System.out.println("\n=== Mengganti GPU ===");
        Gpu newGPU = new Gpu(16, 2.7, "AMD", "RX 6800 XT");
        pc.changeGPU(newGPU);
        pc.tampilkanInfo();

        // Mengganti Storage
        System.out.println("\n=== Mengganti Storage ===");
        Storage newStorage = new Storage(2000, "SSD", "Western Digital", "Black SN850");
        pc.changeStorage(0, newStorage);
        pc.tampilkanInfo();
    }
}
