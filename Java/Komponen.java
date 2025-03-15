public class Komponen {
    protected String merk;
    protected String nama;

    public Komponen(String merk, String nama) {
        this.merk = merk;
        this.nama = nama;
    }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
}
