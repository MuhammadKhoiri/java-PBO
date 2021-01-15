package Model;

import Entity.Khoiri07192_TransaksiEntity;
import java.util.ArrayList;

public class Khoiri07192_TransaksiModel{
    private ArrayList<Khoiri07192_TransaksiEntity> transaksiAlatArrayList;
    private ArrayList<Khoiri07192_TransaksiEntity> transaksiArrayList;
    private ArrayList<Khoiri07192_TransaksiEntity> transaksiAlatUpdateArrayList;
    
    
    public Khoiri07192_TransaksiModel(){
        transaksiAlatArrayList = new ArrayList<>();
        transaksiArrayList = new ArrayList<>();
        transaksiAlatUpdateArrayList = new ArrayList<>();
    }
    
    public void insert(Khoiri07192_TransaksiEntity transaksiAlatEntity){ //method
        transaksiAlatArrayList.add(transaksiAlatEntity);
    }
    public void insertt(Khoiri07192_TransaksiEntity transaksiEntity){ //method
        transaksiArrayList.add(transaksiEntity);
    }
    public void inserttt(Khoiri07192_TransaksiEntity transaksiAlatUpdateEntity){ //method
        transaksiAlatUpdateArrayList.add(transaksiAlatUpdateEntity);
    }
    public int size() {
      return transaksiAlatArrayList.size();
    }
    public int sizee() {
      return transaksiArrayList.size();
    }
    public void remove(int carikode) {
        transaksiAlatArrayList.remove(carikode);
    }
    public ArrayList<Khoiri07192_TransaksiEntity> getTransaksiAlatEntityArrayList(){
        return transaksiAlatArrayList;
    }
    public ArrayList<Khoiri07192_TransaksiEntity> getTransaksiEntityArrayList(){
        return transaksiArrayList;
    }
    
    public Khoiri07192_TransaksiEntity getTransaksiAlatArrayList(int index){
        return transaksiAlatArrayList.get(index);
    }
    public Khoiri07192_TransaksiEntity getTransaksiArrayList(int index){
        return transaksiArrayList.get(index);
    }
    public Khoiri07192_TransaksiEntity showDaftarbarang1(int index){
        return transaksiAlatArrayList.get(index);
    } 
    public int cekData(String kodepeminjam) {
        int loop = 0;
        while (!transaksiArrayList.get(loop).getKodePeminjam().equals(kodepeminjam)){
            loop++;
        }
        return loop;
    }
}
