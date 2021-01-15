package Model;

import Entity.Khoiri07192_AdminEntity;
import java.util.ArrayList;

public class Khoiri07192_AdminModel implements Khoiri07192_ModelInterfaces{
    
    private ArrayList<Khoiri07192_AdminEntity> adminEntityArrayList;
    
    public Khoiri07192_AdminModel(){
        adminEntityArrayList = new ArrayList<Khoiri07192_AdminEntity>();
    }
    public void insert(Khoiri07192_AdminEntity adminEntity){ //method
        adminEntityArrayList.add(adminEntity);
    }
     
    @Override
    public int cekData(String kode, String password) {
        int loop = 0;
        while (!adminEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    
    public Khoiri07192_AdminEntity getAdminEntityArrayList(int index){
        return adminEntityArrayList.get(index);
    }
    public int update(String Khoiri07192_passlama,String Khoiri07192_passbaru){
        int Status;
        if(caripass(Khoiri07192_passlama)!=-1){     
            adminEntityArrayList.get(caripass(Khoiri07192_passlama)).setPassword(Khoiri07192_passbaru);
            Status=1;
       }else{
            Status=0;
       }
       return Status;
   }
    
    private int caripass(String password){
       int indeks=-1;
       
       for(int a=0;a<adminEntityArrayList.size();a++){
           if(password.equals(adminEntityArrayList.get(a).getPassword())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
    
}
