#pragma once
#include <iostream>
#include "Komponen.cpp"

using namespace std;

class Psu : public Komponen {
private:
    int watt;
    string sertifikasi;
public:
    Psu() {}

    Psu(int watt, string sertifikasi, string merk, string nama)
        : Komponen(merk, nama) {
        this->watt = watt;
        this->sertifikasi = sertifikasi;
    }

    void setWatt(int watt) { this->watt = watt; }
    void setSertifikasi(int sertifikasi) { this->sertifikasi = sertifikasi; }
    
    int getWatt() { return watt; }
    string getSertifikasi() { return sertifikasi; }

    ~Psu() {}
};
