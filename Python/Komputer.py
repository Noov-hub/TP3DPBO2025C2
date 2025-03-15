from Cpu import Cpu
from Gpu import Gpu
from Ram import Ram
from Storage import Storage
from Psu import Psu

class Komputer:
    def __init__(self, nama, cpu, gpu, ram_list, storage_list, psu):
        self._nama = nama
        self._cpu = cpu
        self._gpu = gpu
        self._ram_list = ram_list
        self._storage_list = storage_list
        self._psu = psu

    def add_ram(self, new_ram):
        self._ram_list.append(new_ram)

    def add_storage(self, new_storage):
        self._storage_list.append(new_storage)

    def remove_ram(self, index):
        if 0 <= index < len(self._ram_list):
            self._ram_list.pop(index)

    def remove_storage(self, index):
        if 0 <= index < len(self._storage_list):
            self._storage_list.pop(index)

    def change_cpu(self, new_cpu):
        self._cpu = new_cpu

    def change_gpu(self, new_gpu):
        self._gpu = new_gpu

    def change_ram(self, index, new_ram):
        if 0 <= index < len(self._ram_list):
            self._ram_list[index] = new_ram

    def change_storage(self, index, new_storage):
        if 0 <= index < len(self._storage_list):
            self._storage_list[index] = new_storage

    def change_psu(self, new_psu):
        self._psu = new_psu

    def tampilkan_info(self):
        print(f"\n======= Spesifikasi {self._nama} =======")
        print(f"CPU     : {self._cpu.get_merk()} {self._cpu.get_nama()} ({self._cpu.get_jumlah_core()} Core, {self._cpu.get_kecepatan_ghz()} GHz, OC max {self._cpu.get_max_overclock()} GHz)")
        print(f"GPU     : {self._gpu.get_merk()} {self._gpu.get_nama()} ({self._gpu.get_vram_gb()} GB, OC max {self._gpu.get_max_overclock()} GHz)")
        for i, ram in enumerate(self._ram_list, 1):
            print(f"RAM {i}   : {ram.get_merk()} {ram.get_nama()} ({ram.get_kapasitas_gb()} GB, {ram.get_ddr()})")
        for i, storage in enumerate(self._storage_list, 1):
            print(f"Storage {i} : {storage.get_tipe_drive()} {storage.get_merk()} {storage.get_nama()} ({storage.get_kapasitas_gb()} GB)")
        print(f"PSU     : {self._psu.get_merk()} {self._psu.get_nama()} {self._psu.get_sertifikasi()} ({self._psu.get_watt()}W)")
