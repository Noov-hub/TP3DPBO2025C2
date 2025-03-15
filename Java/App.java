// Kelas utama untuk mengelola aplikasi Classnya

import java.util.ArrayList;
import java.util.Scanner;

// Kelas Overclock (Super Class untuk CPU & GPU)
class Overclock {
    protected double maxOverclock;

    public Overclock(double maxOverclock) {
        this.maxOverclock = maxOverclock;
    }

    public double getMaxOverclock() {
        return maxOverclock;
    }
}

// Kelas CPU
class Cpu extends Overclock {
    private int jumlahCore;
    private double kecepatanGHz;
    private String merk, nama;

    public Cpu(int jumlahCore, double kecepatanGHz, double maxOverclock, String merk, String nama) {
        super(maxOverclock);
        this.jumlahCore = jumlahCore;
        this.kecepatanGHz = kecepatanGHz;
        this.merk = merk;
        this.nama = nama;
    }

    public int getJumlahCore() { return jumlahCore; }
    public double getKecepatanGHz() { return kecepatanGHz; }
    public String getMerk() { return merk; }
    public String getNama() { return nama; }
}

// Kelas GPU
class Gpu extends Overclock {
    private int vramGB;
    private String merk, nama;

    public Gpu(int vramGB, double maxOverclock, String merk, String nama) {
        super(maxOverclock);
        this.vramGB = vramGB;
        this.merk = merk;
        this.nama = nama;
    }

    public int getVramGB() { return vramGB; }
    public String getMerk() { return merk; }
    public String getNama() { return nama; }
}

// Kelas RAM
class Ram {
    private int kapasitasGB;
    private String ddr, merk, nama;

    public Ram(int kapasitasGB, String ddr, String merk, String nama) {
        this.kapasitasGB = kapasitasGB;
        this.ddr = ddr;
        this.merk = merk;
        this.nama = nama;
    }

    public int getKapasitasGB() { return kapasitasGB; }
    public String getDdr() { return ddr; }
    public String getMerk() { return merk; }
    public String getNama() { return nama; }
}

// Kelas Storage
class Storage {
    private int kapasitasGB;
    private String tipeDrive, merk, nama;

    public Storage(int kapasitasGB, String tipeDrive, String merk, String nama) {
        this.kapasitasGB = kapasitasGB;
        this.tipeDrive = tipeDrive;
        this.merk = merk;
        this.nama = nama;
    }

    public int getKapasitasGB() { return kapasitasGB; }
    public String getTipeDrive() { return tipeDrive; }
    public String getMerk() { return merk; }
    public String getNama() { return nama; }
}

// Kelas PSU
class Psu {
    private int watt;
    private String sertifikasi, merk, nama;

    public Psu(int watt, String sertifikasi, String merk, String nama) {
        this.watt = watt;
        this.sertifikasi = sertifikasi;
        this.merk = merk;
        this.nama = nama;
    }

    public int getWatt() { return watt; }
    public String getSertifikasi() { return sertifikasi; }
    public String getMerk() { return merk; }
    public String getNama() { return nama; }
}

// Kelas Komputer

class Komputer {
    private String nama;
    private Cpu cpu;
    private Gpu gpu;
    private ArrayList<Ram> ramList;
    private ArrayList<Storage> storageList;
    private Psu psu;

    public Komputer(String nama, Cpu cpu, Gpu gpu, ArrayList<Ram> ramList, ArrayList<Storage> storageList, Psu psu) {
        this.nama = nama;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ramList = ramList;
        this.storageList = storageList;
        this.psu = psu;
    }

    public void addRAM(Ram newRam) {
        ramList.add(newRam);
        System.out.println("RAM " + newRam.getNama() + " berhasil ditambahkan.");
    }

    public void addStorage(Storage newStorage) {
        storageList.add(newStorage);
        System.out.println("Storage " + newStorage.getNama() + " berhasil ditambahkan.");
    }

    public void removeRAM(int index) {
        if (index >= 0 && index < ramList.size()) {
            System.out.println("RAM " + ramList.get(index).getNama() + " telah dilepas.");
            ramList.remove(index);
        } else {
            System.out.println("Index RAM tidak valid!");
        }
    }

    public void removeStorage(int index) {
        if (index >= 0 && index < storageList.size()) {
            System.out.println("Storage " + storageList.get(index).getNama() + " telah dilepas.");
            storageList.remove(index);
        } else {
            System.out.println("Index Storage tidak valid!");
        }
    }

    public void changeCPU(Cpu newCPU) {
        cpu = newCPU;
        System.out.println("CPU berhasil diganti menjadi " + newCPU.getNama() + ".");
    }

    public void changeGPU(Gpu newGPU) {
        gpu = newGPU;
        System.out.println("GPU berhasil diganti menjadi " + newGPU.getNama() + ".");
    }

    public void tampilkanInfo() {
        System.out.println("\n======= Spesifikasi " + nama + " =======");
        System.out.println("CPU     : " + cpu.getMerk() + " " + cpu.getNama() + " (" + cpu.getJumlahCore() + " Core, " + cpu.getKecepatanGHz() + " GHz, OC max " + cpu.getMaxOverclock() + " GHz)");
        System.out.println("GPU     : " + gpu.getMerk() + " " + gpu.getNama() + " (" + gpu.getVramGB() + " GB, OC max " + gpu.getMaxOverclock() + " GHz)");

        for (int i = 0; i < ramList.size(); i++)
            System.out.println("RAM " + (i+1) + "   : " + ramList.get(i).getMerk() + " " + ramList.get(i).getNama() + " (" + ramList.get(i).getKapasitasGB() + " GB, " + ramList.get(i).getDdr() + ")");
    }
}

// Main Program

class Main {
    public static void main(String[] args) {
        Komputer pc = new Komputer("PC Gaming", 
            new Cpu(8, 3.6, 5.0, "Intel", "Core i7-12700K"), 
            new Gpu(12, 2.3, "NVIDIA", "RTX 3060"), 
            new ArrayList<>(Arrays.asList(new Ram(16, "DDR5", "Corsair", "Vengeance"))), 
            new ArrayList<>(Arrays.asList(new Storage(1000, "SSD", "Samsung", "EVO"))), 
            new Psu(750, "Gold", "Seasonic", "Focus Plus"));

        pc.tampilkanInfo();
    }
}
