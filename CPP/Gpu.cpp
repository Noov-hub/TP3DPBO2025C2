#pragma once
#include <iostream>
#include "Komponen.cpp"
#include "OverclockLimit.cpp"

using namespace std;

class Gpu : public Komponen {
private:
    int vramGB;
    OverclockLimit ocLimit;
public:
    Gpu() {}

    Gpu(int vramGB, float maxOC, string merk, string nama)
        : Komponen(merk, nama), ocLimit(maxOC) {
        this->vramGB = vramGB;
    }

    void setVramGB(int vramGB) { this->vramGB = vramGB; }
    int getVramGB() { return vramGB; }
    float getMaxOverclock() { return ocLimit.getMaxGHz(); }

    ~Gpu() {}
};
