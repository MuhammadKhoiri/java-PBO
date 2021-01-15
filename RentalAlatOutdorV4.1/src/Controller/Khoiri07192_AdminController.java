package Controller;

import Entity.Khoiri07192_AdminEntity;

public class Khoiri07192_AdminController{
    public Khoiri07192_AdminController(){
 
    }
    int indexLogin = 0;

    public void login(String kode,String password){
        indexLogin = Khoiri07192_AllObjectModel.adminModel.cekData(kode,password);
    }
    
    public void insert(String kode, String nama, String notelp, String umur, String password){
        Khoiri07192_AllObjectModel.adminModel.insert(new Khoiri07192_AdminEntity(kode,nama,notelp,umur,password));
    }
    public Khoiri07192_AdminEntity AdminEntity(){
        return Khoiri07192_AllObjectModel.adminModel.getAdminEntityArrayList(indexLogin);
    }
    public int update(String Khoiri07192_kode,String Khoiri07192_pass){
       return  Khoiri07192_AllObjectModel.adminModel.update(Khoiri07192_kode, Khoiri07192_pass);   
    }
}
