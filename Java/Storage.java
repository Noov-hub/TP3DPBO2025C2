public class Storage {
    private int kapasitasGB;
    private String tipeDrive;
    private String merk;
    private String nama;

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
