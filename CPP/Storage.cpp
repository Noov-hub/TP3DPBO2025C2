#pragma once
#include <iostream>
#include "Komponen.cpp"

using namespace std;

class Storage : public Komponen {
private:
    int kapasitasGB;
    string tipeDrive;
public:
    Storage() {}

    Storage(int kapasitasGB, string tipeDrive, string merk, string nama)
        : Komponen(merk, nama) {
        this->kapasitasGB = kapasitasGB;
        this->tipeDrive = tipeDrive;
    }

    void setKapasitasGB(int kapasitasGB) { this->kapasitasGB = kapasitasGB; }
    int getKapasitasGB() { return kapasitasGB; }
    string getTipeDrive() { return tipeDrive; }

    ~Storage() {}
};
