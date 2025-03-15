public class Gpu {
    private int vramGB;
    private double maxOverclock;
    private String merk;
    private String nama;

    public Gpu(int vramGB, double maxOverclock, String merk, String nama) {
        this.vramGB = vramGB;
        this.maxOverclock = maxOverclock;
        this.merk = merk;
        this.nama = nama;
    }

    public int getVramGB() { return vramGB; }
    public double getMaxOverclock() { return maxOverclock; }
    public String getMerk() { return merk; }
    public String getNama() { return nama; }
}
