from Komponen import Komponen

class Cpu(Komponen):
    def __init__(self, jumlah_core, kecepatan_ghz, max_overclock, merk, nama):
        super().__init__(merk, nama)
        self._jumlah_core = jumlah_core
        self._kecepatan_ghz = kecepatan_ghz
        self._max_overclock = max_overclock

    def get_jumlah_core(self):
        return self._jumlah_core

    def set_jumlah_core(self, jumlah_core):
        self._jumlah_core = jumlah_core

    def get_kecepatan_ghz(self):
        return self._kecepatan_ghz

    def set_kecepatan_ghz(self, kecepatan_ghz):
        self._kecepatan_ghz = kecepatan_ghz
    
    def get_max_overclock(self):
        return self._max_overclock
    
    def set_max_overclock(self, max_overclock):
        self._max_overclock = max_overclock
