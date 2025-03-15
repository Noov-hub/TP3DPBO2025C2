public class Psu {
    private int watt;
    private String sertifikasi;
    private String merk;
    private String nama;

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
