package PROYEK_AKHIR;

public class Pelanggan {
    protected String nama;
    protected int nik;
    protected String alamat;
    protected String nope;      
    
    public Pelanggan (String nama, int nik, String alamat, String nope){
        
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.nope = nope;
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNope() {
        return nope;
    }

    public void setNope(String nope) {
        this.nope = nope;
    }


}
