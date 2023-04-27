package PROYEK_AKHIR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Peminjaman> pinjam = new ArrayList<>();
    static ArrayList<Bookingan> booking = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        users.add(new User("admin", "admin123", "admin"));
        users.add(new User("staff", "staff123", "staff"));

        while (true) {
            System.out.println("======================================");
            System.out.println("|   PROGRAM PENDATAAN RENTAL MOBIL   |");
            System.out.println("|      CV. SAMARINDA CAR RENTAL      |");
            System.out.println("======================================");
            System.out.print("Username  : ");
            String username = in.nextLine();
            System.out.print("Password  : ");
            String password = in.nextLine();

            // panggil method login
            User userLogin = login(username, password, users);

        if(userLogin != null && userLogin.isAdmin()) {
            System.out.println("");
            System.out.println("Selamat Datang ADMIN");
            menuAdmin();
        } 
        else if (userLogin != null && !userLogin.isAdmin()){
            System.out.println("");
            System.out.println("Selamat Datang STAFF");
            menuStaff();
        }        
        else {
            System.out.println("Username atau password salah, silakan login kembali");
            System.out.println("");
        }                              
    }
}
    
    static final void menuAdmin() throws IOException{
          while(true){
            try{        
                System.out.println("======================================");
                System.out.println("|   PROGRAM PENDATAAN RENTAL MOBIL   |");
                System.out.println("|      CV. SAMARINDA CAR RENTAL      |");
                System.out.println("======================================");            
                System.out.println("| 1. Tambah Data                     |");
                System.out.println("| 2. Lihat Data                      |");
                System.out.println("| 3. Ubah Data                       |");
                System.out.println("| 4. Hapus Data                      |");
                System.out.println("| 5. Keluar                          |");
                System.out.println("|====================================|");
                System.out.print("| Pilihan Anda : ");

                int pilihan = Integer.parseInt(br.readLine());

                switch (pilihan) {
                    case 1 -> tambah();
                    case 2 -> tampil();
                    case 3 -> ubah();
                    case 4 -> hapus();
                    case 5 -> logout();
                    default -> System.out.println("PILIHAN SALAH!");
                }
                System.out.println("\n");
            } catch (NumberFormatException nfe) {
                System.out.println("Input Salah");
            }
            System.out.println("\n");
        }     
        
    }

    
    static final void menuStaff() throws IOException{
          while(true){
            try{        
            System.out.println("======================================");
            System.out.println("|   PROGRAM PENDATAAN RENTAL MOBIL   |");
            System.out.println("|      CV. SAMARINDA CAR RENTAL      |");
            System.out.println("======================================");                            
            System.out.println("| 1. Lihat Data                      |");                                
            System.out.println("| 2. Keluar                          |");
            System.out.println("|====================================|");
            System.out.print("| Pilihan Anda : ");

            int pilihan = Integer.parseInt(br.readLine());

                switch (pilihan) {
                            case 1 -> tampil();
                            case 2 -> logout();
                            default -> System.out.println("PILIHAN SALAH!");
                        }
                System.out.println("\n");
            } catch (NumberFormatException nfe) {
                System.out.println("Input Salah");
            }
            System.out.println("\n");
        }
        
    }
    static final void tambah() throws IOException{
        System.out.println("");
        ntf_peringatan alert = new ntf_peringatan();
        System.out.println("======================================");
        System.out.println("|   PROGRAM PENDATAAN RENTAL MOBIL   |");
        System.out.println("|      CV. SAMARINDA CAR RENTAL      |");
        System.out.println("======================================");  
        System.out.println("|1. Tambah Data Peminjaman           |");
        System.out.println("|2. Tambah Data Booking              |");
        System.out.println("|====================================|");  
        System.out.println("| Pilihan Anda : "); 
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
                
            case 1 -> {
                try {                    
                    System.out.println("");
                    alert.tambah();
                    System.out.println("======================================");
                    System.out.println("|       Tambah Data Peminjaman       |");
                    System.out.println("======================================");
                    System.out.print("Nama            : ");
                    String nama = br.readLine();  
                    System.out.print("NIK             :");
                    int nik = Integer.parseInt(br.readLine());
                    System.out.print("Alamat          :");
                    String alamat = br.readLine();
                    System.out.print("Nomor HP        :");
                    String nomorhp = br.readLine();
                    System.out.print("Merek           :");
                    String merek = br.readLine();
                    System.out.print("Tipe            :");
                    String tipe = br.readLine();
                    System.out.print("Warna           :");
                    String warna = br.readLine();
                    System.out.print("Plat            :");
                    String plat = br.readLine();
                    System.out.print("Tangal Pinjam   :");
                    String tanggal_pinjam = br.readLine();
                    System.out.print("Tangal Balik    :");
                    String tanggal_balik = br.readLine();
                    System.out.print("Jumlah Hari     :");
                    int jumlahhari = Integer.parseInt(br.readLine());
                    int jumlahharga = jumlahhari * 500000;
                    System.out.print("Jumlah Harga    :");
                    int jumlah_harga = jumlahharga;
                    
                    Peminjaman newpeminjaman = new Peminjaman (nama, nik, alamat, nomorhp, merek, tipe, warna, plat,tanggal_pinjam, tanggal_balik, jumlahhari, jumlah_harga);
                    pinjam.add(newpeminjaman);
                    
                    notifikasi ntftmbh = new notifikasi();
                    ntftmbh.notif();
                    
                    System.out.println("======================================");
                    System.out.println("");
                } catch (NumberFormatException nfe) {
                    System.out.println("Input Salah");
                }                
            }            
            case 2 -> {
                try{
                    System.out.println("");
                    alert.tambah();
                    System.out.println("======================================");
                    System.out.println("|        Tambah Data Booking         |");
                    System.out.println("======================================");
                    System.out.print("Nama            : ");
                    String namabk = br.readLine();  
                    System.out.print("NIK             :");
                    int nikbk = Integer.parseInt(br.readLine());
                    System.out.print("Alamat          :");
                    String alamatbk = br.readLine();
                    System.out.print("Nomor HP        :");
                    String nomorhpbk = br.readLine();
                    System.out.print("Merek           :");
                    String merekbk = br.readLine();
                    System.out.print("Tipe            :");
                    String tipebk = br.readLine();
                    System.out.print("Warna           :");
                    String warnabk = br.readLine();
                    System.out.print("Plat            :");
                    String platbk = br.readLine();
                    System.out.print("Tanggal Pinjam  :");
                    String tanggal_pinjambk = br.readLine();
                    

                    Bookingan newbooking = new Bookingan (namabk, nikbk, alamatbk, nomorhpbk, merekbk, tipebk, warnabk, platbk, tanggal_pinjambk);
                    booking.add(newbooking);

                    notifikasi ntftmbh = new notifikasi();
                    ntftmbh.notif();
                    
                    System.out.println("======================================");
                    System.out.println("");                
                } catch (NumberFormatException nfe) {
                    System.out.println("Input Salah");
                }                                 
            }
            default -> System.out.println("PILIHAN SALAH!");
        }
    }

    static final void tampil() throws IOException{
        System.out.println("======================================");
        System.out.println("|   PROGRAM PENDATAAN RENTAL MOBIL   |");
        System.out.println("|      CV. SAMARINDA CAR RENTAL      |");
        System.out.println("======================================");  
        System.out.println("|1. Tampil Data Peminjaman           |");
        System.out.println("|2. Tampil Data Booking              |");
        System.out.println("|====================================|");  
        System.out.println("| Pilihan Anda : "); 
        int pilih = Integer.parseInt(br.readLine());
        
        switch (pilih){
        
            case 1 -> tampilPeminjaman();
            case 2 -> tampilBookingan();
            default -> System.out.println("PILIHAN SALAH!");
            
            }        
        }

    static final void tampilPeminjaman()throws IOException{
        
        if (pinjam.isEmpty()){
                
                System.out.println("Data Kosong");
                
        }else{
            
            System.out.println("");
            System.out.println("======================================");
            System.out.println("|           Data Peminjaman          |");
            System.out.println("======================================");
            for(int i = 0; i< pinjam.size(); i++){
                System.out.println("Data ke - "+(i+1));
                System.out.println("Nama            : "+pinjam.get(i).getNama());
                System.out.println("NIK             : "+pinjam.get(i).getNik());
                System.out.println("Alamat          : "+pinjam.get(i).getAlamat());
                System.out.println("Nomor HP        : "+pinjam.get(i).getNomorhp());
                System.out.println("Merek           : "+pinjam.get(i).getMerek());
                System.out.println("Tipe            : "+pinjam.get(i).getTipe());
                System.out.println("Warna           : "+pinjam.get(i).getWarna());
                System.out.println("Plat            : "+pinjam.get(i).getPlat());                    
                System.out.println("Tanggal Pinjam  : "+pinjam.get(i).getTanggal_pinjam());                    
                System.out.println("Tanggal Balik   : "+pinjam.get(i).getTanggal_balik());                    
                System.out.println("Jumlah Hari     : "+pinjam.get(i).getJumlah_hari());    
                System.out.println("Jumlah Harga    : "+pinjam.get(i).getJumlah_harga());                                    
                System.out.println("==================================");
            }
            System.out.println("======================================"); 
            System.out.println("");
            
        }
    }

    static final void tampilBookingan()throws IOException{
        
        if (booking.isEmpty()){
                
                System.out.println("Data Kosong");
                
        }else{
            
            System.out.println("");
            System.out.println("======================================");
            System.out.println("|            Data Bookingan          |");
            System.out.println("======================================");
            for(int i = 0; i< booking.size(); i++){
                System.out.println("Data ke - "+(i+1));
                System.out.println("Nama            : "+booking.get(i).getNama());
                System.out.println("NIK             : "+booking.get(i).getNik());
                System.out.println("Alamat          : "+booking.get(i).getAlamat());
                System.out.println("Nomor HP        : "+booking.get(i).getNope());
                System.out.println("Merek           : "+booking.get(i).getMerek());
                System.out.println("Tipe            : "+booking.get(i).getTipe());
                System.out.println("Warna           : "+booking.get(i).getWarna());
                System.out.println("Plat            : "+booking.get(i).getPlat());                    
                System.out.println("Tanggal Pinjam  : "+booking.get(i).getTanggal_pinjam());                                                                      
                System.out.println("===================================");
            }
            System.out.println("======================================="); 
            System.out.println("");
            
        }
    }

    static void ubah() throws IOException{        
        System.out.println("======================================");
        System.out.println("|   PROGRAM PENDATAAN RENTAL MOBIL   |");
        System.out.println("|      CV. SAMARINDA CAR RENTAL      |");
        System.out.println("======================================");
        System.out.println("|1. Edit Data Peminjaman             |");
        System.out.println("|2. Edit Data Bookingan              |");
        System.out.println("|====================================|");  
        System.out.println("| Pilihan Anda : "); 
        int pilih = Integer.parseInt(br.readLine());
        switch (pilih){
            
            case 1 -> {
                tampilPeminjaman();
                System.out.println("Ubah Data Ke : ");
                int ubahkee = Integer.parseInt(br.readLine());
                ubahkee -=1;

                System.out.println("");
                System.out.println("======================================");
                System.out.println("|        UBAH DATA PEMINJAMAN        |");
                System.out.println("======================================");
                System.out.print("Nama        :");    
                pinjam.get(ubahkee).setNama(br.readLine());
                System.out.print("NIK         :");    
                pinjam.get(ubahkee).setNik(Integer.parseInt(br.readLine()));
                System.out.print("Alamat      :");
                pinjam.get(ubahkee).setAlamat(br.readLine());
                System.out.print("Nomor HP    :");
                pinjam.get(ubahkee).setNomorhp(br.readLine());
                System.out.print("Merek       :");
                pinjam.get(ubahkee).setMerek(br.readLine());
                System.out.print("Tipe        :");
                pinjam.get(ubahkee).setTipe(br.readLine());
                System.out.print("Warna       :");
                pinjam.get(ubahkee).setWarna(br.readLine());
                System.out.print("Plat        :");
                pinjam.get(ubahkee).setPlat(br.readLine());  
                System.out.print("Tanggal Pinjam        :");
                pinjam.get(ubahkee).setTanggal_pinjam(br.readLine());  
                System.out.print("Tangal Balik        :");
                pinjam.get(ubahkee).setTanggal_balik(br.readLine());  
                System.out.print("Jumlah Hari        :");
                int jumlahhari = Integer.parseInt(br.readLine());
                pinjam.get(ubahkee).setJumlah_hari(jumlahhari);
                int jumlahharga = jumlahhari * 500000;
                System.out.print("Jumlah Harga        :");
                pinjam.get(ubahkee).setJumlah_harga(jumlahharga);
                
                notifikasi ntfubah = new notifUbah();
                ntfubah.notif();    //Pemanggilan method overriding
                
                System.out.println("======================================");
                System.out.println("");
            }

            case 2 -> {
                tampilBookingan();
                System.out.println("Ubah Data Ke : ");
                int ubahkee = Integer.parseInt(br.readLine());
                ubahkee -=1;

                System.out.println("");
                System.out.println("======================================");
                System.out.println("|         UBAH DATA BOOKINGAN        |");
                System.out.println("======================================");
                System.out.print("Nama        : ");    
                booking.get(ubahkee).setNama(br.readLine());
                System.out.print("NIK         : ");    
                booking.get(ubahkee).setNik(Integer.parseInt(br.readLine()));
                System.out.print("Alamat      :");
                booking.get(ubahkee).setAlamat(br.readLine());
                System.out.print("Nomor HP    :");
                booking.get(ubahkee).setNope(br.readLine());
                System.out.print("Merek       :");
                booking.get(ubahkee).setMerek(br.readLine());
                System.out.print("Tipe        :");
                booking.get(ubahkee).setTipe(br.readLine());
                System.out.print("Warna       :");
                booking.get(ubahkee).setWarna(br.readLine());
                System.out.print("Plat        :");
                booking.get(ubahkee).setPlat(br.readLine());  
                System.out.print("Tangal Pinjam        :");
                booking.get(ubahkee).setTanggal_pinjam(br.readLine());                  
                
                notifikasi ntfubah = new notifUbah();
                ntfubah.notif();    //Pemanggilan method overriding
                
                System.out.println("======================================");
                System.out.println("");
            }
        }
    }

    static void hapus() throws IOException{
        System.out.println("======================================");
        System.out.println("|   PROGRAM PENDATAAN RENTAL MOBIL   |");
        System.out.println("|      CV. SAMARINDA CAR RENTAL      |");
        System.out.println("======================================");
        System.out.println("|1. Hapus Data Peminjaman            |");
        System.out.println("|2. Hapus Data Bookingan             |");
        System.out.println("|====================================|");  
        System.out.println("| Pilihan Anda : "); 
        int pilihann = Integer.parseInt(br.readLine());
        
        switch (pilihann){
            case 1 -> {
                tampilPeminjaman();
                System.out.println("Hapus Data Ke : ");
                int target = Integer.parseInt(br.readLine());
                target -=1;
                pinjam.remove(target);
                System.out.println("Data Berhasil Dihapus");
            }
            
            case 2 -> {
                tampilBookingan();
                System.out.println("Hapus Data Ke : ");
                int targett = Integer.parseInt(br.readLine());
                targett -=1;
                booking.remove(targett);
                System.out.println("Data Berhasil Dihapus");
            }
            
            default -> System.out.println("Pilihan Tidak Ada");
        }     
        
    }
    
  static User login(String username, String password, ArrayList<User> users) {
    for (User user : users) {
        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return user;
        }
    }
    return null; // jika username dan password tidak cocok dengan data yang ada
}
    
   static void logout() throws IOException {
    System.out.println("Anda berhasil logout.");
    System.out.println("Silakan login kembali.");
    
    // kembali ke menu login
    while (true) {
        System.out.println("Username  : ");
        String username = in.nextLine();
        System.out.println("Password  : ");
        String password = in.nextLine();
        
        // panggil method login
        User userLogin = login(username, password, users);
        if (userLogin != null) {
            if (userLogin.isAdmin()) {
                System.out.println("");
                System.out.println("Selamat Datang ADMIN");
                menuAdmin();
            } else {
                System.out.println("");
                System.out.println("Selamat Datang STAFF");
                menuStaff();
            }
        } else {
            System.out.println("Username atau password salah, silakan login kembali");
            System.out.println("");
        }
    }
    
   }   
}