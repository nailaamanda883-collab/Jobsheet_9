import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        StackSurat19 stack = new StackSurat19(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== MENU SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat (berdasarkan nama)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat        : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas           : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari)   : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat19 s = new Surat19(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    Surat19 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir:");
                        terakhir.tampil();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();

                    if (stack.cari(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    break;

                case 5:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);
    }
}