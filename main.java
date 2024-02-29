package tes;

public class main {
    public static void main(String[] args) {
        // Membuat objek-objek yang diperlukan
        barang barang = new barang();
        member member = new member();
        transaksi transaksi = new transaksi();
        laporan laporan = new laporan();

        // Memanggil metode laporan dari kelas Laporan untuk melihat laporan barang
        laporan.laporan(barang);

        // Memanggil metode laporan dari kelas Laporan untuk melihat laporan member
        laporan.laporan(member);

        // Memanggil metode prosesTransaksi dari kelas Transaksi untuk melakukan transaksi
        transaksi.prosesTransaksi(member, transaksi, barang);

        // Memanggil metode laporan dari kelas Laporan untuk melihat laporan transaksi
        laporan.laporan(transaksi, barang);
    }
}


// public class Main {
//     public static void main(String[] args) {
//         // Buat objek dari kelas yang ingin Anda jalankan
//         Barang barang = new Barang();
//         Member member = new Member();
//         Transaksi transaksi = new Transaksi();

//         // Panggil metode untuk melakukan transaksi atau pembuatan laporan
//         Laporan laporan = new Laporan();
//         laporan.laporan(barang);
//         laporan.laporan(member);
//         laporan.laporan(transaksi, barang);
//     }
// }