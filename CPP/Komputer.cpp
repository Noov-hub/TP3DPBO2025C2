#pragma once
#include <iostream>
#include <vector>
#include "Cpu.cpp"
#include "Gpu.cpp"
#include "Ram.cpp"
#include "Storage.cpp"
#include "Psu.cpp"

using namespace std;

class Komputer {
private:
    string nama;
    Cpu cpu;
    Gpu gpu;
    vector<Ram> ramList;
    vector<Storage> storageList;
    Psu psu;
public:
    Komputer() {}

    Komputer(string nama, Cpu cpu, Gpu gpu, vector<Ram> ramList, vector<Storage> storageList, Psu psu)
        : nama(nama), cpu(cpu), gpu(gpu), ramList(ramList), storageList(storageList), psu(psu) {}

    void addRAM(Ram newRam) {
        ramList.push_back(newRam);
        cout << "RAM " << newRam.getNama() << " berhasil ditambahkan.\n";
    }

    void addStorage(Storage newStorage) {
        storageList.push_back(newStorage);
        cout << "Storage " << newStorage.getNama() << " berhasil ditambahkan.\n";
    }

    void removeRAM(int index) {
        if (index >= 0 && index < ramList.size()) {
            cout << "RAM " << ramList[index].getNama() << " telah dilepas.\n";
            ramList.erase(ramList.begin() + index);
        } else {
            cout << "Index RAM tidak valid!\n";
        }
    }

    void removeStorage(int index) {
        if (index >= 0 && index < storageList.size()) {
            cout << "Storage " << storageList[index].getNama() << " telah dilepas.\n";
            storageList.erase(storageList.begin() + index);
        } else {
            cout << "Index Storage tidak valid!\n";
        }
    }

    void changeCPU(Cpu newCPU) {
        cpu = newCPU;
        cout << "CPU berhasil diganti menjadi " << newCPU.getNama() << ".\n";
    }

    void changeGPU(Gpu newGPU) {
        gpu = newGPU;
        cout << "GPU berhasil diganti menjadi " << newGPU.getNama() << ".\n";
    }

    void changeRAM(int index, Ram newRAM) {
        if (index >= 0 && index < ramList.size()) {
            cout << "RAM " << ramList[index].getNama() << " diganti dengan " << newRAM.getNama() << ".\n";
            ramList[index] = newRAM;
        } else {
            cout << "Index RAM tidak valid!\n";
        }
    }

    void changeStorage(int index, Storage newStorage) {
        if (index >= 0 && index < storageList.size()) {
            cout << "Storage " << storageList[index].getNama() << " diganti dengan " << newStorage.getNama() << ".\n";
            storageList[index] = newStorage;
        } else {
            cout << "Index Storage tidak valid!\n";
        }
    }

    void changePSU(Psu newPSU) {
        psu = newPSU;
        cout << "PSU berhasil diganti menjadi " << newPSU.getNama() << ".\n";
    }

    void tampilkanInfo() {
        cout << "\n======= Spesifikasi " << nama << " =======\n";
        cout << "CPU     : " << cpu.getMerk() << " " << cpu.getNama() << " (" << cpu.getJumlahCore() << " Core, " << cpu.getKecepatanGHz() << " GHz, OC max " << cpu.getMaxOverclock() << " GHz)\n";
        cout << "GPU     : " << gpu.getMerk() << " " << gpu.getNama() << " (" << gpu.getVramGB() << " GB, OC max " << gpu.getMaxOverclock() << " GHz)\n";

        for (size_t i = 0; i < ramList.size(); i++)
            cout << "RAM " << i+1 << "   : " << ramList[i].getMerk() << " " << ramList[i].getNama() << " (" << ramList[i].getKapasitasGB() << " GB, " << ramList[i].getDdr() << ")\n";

        for (size_t i = 0; i < storageList.size(); i++)
            cout << "Storage " << i+1 << " : " << storageList[i].getTipeDrive() << " " << storageList[i].getMerk() << " " << storageList[i].getNama() << " (" << storageList[i].getKapasitasGB() << " GB)\n";

        cout << "PSU     : " << psu.getMerk() << " " << psu.getNama() << " " << psu.getSertifikasi() << " (" << psu.getWatt() << "W)" << "\n";
    }

    ~Komputer() {}
};
