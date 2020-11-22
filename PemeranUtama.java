/**
 * Latihan59
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Detective Conan
 */
public class PemeranUtama extends Conan {
    protected String status;

    public PemeranUtama(String status, String nama, String peran, String keluarga, String penampilanPertama) {
        super(nama, peran, keluarga, penampilanPertama);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }

    public String getKeluarga() {
        return keluarga;
    }

    public String getPenampilanPertama() {
        return penampilanPertama;
    }
}
