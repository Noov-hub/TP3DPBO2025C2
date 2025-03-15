#pragma once
#include <iostream>
#include "Komponen.cpp"

using namespace std;

class Ram : public Komponen {
private:
    int kapasitasGB;
    string ddr;
public:
    Ram() {}

    Ram(int kapasitasGB, string ddr, string merk, string nama)
        : Komponen(merk, nama) {
        this->kapasitasGB = kapasitasGB;
        this->ddr = ddr;
    }

    void setKapasitasGB(int kapasitasGB) { this->kapasitasGB = kapasitasGB; }
    int getKapasitasGB() { return kapasitasGB; }
    string getDdr() { return ddr; }

    ~Ram() {}
};
