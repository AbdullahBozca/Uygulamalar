package hastane_otomasyonu;

import java.util.HashMap;
import java.util.Map;

public class VeriBankasi {

    private String doktorAdi;
    private String doktorSadi;
    private String doktorUnvan;


    public VeriBankasi(String doktorAdi, String doktorSadi, String doktorUnvan) {
        this.doktorAdi = doktorAdi;
        this.doktorSadi = doktorSadi;
        this.doktorUnvan = doktorUnvan;
    }

    public VeriBankasi() {

    }

    public String getDoktorAdi() {
        return doktorAdi;
    }

    public void setDoktorAdi(String doktorAdi) {
        this.doktorAdi = doktorAdi;
    }

    public String getDoktorSadi() {
        return doktorSadi;
    }

    public void setDoktorSadi(String doktorSadi) {
        this.doktorSadi = doktorSadi;
    }

    public String getDoktorUnvan() {
        return doktorUnvan;
    }

    public void setDoktorUnvan(String doktorUnvan) {
        this.doktorUnvan = doktorUnvan;
    }

    @Override
    public String toString() {
        return 
                "doktorAdi='" + doktorAdi + '\'' +
                ", doktorSadi='" + doktorSadi + '\'' +
                ", doktorUnvan='" + doktorUnvan + '\'' ;
    }
}
