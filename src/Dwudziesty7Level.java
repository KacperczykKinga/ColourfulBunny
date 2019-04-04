import javax.swing.ImageIcon;

public class Dwudziesty7Level {
	public void uruchom() {
		int[] odpowiednieKolory= {2,3,2,3};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/dwudziesty7Level.png");
	    Bunny4 moje=new Bunny4(odpowiednieKolory, 27, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
