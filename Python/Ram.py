from Komponen import Komponen

class Ram(Komponen):
    def __init__(self, kapasitas_gb, ddr, merk, nama):
        super().__init__(merk, nama)
        self._kapasitas_gb = kapasitas_gb
        self._ddr = ddr

    def get_kapasitas_gb(self):
        return self._kapasitas_gb

    def set_kapasitas_gb(self, kapasitas_gb):
        self._kapasitas_gb = kapasitas_gb

    def get_ddr(self):
        return self._ddr

    def set_ddr(self, ddr):
        self._ddr = ddr
