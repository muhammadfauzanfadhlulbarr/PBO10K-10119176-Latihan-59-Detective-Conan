/**
 * Latihan59
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Detective Conan
 */
public class Conan {
    protected String nama;
    protected String peran;
    protected String keluarga;
    protected String penampilanPertama;

    public Conan(String nama, String peran, String keluarga, String penampilanPertama) {
    this.nama = nama;
    this.peran = peran;
    this.keluarga = keluarga;
    this.penampilanPertama = penampilanPertama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    public String getKeluarga() {
        return keluarga;
    }

    public void setKeluarga(String keluarga) {
        this.keluarga = keluarga;
    }

    public String getPenampilanPertama() {
        return penampilanPertama;
    }

    public void setPenampilanPertama(String penampilanPertama) {
        this.penampilanPertama = penampilanPertama;
    }
    
}