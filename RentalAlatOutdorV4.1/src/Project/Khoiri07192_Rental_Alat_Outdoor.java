package Project;

import View.Khoiri07192_GUIDaftarLogin;

public class Khoiri07192_Rental_Alat_Outdoor {
    
//    private static Khoiri07192_PeminjamController peminjam = new Khoiri07192_PeminjamController();
//    private static Khoiri07192_AdminController admin = new Khoiri07192_AdminController();
//    private static Khoiri07192_TransaksiController transaksiAlat = new Khoiri07192_TransaksiController();
//    private static Khoiri07192_TransaksiController transaksi = new Khoiri07192_TransaksiController();
//    
//    static Scanner input = new Scanner(System.in);
//    static int cekadmin, cekpeminjam, cekalat, cektransaksi;
    
       public static void main(String[] args) {
           Khoiri07192_GUIDaftarLogin gui = new Khoiri07192_GUIDaftarLogin();
           
//           int loop = 0 ;        
//           do{
//               
//            System.out.print("Selamat Datang di Rental Alat Outdoor"
//                   + "\n1. Daftar Admin"
//                   + "\n2. Login Admin"
//                   + "\n3. Exit"
//                   + "\nPilih = ");
//            int pilih = input.nextInt();
//            if(pilih == 1){
//               Daftar();
//            }
//            else if(pilih == 2){
//               Login();
//            }
//            else{
//               break;
//            }
//            
//           }while(loop != 3);
//           
//       }
//       
//       static void Daftar(){
//        System.out.print("Input Kode = ");
//        String kode = input.next();
//        System.out.print("Input Nama = ");
//        String nama = input.next();
//        System.out.print("Input No Telp = ");
//        String notelp = input.next();
//        System.out.print("Input Umur = ");
//        String umur = input.next();
//        System.out.print("Password = ");
//        String password = input.next();
//        admin.insert(kode, nama, notelp, umur, password);
//      }
//       
//       static void Login(){
//        
//        int pil;
//        System.out.print("Kode : ");
//        String kode = input.next();
//        System.out.print("Password : ");
//        String password = input.next();
//        try{
//        admin.login(kode, password);
//        do{
//        System.out.println("Selamat datang "+admin.AdminEntity().getNama());
//        System.out.println("1. Pinjaman  ");
//        System.out.println("2. Lihat  ");
//        System.out.println("3. Update");
//        System.out.println("4. Remove");
//        System.out.println("5. Logout");
//        System.out.print("Pilih = ");
//        pil = input.nextInt();
//        
//        switch(pil){
//            
//            case 1 : Penyewa();
//                     break;
//            case 2 : 
//                     if(peminjam.cekDaftarPeminjam(cekpeminjam).size() == 0){
//                     System.out.println("Data Kosong");
//                    }else{
//                     view();
//                    } 
//                     break;
//            case 3:  
//                     System.out.print("Masukkan ID yang mau tambah barang :");
//                     String kodee =input.next();
//                     update(kodee);                   
//                     break;
//            case 4:  
//                     System.out.print("Kode Peminjam :");
//                     String kodeee =input.next();
//                     remove(kodeee);
//                     break;            
//           }
//        }while(pil !=  5);
//        }catch(Exception exception){
//             System.out.println("Kode Atau Password Salah !!");
//         } 
//       }
//        
//       
//       static void Penyewa()
//       {
//          
//         System.out.print("Kode Peminjam :");
//         String kode = input.next();
//         System.out.print("Nama Peminjam : ");
//         String nama = input.next();
//         System.out.print("No Telp Peminjam : ");
//         String notelp = input.next();
//         System.out.print("Umur Peminjam : ");
//         String umur = input.next();
//         System.out.print("Alamat  : ");
//         String alamat = input.next();
//         System.out.print("Jaminan : ");
//         String jaminan = input.next();
//         System.out.print("Nama Admin : ");
//         String indexadmin = input.next();
//         peminjam.insert(nama, notelp, umur, alamat);
//         transaksi.insertt(jaminan, indexadmin, kode);
//          
//         System.out.print("Jumlah yang dipinjam : ");
//         
//         int jmlh=input.nextInt();
//         for(int j=0;j<jmlh;j++){
//             for(int i=0;i<Khoiri07192_AlatEntity.Alat.length;i++){
//                System.out.println(i+". "+Khoiri07192_AlatEntity.Alat[i]);
//                 }
//                 System.out.print("Alat Yang Dipinjam : ");
//                int indexalat = input.nextInt();
//                transaksiAlat.insert(indexalat, jmlh, kode);
//                }
//       }
//       static void view()
//       {                
//            System.out.println("==========> Daftar Peminjam <==========");
//            for(int i=0;i<peminjam.cekDaftarPeminjam(cekpeminjam).size();i++)
//            {
//                System.out.println("ID Peminjam = "+transaksi.cekDataPeminjam(cekpeminjam).get(i).getKodePeminjam());
//                System.out.println("Nama Peminjam = "+peminjam.cekDaftarPeminjam(cekpeminjam).get(i).getNama());
//                System.out.println("No Telp Peminjam = "+peminjam.cekDaftarPeminjam(cekpeminjam).get(i).getNotelp());
//                System.out.println("Umur Peminjam = "+peminjam.cekDaftarPeminjam(cekpeminjam).get(i).getUmur());
//                System.out.println("Alamat Peminjam = "+peminjam.cekDaftarPeminjam(cekpeminjam).get(i).getAlamat());
//                System.out.println("Jaminan Peminjam = "+transaksi.cekDataPeminjam(cekpeminjam).get(i).getJaminan());
//                System.out.println("===>["+transaksi.cekDataPeminjam(cekpeminjam).get(i).getIndexadmin()+"]<==");    
//            }
//             System.out.println("Masukkan ID yang mau dilihat barangnya : "); //01
//             String kodeP=input.next();
//             
//             for(int k=0;k<transaksiAlat.cekDaftarAlat(cekalat).size();k++){
//                 
//                 if(transaksiAlat.cekDaftarAlat(k).get(k).getKodeAlat().equals(kodeP)){
//                     int indexalat=transaksiAlat.cekDaftarAlat(k).get(k).getIndexalat();
//                     if(indexalat==0){
//                         System.out.println("> Tas carrier");    
//                     }else if(indexalat==1){
//                         System.out.println("> Kompor");
//                     }else if(indexalat==2){
//                         System.out.println("> Nesting");
//                     }else if(indexalat==3){
//                        System.out.println("> Tenda");
//                     }else if(indexalat==4){
//                        System.out.println("> Flysheet");
//                     }
//                 }
//                 
//             }
//             System.out.println("==========> Terimakasih <==========");
//       }
//    
//
//       static void update(String kode)
//       {
//        for(int i=0;i<peminjam.cekDaftarPeminjam(cekalat).size();i++)
//        {
//          if(kode.equals(transaksi.cekDataPeminjam(i).get(i).getKodePeminjam()))
//            {
//                System.out.print("Nambah berapa barang? :");
//                int jmlh=input.nextInt();
//                for(int j=0;j<jmlh;j++){
//                for(int l=0;l<Khoiri07192_AlatEntity.Alat.length;l++){
//                System.out.println(l+". "+Khoiri07192_AlatEntity.Alat[l]);
//                 }
//                 System.out.print("Alat Yang Dipinjam : ");
//                int indexalat = input.nextInt();
//                transaksiAlat.insert(indexalat, jmlh, kode);
//                }
//                 break;
//                
//            }
//           else
//           {
//                System.out.println("ID salah");
//           }
//                
//        }
//       }
//       
//       static void remove(String kode)
//       {
//        for(int i=0;i<peminjam.cekDaftarPeminjam(cekpeminjam).size();i++)
//        {
//          if(kode.equals(transaksi.cekDataPeminjam(i).get(i).getKodePeminjam()))
//          {
//                peminjam.remove(i);
//                System.out.println("Data Sudah Di Hapus");
//                break;
//          }
//          
//          else
//          {
//                System.out.println("ID SALAH");
//               
//          }
//        }
//        for(int j=0;j<transaksiAlat.cekDaftarAlat(cekalat).size();j++)
//        {
//            if(kode.equals(transaksiAlat.cekDaftarAlat(j).get(j).getKodeAlat()))
//            {
//                transaksiAlat.remove(j);
//            }
//        }
//        for(int k=0;k<transaksi.cekDataPeminjam(cektransaksi).size();k++)
//        {
//            if(kode.equals(transaksi.cekDataPeminjam(k).get(k).getJaminan()))
//            {
//                transaksi.remove(k);
//            }
//        }
       }
//    
}
