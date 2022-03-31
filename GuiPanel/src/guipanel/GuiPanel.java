package GuiPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GuiPanel {


    JPanel anaPanel = new JPanel(new GridLayout(1, 1));

    JPanel tabancaPanel = new JPanel();
    JLabel tabancaPanelEtiketi = new JLabel("Tabanca");

    // beratta panel bilgileri
    JPanel berattaPanel = new JPanel();
    JLabel berattaTabancaEtiketi = new JLabel("Beratta Tabancası --> ");
    JButton berattaAtesEtButonu = new JButton("ates et");
    JButton berattaMermiDoldurButonu = new JButton("mermi doldur");
    JLabel berattaMenzilEtiketi = new JLabel("Hedef Menzili : ");
    JTextField berattaMenzil = new JTextField(5);
    JTextArea berattaBilgileri = new JTextArea(2, 20);

    Sarjor berattaSarjor = new Sarjor(20, 20); // mermi kapasitesi ve anlık mermi sayısı
    Tabanca berattaTabanca = new Tabanca("Beratta", 100, berattaSarjor); 

    // taarruz panel bilgileri
    JPanel taarruzPanel = new JPanel();
    JLabel taarruzTabancaEtiketi = new JLabel("Taarruz Tabancası --> ");
    JButton taarruzAtesEtButonu = new JButton("ates et");
    JButton taarruzMermiDoldurButonu = new JButton("mermi doldur");
    JLabel taarruzMenzilEtiketi = new JLabel("Hedef Menzili : ");
    JTextField taarruzMenzil = new JTextField(5);
    JTextArea taarruzBilgileri = new JTextArea(2, 20);

    Sarjor taarruzSarjor = new Sarjor(25, 25); // mermi kapasitesi ve anlık mermi sayısı
    Tabanca taarruzTabanca = new Tabanca("Taarruz", 120, taarruzSarjor);


    // baby eagle panel bilgileri
    JPanel babyEaglePanel = new JPanel();
    JLabel babyEagleTabancaEtiketi = new JLabel("Baby Eagle Tabancası --> ");
    JButton babyEagleAtesEtButonu = new JButton("ates et");
    JButton babyEagleMermiDoldurButonu = new JButton("mermi doldur");
    JLabel babyEagleMenzilEtiketi = new JLabel("Hedef Menzili : ");
    JTextField babyEagleMenzil = new JTextField(5);
    JTextArea babyEagleBilgileri = new JTextArea(2, 20);

    Sarjor babyEagleSarjor = new Sarjor(20, 20);  // mermi kapasitesi ve anlık mermi sayısı
    Tabanca babyEagleTabanca = new Tabanca("Baby Eagle", 150, babyEagleSarjor);


    JPanel otomotikSilahPanel = new JPanel();
    JLabel otomotoikSilahPanelEtiketi = new JLabel("Otomotik Silah");

    // uzi panel bilgileri
    JPanel uziPanel = new JPanel();
    JLabel uziEtiketi = new JLabel("Uzi Otomatik Silah --> ");
    JButton uziAtesEtButonu = new JButton("ates et");
    JButton uziSeriAtesEtButonu = new JButton("seri ates et");
    JButton uziMermiDoldurButonu = new JButton("mermi doldur");
    JButton uziSarjorEkleButonu = new JButton("sarjor ekle");
    JLabel uziMenzilEtiketi = new JLabel("Hedef Menzili : ");
    JTextField uziMenzil = new JTextField(5);
    JTextArea uziBilgileri = new JTextArea(2, 20);

    OtomotikSilah uziOtomatikSilah = new OtomotikSilah("Uzi", 250);

    // heckler panel bilgileri
    JPanel hecklerPanel = new JPanel();
    JLabel hecklerEtiketi = new JLabel("Heckler Otomatik Silah --> ");
    JButton hecklerAtesEtButonu = new JButton("ates et");
    JButton hecklerSeriAtesEtButonu = new JButton("seri ates et");
    JButton hecklerMermiDoldurButonu = new JButton("mermi doldur");
    JButton hecklerSarjorEkleButonu = new JButton("sarjor ekle");
    JLabel hecklerMenzilEtiketi = new JLabel("Hedef Menzili : ");
    JTextField hecklerMenzil = new JTextField(5);
    JTextArea hecklerBilgileri = new JTextArea(2, 20);

    OtomotikSilah hecklerOtomatikSilah = new OtomotikSilah("Heckler & Koch HK4", 500);

    // carbine panel bilgileri
    JPanel carbinePanel = new JPanel();
    JLabel carbineEtiketi = new JLabel("Carbine Otomatik Silah --> ");
    JButton carbineAtesEtButonu = new JButton("ates et");
    JButton carbineSeriAtesEtButonu = new JButton("seri ates et");
    JButton carbineMermiDoldurButonu = new JButton("mermi doldur");
    JButton carbineSarjorEkleButonu = new JButton("sarjor ekle");
    JLabel carbineMenzilEtiketi = new JLabel("Hedef Menzili : ");
    JTextField carbineMenzil = new JTextField(5);
    JTextArea carbineBilgileri = new JTextArea(2, 20);

    OtomotikSilah carbineOtomatikSilah = new OtomotikSilah("M4 Carbine", 750);

    Asker asker = new Asker("Yusuf Mendeş", "Er"); // asker bilgileri 


    public GuiPanel() {

        askerTechizatListesi();
        guiOlustur();
        
        // tabanca ve otomotik silah için aksiyonlar oluşturuldu.
        
        tabancaAksyonEkle(berattaAtesEtButonu, berattaMermiDoldurButonu, berattaMenzil, berattaBilgileri, berattaTabanca);
        tabancaAksyonEkle(taarruzAtesEtButonu, taarruzMermiDoldurButonu, taarruzMenzil, taarruzBilgileri, taarruzTabanca); 
        tabancaAksyonEkle(babyEagleAtesEtButonu, babyEagleMermiDoldurButonu, babyEagleMenzil, babyEagleBilgileri, babyEagleTabanca); 

        otomotikSilahAksyonEkle(uziAtesEtButonu, uziSeriAtesEtButonu, uziMermiDoldurButonu, uziSarjorEkleButonu, uziMenzil, uziBilgileri, uziOtomatikSilah); 
        otomotikSilahAksyonEkle(hecklerAtesEtButonu, hecklerSeriAtesEtButonu, hecklerMermiDoldurButonu, hecklerSarjorEkleButonu, hecklerMenzil, hecklerBilgileri, hecklerOtomatikSilah); 
        otomotikSilahAksyonEkle(carbineAtesEtButonu, carbineSeriAtesEtButonu, carbineMermiDoldurButonu, carbineSarjorEkleButonu, carbineMenzil, carbineBilgileri, carbineOtomatikSilah); 


    }

    private void askerTechizatListesi() { 
        // gerekli techizatlar askere yüklendi.
        asker.tabancaEkle(berattaTabanca);
        asker.tabancaEkle(taarruzTabanca);
        asker.tabancaEkle(babyEagleTabanca);
        asker.otomotikSilahEkle(uziOtomatikSilah);
        asker.otomotikSilahEkle(hecklerOtomatikSilah);
        asker.otomotikSilahEkle(carbineOtomatikSilah);
    }

    /*
      Bir tane JFrame oluşturulup üzerine ana panel yerleştirldi. Daha sonra bu ana panel üzerine 2 tane panel eklendi.
      Bunlardan bir tanesi eklenen tabancaları üzerinde tutan panel, diğeri eklenen otomotik silahları üzerinde tutan panel.
      Oluşturulan tabancalar(her biri ayrı bir panel olarak örneğin beratta paneli) tabanca panelinin üzerine eklendi.
      Oluşturulan otomotik silahlar(her biri ayrı bir panel olarak örneğin uzi paneli) otomotik silah panelinin üzerine eklendi.
     */

    private void guiOlustur() {

        JFrame frame = new JFrame(asker.getAskerBilgileri());
        frame.getContentPane().setLayout(null); // null demez isen boyutu ayarlanmaz.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // kapatıldığında kapanması için.
        frame.pack();
        frame.setVisible(true); // erişilir kılndı.
        frame.setBounds(0, 0, 1600, 1000);

        frame.setTitle(asker.getAskerBilgileri());

        anaPanel.setSize(1600, 800);
        anaPanel.setLayout(null);
        anaPanel.add(tabancaPanel);
        anaPanel.add(otomotikSilahPanel);
        frame.getContentPane().add(anaPanel);


        // tabanca panel bilgileri
        tabancaPanel.setSize(700, 800);
        tabancaPanel.setLocation(0, 0);
        tabancaPanel.setBackground(Color.GRAY);
        tabancaPanel.setLayout(new BoxLayout(tabancaPanel, BoxLayout.Y_AXIS));
        tabancaPanel.add(tabancaPanelEtiketi);


        // beratta tabancasının genel biligleri(ates et butonu, mermi doldur, hedef menzili girilecek text alanı gibi ) panele eklendi.
        berattaPanel.add(berattaTabancaEtiketi);
        berattaPanel.add(berattaAtesEtButonu);
        berattaPanel.add(berattaMermiDoldurButonu);
        berattaPanel.add(berattaMenzilEtiketi);
        berattaPanel.add(berattaMenzil);
        berattaBilgileri.setLineWrap(true);
        berattaBilgileri.setEditable(false);
        berattaPanel.add(berattaBilgileri);
        tabancaPanel.add(berattaPanel);


        // taarruz tabancasının genel biligleri(ates et butonu, mermi doldur, hedef menzili girilecek text alanı gibi ) panele eklendi.
        taarruzPanel.add(taarruzTabancaEtiketi);
        taarruzPanel.add(taarruzAtesEtButonu);
        taarruzPanel.add(taarruzMermiDoldurButonu);
        taarruzPanel.add(taarruzMenzilEtiketi);
        taarruzPanel.add(taarruzMenzil);
        taarruzBilgileri.setLineWrap(true);
        taarruzBilgileri.setEditable(false);
        taarruzPanel.add(taarruzBilgileri);
        tabancaPanel.add(taarruzPanel);

        // baby eagle tabancasının genel biligleri(ates et butonu, mermi doldur butonu, hedef menzili girilecek text alanı gibi ) panele eklendi.
        babyEaglePanel.add(babyEagleTabancaEtiketi);
        babyEaglePanel.add(babyEagleAtesEtButonu);
        babyEaglePanel.add(babyEagleMermiDoldurButonu);
        babyEaglePanel.add(babyEagleMenzilEtiketi);
        babyEaglePanel.add(babyEagleMenzil);
        babyEagleBilgileri.setLineWrap(true);
        babyEagleBilgileri.setEditable(false);
        babyEaglePanel.add(babyEagleBilgileri);
        tabancaPanel.add(babyEaglePanel);


        // otomotik silah panel bilgileri
        otomotikSilahPanel.setSize(900, 800);
        otomotikSilahPanel.setLocation(700, 0);
        otomotikSilahPanel.setBackground(Color.BLUE);
        otomotikSilahPanel.setLayout(new BoxLayout(otomotikSilahPanel, BoxLayout.Y_AXIS));
        otomotikSilahPanel.add(otomotoikSilahPanelEtiketi);


        // uzi otomotik silahının genel biligleri(ates et butonu, mermi doldur butonu, hedef menzili girilecek text alanı gibi ) panele eklendi.
        uziPanel.add(uziEtiketi);
        uziPanel.add(uziAtesEtButonu);
        uziPanel.add(uziSeriAtesEtButonu);
        uziPanel.add(uziMermiDoldurButonu);
        uziPanel.add(uziSarjorEkleButonu);
        uziPanel.add(uziMenzilEtiketi);
        uziPanel.add(uziMenzil);
        uziBilgileri.setLineWrap(true);
        uziBilgileri.setEditable(false);
        uziPanel.add(uziBilgileri);
        otomotikSilahPanel.add(uziPanel);

        // heckler otomotik silahının genel biligleri(ates et butonu, mermi doldur butonu, hedef menzili girilecek text alanı gibi ) panele eklendi.
        hecklerPanel.add(hecklerEtiketi);
        hecklerPanel.add(hecklerAtesEtButonu);
        hecklerPanel.add(hecklerSeriAtesEtButonu);
        hecklerPanel.add(hecklerMermiDoldurButonu);
        hecklerPanel.add(hecklerSarjorEkleButonu);
        hecklerPanel.add(hecklerMenzilEtiketi);
        hecklerPanel.add(hecklerMenzil);
        hecklerBilgileri.setLineWrap(true);
        hecklerBilgileri.setEditable(false);
        hecklerPanel.add(hecklerBilgileri);
        otomotikSilahPanel.add(hecklerPanel);

        // carbine otomotik silahının genel biligleri(ates et butonu, mermi doldur butonu, hedef menzili girilecek text alanı gibi ) panele eklendi.
        carbinePanel.add(carbineEtiketi);
        carbinePanel.add(carbineAtesEtButonu);
        carbinePanel.add(carbineSeriAtesEtButonu);
        carbinePanel.add(carbineMermiDoldurButonu);
        carbinePanel.add(carbineSarjorEkleButonu);
        carbinePanel.add(carbineMenzilEtiketi);
        carbinePanel.add(carbineMenzil);
        carbineBilgileri.setLineWrap(true);
        carbineBilgileri.setEditable(false);
        carbinePanel.add(carbineBilgileri);
        otomotikSilahPanel.add(carbinePanel);


    }

    /*
        Gui deki tabancalar aksiyonları için generic fonksiyon oluşturuldu.
    */
    private void tabancaAksyonEkle(JButton atesEtButonu, JButton mermiDoldurButonu, JTextField hedefMenzil,
                                   JTextArea bilgiEtiketi, Tabanca tabanca) {

        bilgiEtiketi.setText(tabanca.getTabancaBilgileri()); // Tabanca bilgilerini ilk yüklenirken göstermek için set edildi.
        atesEtButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double hedefmenzil = Double.parseDouble(hedefMenzil.getText());
                    tabanca.tabancaBilgileriniYazdır(); // tabanca ateşlenmeden önce silah biligileri yazdırıldı.
                    tabanca.atesEt(hedefmenzil);                  
                    tabanca.tabancaBilgileriniYazdır(); // tabanca ateşlendikten sonra silah biligiler yazdırıldı.
                    bilgiEtiketi.setText(tabanca.getTabancaBilgileri()); // Tabanca güncel bilgilerini alıp paneldeki etikete set edilerek güncellenmesi sağlandı.
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,
                            "Hata: Geçersiz değer. Hedef Menzilini kontrol et", "Error Message",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        mermiDoldurButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabanca.tabancaBilgileriniYazdır(); // tabancaya mermi doldurulmadan önce silah biligileri yazdırıldı.
                tabanca.doldur();
                tabanca.tabancaBilgileriniYazdır(); // tabancaya mermi doldurulduktan sonra silah biligiler yazdırıldı.
                bilgiEtiketi.setText(tabanca.getTabancaBilgileri()); // Tabanca güncel bilgilerini alıp paneldeki etikete set edilerek güncellenmesi sağlandı.
            }
        });
    }

    /*
        Gui deki otomotik silahların aksiyonları için generic method oluşturuldu.
    */
    private void otomotikSilahAksyonEkle(JButton atesEtButonu, JButton seriAtesEtButonu, JButton mermiDoldurButonu,
                                         JButton sarjorEkleButonu, JTextField hedefMenzil, JTextArea bilgiEtiketi, OtomotikSilah otomotikSilah) {

        bilgiEtiketi.setText(otomotikSilah.getOtomotoikSilahBilgileri()); // Otomotik Silah bilgilerini ilk yüklenirken göstermek için set edildi.
        atesEtButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double hedefmenzil = Double.parseDouble(hedefMenzil.getText());
                    otomotikSilah.otomotoikSilahBilgileriniYazdır(); // otomotik silah ateşlenmeden önce silah biligileri yazdırıldı.
                    otomotikSilah.atesEt(hedefmenzil);
                    otomotikSilah.otomotoikSilahBilgileriniYazdır(); // otomotik silah ateşlendikten sonra silah biligiler yazdırıldı.
                    bilgiEtiketi.setText(otomotikSilah.getOtomotoikSilahBilgileri()); // Otomotik silah güncel bilgilerini alıp paneldeki etikete set edilerek güncellenmesi sağlandı.
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,
                            "Hata: Geçersiz değer. Hedef Menzilini kontrol et", "Error Message",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        seriAtesEtButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double hedefmenzil = Double.parseDouble(hedefMenzil.getText());
                    otomotikSilah.otomotoikSilahBilgileriniYazdır(); // otomotik silah seri ateşlenmeden önce silah biligileri yazdırıldı.
                    otomotikSilah.seriAtis(hedefmenzil);
                    otomotikSilah.otomotoikSilahBilgileriniYazdır(); // otomotik silah seri ateşlendikten sonra silah biligiler yazdırıldı.
                    bilgiEtiketi.setText(otomotikSilah.getOtomotoikSilahBilgileri()); // Otomotik silah güncel bilgilerini alıp paneldeki etikete set edilerek güncellenmesi sağlandı.
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,
                            "Hata: Geçersiz değer. Hedef Menzilini kontrol et", "Error Message",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        mermiDoldurButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                otomotikSilah.otomotoikSilahBilgileriniYazdır(); // otomotik silaha mermi doldurulmadan önce silah biligileri yazdırıldı.
                otomotikSilah.doldur();
                otomotikSilah.otomotoikSilahBilgileriniYazdır(); // otomotik silaha mermi doldurulduktan sonra silah biligileri yazdırıldı.
                bilgiEtiketi.setText(otomotikSilah.getOtomotoikSilahBilgileri()); // Otomotik silah güncel bilgilerini alıp paneldeki etikete set edilerek güncellenmesi sağlandı.
            }
        });

        sarjorEkleButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                otomotikSilah.otomotoikSilahBilgileriniYazdır(); // otomotik silaha sarjor eklenmeden önce silah biligileri yazdırıldı.
                Sarjor otomotikSilahSarjor = new Sarjor(60, 60); 
                otomotikSilah.sarjorEkle(otomotikSilahSarjor);
                otomotikSilah.otomotoikSilahBilgileriniYazdır(); // otomotik silaha sarjor eklendikten sonra silah biligileri yazdırıldı.
                bilgiEtiketi.setText(otomotikSilah.getOtomotoikSilahBilgileri()); // Otomotik silah güncel bilgilerini alıp paneldeki etikete set edilerek güncellenmesi sağlandı.
            }
        });
    }

    public static void main(String[] args) {
        
    
        GuiPanel guiPanel = new GuiPanel();
    }
}


