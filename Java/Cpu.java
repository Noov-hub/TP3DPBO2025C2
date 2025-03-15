public class Cpu extends Komponen {
    private int jumlahCore;
    private double kecepatanGHz;
    private OverclockLimit overclockLimit;

    public Cpu(int jumlahCore, double kecepatanGHz, double maxOverclock, String merk, String nama) {
        super(merk, nama);
        this.jumlahCore = jumlahCore;
        this.kecepatanGHz = kecepatanGHz;
        this.overclockLimit = new OverclockLimit(maxOverclock);
    }

    public int getJumlahCore() { return jumlahCore; }
    public double getKecepatanGHz() { return kecepatanGHz; }
    public double getMaxOverclock() { return overclockLimit.getMaxOverclock(); }

    public void setKecepatanGHz(double kecepatanGHz) { this.kecepatanGHz = kecepatanGHz; }
    public void setMaxOverclock(double maxOverclock) { this.overclockLimit.setMaxOverclock(maxOverclock); }
}
