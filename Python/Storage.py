from Komponen import Komponen

class Storage(Komponen):
    def __init__(self, kapasitas_gb, tipe_drive, merk, nama):
        super().__init__(merk, nama)
        self._kapasitas_gb = kapasitas_gb
        self._tipe_drive = tipe_drive

    def get_kapasitas_gb(self):
        return self._kapasitas_gb

    def set_kapasitas_gb(self, kapasitas_gb):
        self._kapasitas_gb = kapasitas_gb

    def get_tipe_drive(self):
        return self._tipe_drive

    def set_tipe_drive(self, tipe_drive):
        self._tipe_drive = tipe_drive
