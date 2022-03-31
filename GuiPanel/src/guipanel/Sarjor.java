package GuiPanel;

public class Sarjor implements ISarjor {

    private  int mermiKapasitesi; 
    private int anlikMermiSayisi; 
    private int mermisayisi;

    /*
        anlık mermi sayisi mermi kapasitesinden fazla olamaz.
    */
    public Sarjor(int mermiKapasitesi, int anlikMermiSayisi) {
        this.mermiKapasitesi = mermiKapasitesi;
        this.anlikMermiSayisi = anlikMermiSayisi;
    }

    /*
        şarjorde mermi yok ise false var ise true donulecek
    */
    @Override
    public boolean mermiAtesle() {
        if (anlikMermiSayisi > 0) {
            this.anlikMermiSayisi = --this.anlikMermiSayisi;
            return true; // şarjorde mermi vardı ateslendi.
        }else{
            System.out.println(" Şarjorde mermi bulunmamaktdadır. Mermi Doldurunuz.");
        }
        return false; // şarjorde mermi yok
    }

    /*
        şarjore mermi doldurulduğunda mermi kapasitesi anlik mermi sayisana set edildi. Yani şarjor fullendi.
    */
    @Override
    public void sarjoruDoldur() {
        this.anlikMermiSayisi = this.mermiKapasitesi;
    }


    @Override
    public int getMermiKapasitesi() {
        return mermiKapasitesi;
    }

    @Override
    public int getAnlikMermiSayisi() {
        return anlikMermiSayisi;
    }


}
