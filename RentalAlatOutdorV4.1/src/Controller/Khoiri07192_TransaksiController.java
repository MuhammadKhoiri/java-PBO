package Controller;

import Entity.Khoiri07192_AlatEntity;
import Entity.Khoiri07192_TransaksiEntity;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class Khoiri07192_TransaksiController{
    public Khoiri07192_TransaksiController(){
 
    }
    int index = 0;
    int indexLogin = 0;
    
    public void insert(int indexalat1, int inedexalat2, int indexalat3, String kodealat){
        Khoiri07192_AllObjectModel.transaksiAlatModel.insert(new Khoiri07192_TransaksiEntity(indexalat1, inedexalat2, indexalat3, kodealat));
    }
    public void insertt(String jaminan, String indexadmin, String kodepeminjam){
        Khoiri07192_AllObjectModel.transaksiModel.insertt(new Khoiri07192_TransaksiEntity(jaminan, indexadmin, kodepeminjam));
    }
    public Khoiri07192_TransaksiEntity TransaksiEntity(){
        return Khoiri07192_AllObjectModel.transaksiModel.getTransaksiArrayList(index);
    }
    public Khoiri07192_TransaksiEntity TransaksiAlatEntity(){
        return Khoiri07192_AllObjectModel.transaksiAlatModel.getTransaksiAlatArrayList(index);
    }
    public ArrayList<Khoiri07192_TransaksiEntity> cekDataPeminjam(int index){
    return Khoiri07192_AllObjectModel.transaksiModel.getTransaksiEntityArrayList();
    }
    public ArrayList<Khoiri07192_TransaksiEntity> cekDaftarAlat(int index){
    return Khoiri07192_AllObjectModel.transaksiAlatModel.getTransaksiAlatEntityArrayList();
    }
    public void remove(int carikode){
        Khoiri07192_AllObjectModel.transaksiAlatModel.remove(carikode);
    }
    public void removee(int carikodee){
        Khoiri07192_AllObjectModel.transaksiModel.remove(carikodee);
    }
    public Khoiri07192_TransaksiController transaksiAlatEntity(){
        Khoiri07192_AllObjectModel.transaksiAlatModel.getTransaksiAlatArrayList(indexLogin);
        return null;
    }
    public Khoiri07192_TransaksiEntity showDaftarbarang1(int index){
        return Khoiri07192_AllObjectModel.transaksiAlatModel.showDaftarbarang1(index);
    }
    
    public DefaultTableModel tableBarang(){
        DefaultTableModel dtmdaftarbarang = new DefaultTableModel();
        Object[] kolom ={"BARANG 1","BARANG 2","BARANG 3"};
        dtmdaftarbarang.setColumnIdentifiers(kolom);
        int size = Khoiri07192_AllObjectModel.peminjamModel.size();
        for (int i=0;i<size;i++){
            Object [] data= new Object[10];
            data[0] = Khoiri07192_AlatEntity.Alat[Khoiri07192_AllObjectModel.transaksiAlatModel.showDaftarbarang1(i).getIndexalat1()];
            data[1] = Khoiri07192_AlatEntity.Alat[Khoiri07192_AllObjectModel.transaksiAlatModel.showDaftarbarang1(i).getIndexalat2()];
            data[2] = Khoiri07192_AlatEntity.Alat[Khoiri07192_AllObjectModel.transaksiAlatModel.showDaftarbarang1(i).getIndexalat3()];
            dtmdaftarbarang.addRow(data);
        }
        return dtmdaftarbarang;
    }
}
