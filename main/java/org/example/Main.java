import java.util.Scanner;

class Mahasiswa {
    static String universitas = "Universitas Muhammadiyah Malang";
    String nama;
    String nim;
    String jurusan;

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    static void tampilUniversitas() {
        System.out.println(universitas);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] data_mahasiswa = new Mahasiswa[100];
        Mahasiswa.tampilUniversitas();

        int jumlah_mahasiswa = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.println("\nMasukkan data mahasiswa ke-" + (jumlah_mahasiswa + 1));
                System.out.print("Nama: ");
                String nama = scanner.next();
                System.out.print("NIM: ");
                String nim = scanner.next();
                while (nim.length() != 15) {
                    System.out.println("Panjang NIM harus 15 angka. Silakan coba lagi.");
                    System.out.print("NIM: ");
                    nim = scanner.next();
                }
                System.out.print("Jurusan: ");
                String jurusan = scanner.nextLine();

                data_mahasiswa[jumlah_mahasiswa] = new Mahasiswa(nama, nim, jurusan);
                jumlah_mahasiswa++;
            } else if (pilihan == 2) {
                System.out.println("\nDaftar Mahasiswa:");
                for (int i = 0; i < jumlah_mahasiswa; i++) {
                    System.out.println("\nData Mahasiswa ke-" + (i + 1) + ":");
                    data_mahasiswa[i].tampilDataMahasiswa();
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}