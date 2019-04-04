import javax.swing.ImageIcon;

public class Trzydziesty7Level {
	public void uruchom() {
		int[] odpowiednieKolory= {7,7,4,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/trzydziesty7Level.png");
	    Bunny5 moje=new Bunny5(odpowiednieKolory, 37, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
