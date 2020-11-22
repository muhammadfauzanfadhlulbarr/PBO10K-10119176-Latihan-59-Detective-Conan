/**
 * Latihan59
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Detective Conan
 */
public class PemeranPembantu extends Conan {
    private String status2;
    
    public PemeranPembantu(String status2, String nama, String peran, String keluarga, String penampilanPertama) {
        super(nama, peran, keluarga, penampilanPertama);
        this.status2 = status2;
    }

     public String getStatus2() {
        return status2;
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
