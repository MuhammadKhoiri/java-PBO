package Model;

import Entity.Khoiri07192_AlatEntity;
import java.text.SimpleDateFormat;
import Entity.Khoiri07192_PeminjamEntity;
import java.util.ArrayList;

public class Khoiri07192_PeminjamModel {
    
    private ArrayList<Khoiri07192_PeminjamEntity> peminjamEntityArrayList;
    
    public Khoiri07192_PeminjamModel(){
        peminjamEntityArrayList = new ArrayList<Khoiri07192_PeminjamEntity>();
    }
    public void insert(Khoiri07192_PeminjamEntity peminjamEntity){ //method
        peminjamEntityArrayList.add(peminjamEntity);
    }
    public int size() {
      return peminjamEntityArrayList.size();
    }
    public void remove(int carikode) {
        peminjamEntityArrayList.remove(carikode);
    }
    public ArrayList<Khoiri07192_PeminjamEntity> getPeminjamEntityArrayList(){
        return peminjamEntityArrayList;
    }
    
    public Khoiri07192_PeminjamEntity getPeminjamEntityArrayList(int index){
        return peminjamEntityArrayList.get(index);
    }
    
}
