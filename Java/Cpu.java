public class Cpu {
    private int jumlahCore;
    private double kecepatanGHz;
    private double maxOverclock;
    private String merk;
    private String nama;

    public Cpu(int jumlahCore, double kecepatanGHz, double maxOverclock, String merk, String nama) {
        this.jumlahCore = jumlahCore;
        this.kecepatanGHz = kecepatanGHz;
        this.maxOverclock = maxOverclock;
        this.merk = merk;
        this.nama = nama;
    }

    public int getJumlahCore() { return jumlahCore; }
    public double getKecepatanGHz() { return kecepatanGHz; }
    public double getMaxOverclock() { return maxOverclock; }
    public String getMerk() { return merk; }
    public String getNama() { return nama; }
}
