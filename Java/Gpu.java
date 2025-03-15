public class Gpu extends Komponen {
    private int vramGB;
    private double kecepatanClock;
    private OverclockLimit overclockLimit;

    public Gpu(int vramGB, double kecepatanClock, double maxOverclock, String merk, String nama) {
        super(merk, nama);
        this.vramGB = vramGB;
        this.kecepatanClock = kecepatanClock;
        this.overclockLimit = new OverclockLimit(maxOverclock);
    }

    public int getVramGB() { return vramGB; }
    public double getKecepatanClock() { return kecepatanClock; }
    public double getMaxOverclock() { return overclockLimit.getMaxOverclock(); }

    public void setKecepatanClock(double kecepatanClock) { this.kecepatanClock = kecepatanClock; }
    public void setMaxOverclock(double maxOverclock) { this.overclockLimit.setMaxOverclock(maxOverclock); }
}
