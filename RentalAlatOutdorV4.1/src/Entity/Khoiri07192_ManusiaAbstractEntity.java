package Entity;

public abstract class Khoiri07192_ManusiaAbstractEntity {
    protected String nama, notelp, umur;
    public Khoiri07192_ManusiaAbstractEntity(String nama, String notelp, String umur){
    this.nama = nama;
    this.notelp = notelp;
    this.umur = umur;
    }  
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }   
    public String getNotelp(){
        return notelp;
    }   
    public void setNotelp(String notelp){
        this.notelp = notelp;
    }   
    public String getUmur(){
        return umur;
    } 
    public void setUmur(String umur){
        this.umur = umur;
    }      
}