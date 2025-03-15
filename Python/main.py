from Cpu import Cpu
from Gpu import Gpu
from Ram import Ram
from Storage import Storage
from Psu import Psu
from Komputer import Komputer

def main():
    # Membuat objek awal
    cpu = Cpu(8, 3.6, 5.0, "Intel", "Core i7-12700K")
    gpu = Gpu(12, 2.3, "NVIDIA", "RTX 3060")
    ram1 = Ram(16, "DDR5", "Corsair", "Vengeance")
    storage1 = Storage(1000, "SSD", "Samsung", "EVO")
    psu = Psu(750, "Gold", "Seasonic", "Focus Plus")

    # Membuat komputer
    pc = Komputer("PC Gaming", cpu, gpu, [ram1], [storage1], psu)
    pc.tampilkan_info()
    
    # Menambahkan RAM
    print("\nTambah RAM")
    ram2 = Ram(16, "DDR5", "G.Skill", "Trident Z")
    pc.add_ram(ram2)
    pc.tampilkan_info()

    # Menghapus RAM pertama
    print("\nHapus RAM pertama")
    pc.remove_ram(0)
    pc.tampilkan_info()

    # Mengganti CPU
    print("\nGanti CPU")
    new_cpu = Cpu(10, 4.0, 5.5, "AMD", "Ryzen 9 5900X")
    pc.change_cpu(new_cpu)
    pc.tampilkan_info()

    # Mengganti GPU
    print("\nGanti GPU")
    new_gpu = Gpu(16, 2.7, "AMD", "RX 6800 XT")
    pc.change_gpu(new_gpu)
    pc.tampilkan_info()

    # Mengganti Storage
    print("\nGanti Storage")
    new_storage = Storage(2000, "SSD", "Western Digital", "Black SN850")
    pc.change_storage(0, new_storage)
    pc.tampilkan_info()

if __name__ == "__main__":
    main()
