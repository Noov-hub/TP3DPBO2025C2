from Komponen import Komponen

class Psu(Komponen):
    def __init__(self, watt, sertifikasi, merk, nama):
        super().__init__(merk, nama)
        self._watt = watt
        self._sertifikasi = sertifikasi

    def get_watt(self):
        return self._watt

    def set_watt(self, watt):
        self._watt = watt

    def get_sertifikasi(self):
        return self._sertifikasi

    def set_sertifikasi(self, sertifikasi):
        self._sertifikasi = sertifikasi
