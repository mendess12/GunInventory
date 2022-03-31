package GuiPanel;

public class Tabanca extends Silah { // Silah sınıfına ait bileşenleri Tabanca sınıfına miras olarak aktarmak için kalıtım (extends) kullanıldı.

    private Sarjor sarjor;

    public Tabanca(String marka, double etkinMenzil) { // constructor. aynı isimde paramtreleri faklı ise buna overloading denir.
        super(marka, etkinMenzil);
    }

    public Tabanca(String marka, double etkinMenzil, Sarjor sarjor) { // constructor
        super(marka, etkinMenzil);
        this.sarjor = sarjor;
    }

    public void atesEt(double hedefMenzili) {
       
        if (this.sarjor != null) {
            if (hedefMenzili <= getEtkinMenzil()) { // etkin menzil kullanıcının giridiği menzilden büyük ise ateş etme etkinleşecektir.
                this.sarjor.mermiAtesle();
            } else {
                System.out.println(" Hedef menzili Etkin menzil sınırları içinde değildir.");
            }
        } else {
            System.out.println("Şarjor bulunmamaktdatır. Sarjor koyunuz.");
        }
    }
    
    public void doldur() {
  
        if (this.sarjor != null) {
            this.sarjor.sarjoruDoldur();
        } else {
            System.out.println("Şarjor bulunmamaktdatır. Sarjor koyunuz.");
        }
    
    }
    public Sarjor getSarjor() {
        return sarjor;
    }

    public void setSarjor(Sarjor sarjor) {
        this.sarjor = sarjor;
    }

    public int getSarjorSayisi() { // şarjör sayisi değerini almak için .
        int sarjorSayisi = 0;
        if (this.sarjor != null) {
            sarjorSayisi = 1;
        }
        return sarjorSayisi;
    }

    public int getMermiSayisi() { // anlık mermi sayisi değerini almak için .
        int mermiSayisi = 0;
        if (this.sarjor != null) {
            mermiSayisi += sarjor.getAnlikMermiSayisi();
        }
        return mermiSayisi;
    }

    public int getMermiKapasitesi() { // mermi kapasitesi değerini almak için .
        int mermiSayisi = 0;
        if (this.sarjor != null) {
            mermiSayisi += sarjor.getMermiKapasitesi();
        }
        return mermiSayisi;
    }

    public String getTabancaBilgileri() { // tabanca bilgilerini geri döner

        String tabancaBilgileri = " Adı : " + getMarka()
                + ",\n şarjör sayısı : " + getSarjorSayisi()
                + ",\n mermi kapasitesi : " + getMermiKapasitesi()
                + ",\n mermi sayısı : " + getMermiSayisi()
                + ",\n etkin menzili : " + getEtkinMenzil();
        return tabancaBilgileri;
    }

    public void tabancaBilgileriniYazdır() { 
        System.out.println(getTabancaBilgileri());
    }


}