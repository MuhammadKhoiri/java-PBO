package Entity;

public class Khoiri07192_PeminjamEntity extends Khoiri07192_ManusiaAbstractEntity{
    private String alamat; //
    public Khoiri07192_PeminjamEntity(String nama, String notelp,String umur, String alamat){
        super(nama, notelp, umur);
        this.alamat=alamat;
    }
    public String getAlamat(){
        return this.alamat;
    }
}