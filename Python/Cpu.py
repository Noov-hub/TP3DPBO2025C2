from Komponen import Komponen
from OverclockLimit import OverclockLimit

class Cpu(Komponen, OverclockLimit):
    def __init__(self, jumlah_core, kecepatan_ghz, max_overclock, merk, nama):
        Komponen.__init__(self, merk, nama)  # Inisialisasi Komponen
        OverclockLimit.__init__(self, max_overclock)  # Inisialisasi OverclockLimit
        self._jumlah_core = jumlah_core
        self._kecepatan_ghz = kecepatan_ghz

    def get_jumlah_core(self):
        return self._jumlah_core

    def set_jumlah_core(self, jumlah_core):
        self._jumlah_core = jumlah_core

    def get_kecepatan_ghz(self):
        return self._kecepatan_ghz

    def set_kecepatan_ghz(self, kecepatan_ghz):
        self._kecepatan_ghz = kecepatan_ghz