import java.util.ArrayList;

public class Komputer {
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

    public void addRam(Ram newRam) {
        ramList.add(newRam);
        System.out.println("RAM " + newRam.getNama() + " berhasil ditambahkan.");
    }

    public void removeRam(int index) {
        if (index >= 0 && index < ramList.size()) {
            System.out.println("RAM " + ramList.get(index).getNama() + " telah dilepas.");
            ramList.remove(index);
        } else {
            System.out.println("Index RAM tidak valid!");
        }
    }

    public void addStorage(Storage newStorage) {
        storageList.add(newStorage);
        System.out.println("Storage " + newStorage.getNama() + " berhasil ditambahkan.");
    }

    public void removeStorage(int index) {
        if (index >= 0 && index < storageList.size()) {
            System.out.println("Storage " + storageList.get(index).getNama() + " telah dilepas.");
            storageList.remove(index);
        } else {
            System.out.println("Index Storage tidak valid!");
        }
    }

    public void changeCpu(Cpu newCpu) {
        this.cpu = newCpu;
        System.out.println("CPU berhasil diganti menjadi " + newCpu.getNama() + ".");
    }

    public void changeGpu(Gpu newGpu) {
        this.gpu = newGpu;
        System.out.println("GPU berhasil diganti menjadi " + newGpu.getNama() + ".");
    }

    public void changeRam(int index, Ram newRam) {
        if (index >= 0 && index < ramList.size()) {
            System.out.println("RAM " + ramList.get(index).getNama() + " diganti dengan " + newRam.getNama() + ".");
            ramList.set(index, newRam);
        } else {
            System.out.println("Index RAM tidak valid!");
        }
    }

    public void changeStorage(int index, Storage newStorage) {
        if (index >= 0 && index < storageList.size()) {
            System.out.println("Storage " + storageList.get(index).getNama() + " diganti dengan " + newStorage.getNama() + ".");
            storageList.set(index, newStorage);
        } else {
            System.out.println("Index Storage tidak valid!");
        }
    }

    public void changePsu(Psu newPsu) {
        this.psu = newPsu;
        System.out.println("PSU berhasil diganti menjadi " + newPsu.getNama() + ".");
    }

    public void tampilkanInfo() {
        System.out.println("\n======= Spesifikasi " + nama + " =======");
        System.out.println("CPU     : " + cpu.getMerk() + " " + cpu.getNama() + " (" + cpu.getJumlahCore() + " Core, " + cpu.getKecepatanGHz() + " GHz, OC max " + cpu.getMaxOverclock() + " GHz)");
        System.out.println("GPU     : " + gpu.getMerk() + " " + gpu.getNama() + " (" + gpu.getVramGB() + " GB, OC max " + gpu.getMaxOverclock() + " GHz)");

        for (int i = 0; i < ramList.size(); i++)
            System.out.println("RAM " + (i + 1) + "   : " + ramList.get(i).getMerk() + " " + ramList.get(i).getNama() + " (" + ramList.get(i).getKapasitasGB() + " GB, " + ramList.get(i).getDdr() + ")");

        for (int i = 0; i < storageList.size(); i++)
            System.out.println("Storage " + (i + 1) + " : " + storageList.get(i).getTipeDrive() + " " + storageList.get(i).getMerk() + " " + storageList.get(i).getNama() + " (" + storageList.get(i).getKapasitasGB() + " GB)");

        System.out.println("PSU     : " + psu.getMerk() + " " + psu.getNama() + " " + psu.getSertifikasi() + " (" + psu.getWatt() + "W)");
    }
}
