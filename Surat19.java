public class Surat19 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat19() {

    }

    public Surat19(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void tampil(){
        System.out.println("ID Surat        : " + idSurat);
        System.out.println("Nama            : " + namaMahasiswa);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Jenis Izin      : " + jenisIzin);
        System.out.println("Durasi (hari)   : " + durasi);
    }
}