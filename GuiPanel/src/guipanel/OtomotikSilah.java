package GuiPanel;

import java.util.ArrayList;

public class OtomotikSilah extends Silah { // Silah sınıfına ait bileşenleri Otomatik silah sınıfına miras olarak aktarmak için kalıtım (extends) kullanıldı.
    
  private ArrayList<Sarjor> sarjorList = new ArrayList<>(); // Şarjörleri listesini tutmak için ArrayList kullanıldı.
    final int sarjorKapasitesi = 5; 
    final int seriAtisSaiysi = 5;


    public OtomotikSilah(String marka, double etkinMenzil) {
        super(marka, etkinMenzil);
    }

    public void seriAtis(double hedefMenzili) { // seri ates etme fonksiyonu
        if (this.sarjorList.size() > 0) {
            for (int atis = 0; atis < this.seriAtisSaiysi; ++atis) {
                atesEt(hedefMenzili);
            }
        } else {
            System.out.println(" Şarjor listesi boştur. Sarjor ekleyiniz.");
        }
    }

    public void sarjorEkle(Sarjor sarjor) {
        if (this.sarjorList.size() < this.sarjorKapasitesi) {
            this.sarjorList.add(sarjor);
        } else {
            System.out.println(" Şarjor kapasitesi dolu. Daha fazla şarjor ekleyemezsiniz.");
        }
    }


    public void atesEt(double hedefMenzili) { // tekli ates etme fonksiyonu
        if (this.sarjorList.size() > 0) {
            if (hedefMenzili <= getEtkinMenzil()) {
                for (Sarjor sarjor : this.sarjorList) {
                    if (sarjor.mermiAtesle()) {
                        break;
                    }
                }
            } else {
                System.out.println("Hedef menzili Etkin menzil sınırları içinde değildir.");
            }
        } else {
            System.out.println(" Şarjor listesi boştur. Sarjor ekleyiniz.");
        }
    }

    public void doldur() {  // sarjor doldur fonsiyonu. Sarjor listesinde olan tüm sarjorleri fuller.
        
        if (this.sarjorList.size() > 0) {
            for (Sarjor sarjor : this.sarjorList) {
                sarjor.sarjoruDoldur();
            }
        } else {
            System.out.println(" Şarjor listesi boştur. Sarjor ekleyiniz.");
        }
    }
    

    public int getSarjorSayisi() { // şarjör sayisi değerini almak için .
        return this.sarjorList.size();
    }

    public int getSarjorKapasitesi() { // şarjör kapasitesinin değerini almak için .
        return sarjorKapasitesi;
    }

    public int getSeriAtisSaiysi() { // seri atış sayısının değerini almak için .
        return seriAtisSaiysi;
    }

    public int getToplamMermiSayisi() { // takılı sarjorlerin toplam anlık mermi sayısının değerini almak için .
        int toplamMermiSaiyisi = 0;
        if (this.sarjorList.size() > 0) {
            for (Sarjor sarjor : sarjorList) {
                toplamMermiSaiyisi += sarjor.getAnlikMermiSayisi();
            }
        }
        return toplamMermiSaiyisi;
    }

    public int getToplamMermiKapasitesi() { // takılı sarjorlerin toplam mermi kapasitesi sayısının değerini almak için .
        int toplamMermiKapasitesi = 0;
        if (this.sarjorList.size() > 0) {
            for (Sarjor sarjor : sarjorList) {
                toplamMermiKapasitesi += sarjor.getMermiKapasitesi();
            }
        }
        return toplamMermiKapasitesi;
    }

    public String getOtomotoikSilahBilgileri() { // otomotik silah bilgilerini geri döner
        String otomotikSilahBilgileri = " Adı : " + getMarka()
                + ",\n şarjör sayısı : " + getSarjorSayisi()
                + ",\n sarjor kapasitesi : " + getSarjorKapasitesi()
                + ",\n sarjor seri atıs sayısı : " + getSeriAtisSaiysi()
                + ",\n toplam mermi kapasitesi : " + getToplamMermiKapasitesi()
                + ",\n toplam mermi sayısı : " + getToplamMermiSayisi()
                + ",\n etkin menzili : " + getEtkinMenzil();

        return otomotikSilahBilgileri;
    }

    public void otomotoikSilahBilgileriniYazdır() {
        System.out.println(getOtomotoikSilahBilgileri());
    }

    @Override
    public int getMermiSayisi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
