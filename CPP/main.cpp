#include <iostream>
#include <vector>
using namespace std;

// Kelas Komponen sebagai superclass
class Komponen {
protected:
    string Nama;
    string Merk;
public:
    Komponen(string nama, string merk) : Nama(nama), Merk(merk) {}
    virtual void tampilkanInfo() {
        cout << "Nama: " << Nama << ", Merk: " << Merk << endl;
    }
};

// Kelas Overclockable untuk multiple inheritance
class Overclockable {
protected:
    float OverclockLimit;
public:
    Overclockable(float limit) : OverclockLimit(limit) {}
    void tampilkanOverclockInfo() {
        cout << "Overclock Limit: " << OverclockLimit << " GHz" << endl;
    }
};

// Kelas Processor mewarisi Komponen dan Overclockable
class Processor : public Komponen, public Overclockable {
private:
    float ClockSpeed;
    float MaxTDP;
public:
    Processor(string nama, string merk, float clock, float tdp, float limit)
        : Komponen(nama, merk), Overclockable(limit), ClockSpeed(clock), MaxTDP(tdp) {}

    void tampilkanInfo() override {
        Komponen::tampilkanInfo();
        cout << "Clock Speed: " << ClockSpeed << " GHz, Max TDP: " << MaxTDP << "W" << endl;
        tampilkanOverclockInfo();
    }
};

// Kelas Graphic mewarisi Komponen dan Overclockable
class Graphic : public Komponen, public Overclockable {
private:
    float VramGB;
    float MaxTDP;
public:
    Graphic(string nama, string merk, float vram, float tdp, float limit)
        : Komponen(nama, merk), Overclockable(limit), VramGB(vram), MaxTDP(tdp) {}

    void tampilkanInfo() override {
        Komponen::tampilkanInfo();
        cout << "VRAM: " << VramGB << " GB, Max TDP: " << MaxTDP << "W" << endl;
        tampilkanOverclockInfo();
    }
};

// Main Program
int main() {
    Processor cpu("Intel i9", "Intel", 3.5, 125, 5.2);
    Graphic gpu("RTX 4080", "NVIDIA", 16, 320, 2.8);

    cout << "=== Info Processor ===" << endl;
    cpu.tampilkanInfo();
    cout << "\n=== Info GPU ===" << endl;
    gpu.tampilkanInfo();

    return 0;
}
