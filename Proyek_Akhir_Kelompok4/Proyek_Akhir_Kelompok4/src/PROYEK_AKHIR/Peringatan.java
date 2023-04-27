package PROYEK_AKHIR;

interface peringatan {
    void tambah();
    void ubah();
    void hapus();
}

class ntf_peringatan implements peringatan {
    @Override
    public void tambah() {
        System.out.println("Silahkan Menambahkan Data Dengan Hati-hati");
    }

    @Override
    public void ubah() {
        System.out.println("Silahkan Mengubah Data Dengan Hati-hati");
    }

    @Override
    public void hapus() {
        System.out.println("Silahkan Menghapus Data Dengan Hati-hati");
    }
}   
