#include <iostream>
#include <string>
#include "Classnya.cpp"

using namespace std;


int main() {
    int n;
    cout << "Welcome To Noov Petshop\n";
    cout << "Infokan berapa Data yang ingin dimasukkan banh: "; cin >> n;
    Classnya arraynya[n];
    int pilihan, data = 0;

    do {
        cout << "1 | Show\n2 | Add\n3 | Change\n4 | Delete\n5 | Search\n0 | Exit\n";
        cout << "Pilih Menu: "; cin >> pilihan;
        // switch (pilihan) {
        //     case 1: showData(DataPetshop, n); break;
        //     case 2: addData(DataPetshop, data, n); break;
        //     case 3: changeData(DataPetshop, data); break;
        //     case 4: deleteData(DataPetshop, data); break;
        //     case 5: searchData(DataPetshop, data); break;
        //     case 0: cout << "Thank You!\n"; break;
        //     default: cout << "Pilihan tidak valid!\n";
        // }
    } while (pilihan != 0);
    return 0;
}
