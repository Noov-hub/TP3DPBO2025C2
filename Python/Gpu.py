from Komponen import Komponen

class Gpu(Komponen):
    def __init__(self, vram_gb, max_overclock, merk, nama):
        super().__init__(merk, nama)
        self._vram_gb = vram_gb
        self._max_overclock = max_overclock

    def get_vram_gb(self):
        return self._vram_gb

    def set_vram_gb(self, vram_gb):
        self._vram_gb = vram_gb

    def get_max_overclock(self):
        return self._max_overclock

    def set_max_overclock(self, max_overclock):
        self._max_overclock = max_overclock
