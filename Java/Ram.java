public class Ram {
    private int kapasitasGB;
    private String ddr;
    private String merk;
    private String nama;

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
