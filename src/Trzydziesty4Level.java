import javax.swing.ImageIcon;

public class Trzydziesty4Level {
	public void uruchom() {
		int[] odpowiednieKolory= {2,2,2,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/trzydziesty4Level.png");
	    Bunny5 moje=new Bunny5(odpowiednieKolory, 34, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
