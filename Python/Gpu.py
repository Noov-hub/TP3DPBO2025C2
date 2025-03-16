from Komponen import Komponen
from OverclockLimit import OverclockLimit

class Gpu(Komponen, OverclockLimit):
    def __init__(self, vram_gb, max_overclock, merk, nama):
        Komponen.__init__(self, merk, nama)  # Inisialisasi Komponen
        OverclockLimit.__init__(self, max_overclock)  # Inisialisasi OverclockLimit
        self._vram_gb = vram_gb

    def get_vram_gb(self):
        return self._vram_gb

    def set_vram_gb(self, vram_gb):
        self._vram_gb = vram_gb