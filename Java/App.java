import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Membuat objek awal
        Cpu cpu = new Cpu(8, 3.6, 5.0, "Intel", "Core i7-12700K");
        Gpu gpu = new Gpu(12, 2.3, 4.5, "NVIDIA", "RTX 3060");
        Psu psu = new Psu(750, "Gold", "Seasonic", "Focus Plus");

        // List RAM dan Storage
        ArrayList<Ram> ramList = new ArrayList<>();
        ramList.add(new Ram(16, "DDR5", "Corsair", "Vengeance"));

        ArrayList<Storage> storageList = new ArrayList<>();
        storageList.add(new Storage(1000, "SSD", "Samsung", "EVO"));

        // Membuat komputer dengan RAM & Storage sebagai list
        Komputer pc = new Komputer("PC Gaming", cpu, gpu, ramList, storageList, psu);

        System.out.println("\n== Spesifikasi Awal ==");
        pc.tampilkanInfo();

        // Menambahkan RAM
        Ram ram2 = new Ram(16, "DDR5", "G.Skill", "Trident Z");

        pc.addRam(ram2);
        pc.tampilkanInfo();

        // Menghapus RAM pertama

        pc.removeRam(0);
        pc.tampilkanInfo();

        // Mengganti CPU
        Cpu newCPU = new Cpu(10, 4.0, 5.5, "AMD", "Ryzen 9 5900X");

        pc.changeCpu(newCPU);
        pc.tampilkanInfo();

        // Mengganti GPU
        Gpu newGPU = new Gpu(16, 2.7, 5.0, "AMD", "RX 6800 XT");

        pc.changeGpu(newGPU);
        pc.tampilkanInfo();

        // Mengganti Storage
        Storage newStorage = new Storage(2000, "SSD", "Western Digital", "Black SN850");

        pc.changeStorage(0, newStorage);
        pc.tampilkanInfo();

        // Mengganti PSU
        Psu newPSU = new Psu(850, "Platinum", "Corsair", "RM850x");

        pc.changePsu(newPSU);
        pc.tampilkanInfo();
    }
}
