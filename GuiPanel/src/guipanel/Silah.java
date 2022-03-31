package GuiPanel;

public abstract class Silah implements ISilah { // Nesne üretilmediği için abstract kullanıldı.

    private String marka;
    private double etkinMenzil;
    
    public Silah(String marka, double etkinMenzil) {
        this.marka = marka;
        this.etkinMenzil = etkinMenzil;
    }

    @Override
    public String getMarka() {
        return marka;
    }

    @Override
    public double getEtkinMenzil() {
        return etkinMenzil;
    }
   
}

