// Kelas utama untuk mengelola aplikasi Classnya
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Classnya> dataClassnya = new ArrayList<>(); // Menyimpan daftar produk

    // Menampilkan seluruh data produk yang ada di Classnya
    public static void showData() {
        if (dataClassnya.isEmpty()) {
            System.out.println("Data masih kosong. Silahkan isi.");
            return;
        }
        for (Classnya pet : dataClassnya) {
            System.out.println("+----------------------------------+");
            System.out.println("ID             : " + pet.getID());
            System.out.println("Nama Produk    : " + pet.getNamaProduk());
            System.out.println("Kategori       : " + pet.getKategori());
            System.out.println("Harga          : " + pet.getHarga());
            System.out.println("+----------------------------------+");
        }
    }

    // Menambahkan data produk baru ke dalam daftar
    public static void addData() {
        System.out.print("ID: ");
        String ID = scanner.next();
        
        // Cek apakah ID sudah ada di dalam daftar
        for (Classnya pet : dataClassnya) {
            if (pet.getID().equals(ID)) {
                System.out.println("ID sudah digunakan!");
                return;
            }
        }
        
        System.out.print("Nama: ");
        String namaProduk = scanner.next();
        System.out.print("Kategori: ");
        String kategori = scanner.next();
        System.out.print("Harga: ");
        int harga = scanner.nextInt();

        // Buat objek baru dan tambahkan ke daftar
        Classnya pet = new Classnya();
        pet.setData(ID, namaProduk, kategori, harga);
        dataClassnya.add(pet);
        System.out.println("Data berhasil ditambahkan!");
    }

    // Mengubah data produk berdasarkan ID
    public static void changeData() {
        System.out.print("Masukkan ID data yang ingin diubah: ");
        String ID = scanner.next();
        
        for (Classnya pet : dataClassnya) {
            if (pet.getID().equals(ID)) {
                System.out.print("Nama baru: ");
                String namaProduk = scanner.next();
                System.out.print("Kategori baru: ");
                String kategori = scanner.next();
                System.out.print("Harga baru: ");
                int harga = scanner.nextInt();
                pet.setData(ID, namaProduk, kategori, harga);
                System.out.println("Data berhasil diubah!");
                return;
            }
        }
        System.out.println("Produk dengan ID " + ID + " tidak ditemukan!");
    }

    // Menghapus data produk berdasarkan ID
    public static void deleteData() {
        System.out.print("Masukkan ID data yang ingin dihapus: ");
        String ID = scanner.next();
        
        for (int i = 0; i < dataClassnya.size(); i++) {
            if (dataClassnya.get(i).getID().equals(ID)) {
                dataClassnya.remove(i);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }
        System.out.println("Produk dengan ID " + ID + " tidak ditemukan!");
    }

    // Mencari dan menampilkan data produk berdasarkan ID
    public static void searchData() {
        System.out.print("Masukkan ID data yang ingin dicari: ");
        String ID = scanner.next();
        
        for (Classnya pet : dataClassnya) {
            if (pet.getID().equals(ID)) {
                System.out.println("+----------------------------------+");
                System.out.println("ID             : " + pet.getID());
                System.out.println("Nama Produk    : " + pet.getNamaProduk());
                
                System.out.println("Kategori       : " + pet.getKategori());
                System.out.println("Harga          : " + pet.getHarga());
                System.out.println("+----------------------------------+");
                return;
            }
        }
        System.out.println("Produk dengan ID " + ID + " tidak ditemukan!");
    }

    // Metode utama yang menampilkan menu dan menangani input pengguna
    public static void main(String[] args) {
        int pilihan;
        System.out.println("Welcome To Noov Classnya");
        
        do {
            System.out.println("1 | Show\n2 | Add\n3 | Change\n4 | Delete\n5 | Search\n0 | Exit");
            System.out.print("Pilih Menu: ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1: showData(); break;
                case 2: addData(); break;
                case 3: changeData(); break;
                case 4: deleteData(); break;
                case 5: searchData(); break;
                case 0: System.out.println("Thank You!"); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        scanner.close(); // Menutup scanner untuk menghindari kebocoran sumber daya
    }
}
