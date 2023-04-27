package PROYEK_AKHIR;

public class Peminjaman extends Kendaraan{
    protected String nama;
    protected int nik;
    protected String alamat;
    protected String nomorhp;
    protected String merek;
    protected String tipe;
    protected String warna;
    protected String plat;
    protected String tanggal_pinjam;
    protected String tanggal_balik;
    protected int jumlah_hari;
    protected int jumlah_harga;

    Peminjaman (String nama, int nik, String alamat, String nomorhp, String merek, String tipe, String warna, String plat, String tanggal_pinjam, String tanggal_balik, int jumlah_hari, int jumlah_harga){        
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.nomorhp = nomorhp;
        this.merek = merek;
        this.tipe = tipe;
        this.warna = warna;
        this.plat = plat;
        this.tanggal_pinjam = tanggal_pinjam;
        this.tanggal_balik = tanggal_balik;
        this.jumlah_hari = jumlah_hari;
        this.jumlah_harga = jumlah_harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public void setTanggal_pinjam(String tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }

    public String getTanggal_balik() {
        return tanggal_balik;
    }

    public void setTanggal_balik(String tanggal_balik) {
        this.tanggal_balik = tanggal_balik;
    }

    public int getJumlah_hari() {
        return jumlah_hari;
    }

    public void setJumlah_hari(int jumlah_hari) {
        this.jumlah_hari = jumlah_hari;
    }

    public int getJumlah_harga() {
        return jumlah_harga;
    }

    public void setJumlah_harga(int jumlah_harga) {
        this.jumlah_harga = jumlah_harga;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }
            
}
//Penggunaan Overriding
class notifikasi{
    public void notif(){
        System.out.println("Data Ditambahkan");
    }        
}


class notifUbah extends notifikasi{
    @Override
    public void notif(){
        System.out.println("Data Berhasil Diubah");
    }
}