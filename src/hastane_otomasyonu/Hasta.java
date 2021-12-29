package hastane_otomasyonu;

public class Hasta {
    private int hastaNo;
    private String hastaAdi;
    private String hastaSadi;
    private String hastaDurumu;
    private boolean hastaAciliyet;

    public Hasta(int hastaNo, String hastaAdi, String hastaSadi, String hastaDurumu, boolean hastaAciliyet) {
        this.hastaNo = hastaNo;
        this.hastaAdi = hastaAdi;
        this.hastaSadi = hastaSadi;
        this.hastaDurumu = hastaDurumu;
        this.hastaAciliyet = hastaAciliyet;
    }
    public Hasta(){

    }

    public int getHastaNo() {
        return hastaNo;
    }

    public void setHastaNo(int hastaNo) {
        this.hastaNo = hastaNo;
    }

    public String getHastaAdi() {
        return hastaAdi;
    }

    public void setHastaAdi(String hastaAdi) {
        this.hastaAdi = hastaAdi;
    }

    public String getHastaSadi() {
        return hastaSadi;
    }

    public void setHastaSadi(String hastaSadi) {
        this.hastaSadi = hastaSadi;
    }

    public String getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(String hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }

    public boolean isHastaAciliyet() {
        return hastaAciliyet;
    }

    public void setHastaAciliyet(boolean hastaAciliyet) {
        this.hastaAciliyet = hastaAciliyet;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "hastaNo=" + hastaNo +
                ", hastaAdi='" + hastaAdi + '\'' +
                ", hastaSadi='" + hastaSadi + '\'' +
                ", hastaDurumu='" + hastaDurumu + '\'' +
                ", hastaAciliyet=" + hastaAciliyet +
                '}';
    }
}
