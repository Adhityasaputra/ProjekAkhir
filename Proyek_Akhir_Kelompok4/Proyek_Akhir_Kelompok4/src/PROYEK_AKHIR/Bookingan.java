package PROYEK_AKHIR;

public class Bookingan extends Pelanggan {
    
    protected String merek;
    protected String tipe;
    protected String warna;
    protected String plat;
    protected String tanggal_pinjam;
    
    public Bookingan (String nama, int nik, String alamat, String nope, String merek, String tipe, String warna, String plat, String tanggal_pinjam){
        
        super(nama, nik, alamat, nope);
        this.merek = merek;
        this.tipe = tipe;
        this.warna = warna;
        this.plat = plat;
        this.tanggal_pinjam = tanggal_pinjam;
        
    
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
    
}

//Penggunaan Overloading
class Summary {
    public void nama(String nama){
        System.out.println("Bookingan Atas Nama "+nama+" Telah Ditambahkan");
    }

    public void konfir(String nama, String nope){
        System.out.println("Permintaan Atas Nama "+nama+" Dengan Nomor HP "+nope+" Telah Dikonfirmasi");
    }
}