package Entity;

public class Khoiri07192_TransaksiEntity {  
    
    private int  indexalat2, indexalat1, indexalat3; 
    private String kodealat, jaminan, indexadmin, kodepeminjam;
    
    
    public Khoiri07192_TransaksiEntity(int indexalat1, int indexalat2, int indexalat3, String kodealat) {
        this.indexalat1 = indexalat1;
        this.indexalat2 = indexalat2;
        this.indexalat3 = indexalat3;
        this.kodealat = kodealat;        
    }    
    public Khoiri07192_TransaksiEntity(String jaminan, String indexadmin, String kodepeminjam){
        this.jaminan = jaminan;
        this.indexadmin = indexadmin;
        this.kodepeminjam = kodepeminjam;
    }

    public int getIndexalat1() {
        return indexalat1;
    }
    public int getIndexalat3() {
        return indexalat3;
    }
    public int getIndexalat2() {
        return indexalat2;
    }
    public String getKodeAlat() {
        return kodealat;
    }
    
    public String getJaminan(){
        return jaminan;
    }
    
    public String getIndexadmin(){
        return indexadmin;
    }
    public String getKodePeminjam(){
        return kodepeminjam;
    }
  
}
