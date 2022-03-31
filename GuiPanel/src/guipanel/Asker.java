package GuiPanel;

import java.util.ArrayList;

public class Asker {

  
    private String isim;

    private String rutbe;

    private ArrayList<Sarjor> sarjorListesi = new ArrayList<>();

    private ArrayList<Tabanca> tabancaListesi = new ArrayList<>();

    private ArrayList<OtomotikSilah> otomotikSilahListesi = new ArrayList<>();


    public Asker(String isim, String rutbe) {
        this.isim = isim;
        this.rutbe = rutbe;
    }

    public void sarjorEkle(Sarjor sarjor) {
        this.sarjorListesi.add(sarjor);
    }

    public void tabancaEkle(Tabanca tabanca) {
        this.tabancaListesi.add(tabanca);
    }

    public void otomotikSilahEkle(OtomotikSilah otomotikSilah) {
        this.otomotikSilahListesi.add(otomotikSilah);
    }

    public String getIsim() {
        return isim;
    }

    public String getRutbe() {
        return rutbe;
    }

    public ArrayList<Sarjor> getSarjorListesi() {
        return sarjorListesi;
    }

    public ArrayList<Tabanca> getTabancaListesi() {
        return tabancaListesi;
    }

    public ArrayList<OtomotikSilah> getOtomotikSilahListesi() {
        return otomotikSilahListesi;
    }

    public String getAskerBilgileri() { 
        String askerBilgileri = "Askerin Adı-Soyadı : " + getIsim()
                + ", Askerin Rutbesi : " + getRutbe();

        return askerBilgileri;
    }
}