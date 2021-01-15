package Controller;

import Entity.Khoiri07192_AlatEntity;
import Entity.Khoiri07192_PeminjamEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Khoiri07192_PeminjamController{
    
    public Khoiri07192_PeminjamController(){
 
    }
    int index = 0;
    
    public void insert(String nama, String notelp,String umur, String alamat){
        Khoiri07192_AllObjectModel.peminjamModel.insert(new Khoiri07192_PeminjamEntity(nama,notelp,umur,alamat));
    }
    public Khoiri07192_PeminjamEntity PeminjamEntity(){
        return Khoiri07192_AllObjectModel.peminjamModel.getPeminjamEntityArrayList(index);
    }
    public void remove(int carikode){
        Khoiri07192_AllObjectModel.peminjamModel.remove(carikode);
    }
    public ArrayList<Khoiri07192_PeminjamEntity> cekDaftarPeminjam(int index){
    return Khoiri07192_AllObjectModel.peminjamModel.getPeminjamEntityArrayList();
    }
    public int cekpembeli(String kodepeminjam){
        int cek = Khoiri07192_AllObjectModel.transaksiModel.cekData(kodepeminjam);
        return cek;   
        }
    public DefaultTableModel tablePeminjam(){
        DefaultTableModel dtmdaftarprak = new DefaultTableModel();
        Object[] kolom ={"KODE","NAMA","NOTELP","UMUR","ALAMAT","JAMINAN","ADMIN"};
        dtmdaftarprak.setColumnIdentifiers(kolom);
        int size = Khoiri07192_AllObjectModel.peminjamModel.size();
        for (int i=0;i<size;i++){
            Object [] data= new Object[10];
            data[0] = Khoiri07192_AllObjectModel.transaksiModel.getTransaksiEntityArrayList().get(i).getKodePeminjam();
            data[1] = Khoiri07192_AllObjectModel.peminjamModel.getPeminjamEntityArrayList().get(i).getNama();
            data[2] = Khoiri07192_AllObjectModel.peminjamModel.getPeminjamEntityArrayList().get(i).getNotelp();
            data[3] = Khoiri07192_AllObjectModel.peminjamModel.getPeminjamEntityArrayList().get(i).getUmur();
            data[4] = Khoiri07192_AllObjectModel.peminjamModel.getPeminjamEntityArrayList().get(i).getAlamat();
            data[5] = Khoiri07192_AllObjectModel.transaksiModel.getTransaksiEntityArrayList().get(i).getJaminan();
            data[6] = Khoiri07192_AllObjectModel.transaksiModel.getTransaksiEntityArrayList().get(i).getIndexadmin();
            dtmdaftarprak.addRow(data);
        }
        return dtmdaftarprak;
    }
}