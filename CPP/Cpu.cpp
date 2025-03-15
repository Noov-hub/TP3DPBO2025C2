#pragma once
#include <iostream>
#include "Komponen.cpp"
#include "OverclockLimit.cpp"

using namespace std;

class Cpu : public Komponen {
private:
    int jumlahCore;
    float kecepatanGHz;
    OverclockLimit ocLimit;
public:
    Cpu() {}

    Cpu(int jumlahCore, float kecepatanGHz, float maxOC, string merk, string nama)
        : Komponen(merk, nama), ocLimit(maxOC) {
        this->jumlahCore = jumlahCore;
        this->kecepatanGHz = kecepatanGHz;
    }

    void setJumlahCore(int jumlahCore) { this->jumlahCore = jumlahCore; }
    void setKecepatanGHz(float kecepatanGHz) { this->kecepatanGHz = kecepatanGHz; }

    int getJumlahCore() { return jumlahCore; }
    float getKecepatanGHz() { return kecepatanGHz; }
    float getMaxOverclock() { return ocLimit.getMaxGHz(); }

    ~Cpu() {}
};
