package Entity;

public class Khoiri07192_AdminEntity extends Khoiri07192_ManusiaAbstractEntity {
    private String kode,password;
    public Khoiri07192_AdminEntity(String nama, String notelp, String umur, String kode, String password){
        super(nama, notelp, umur);
        this.password = password;
        this.kode=kode;
    }
    public String getKode(){
        return kode;
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }  
}
