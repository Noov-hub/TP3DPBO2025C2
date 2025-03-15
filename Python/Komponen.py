class Komponen:
    def __init__(self, merk, nama):
        self._merk = merk
        self._nama = nama

    def get_merk(self):
        return self._merk

    def set_merk(self, merk):
        self._merk = merk

    def get_nama(self):
        return self._nama

    def set_nama(self, nama):
        self._nama = nama
