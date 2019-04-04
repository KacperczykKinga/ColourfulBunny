import javax.swing.ImageIcon;

public class Dwudziesty6Level {
	public void uruchom() {
		int[] odpowiednieKolory= {6,6,6,6};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/dwudziesty6Level.png");
	    Bunny4 moje=new Bunny4(odpowiednieKolory, 26, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
