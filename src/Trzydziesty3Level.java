import javax.swing.ImageIcon;

public class Trzydziesty3Level {
	public void uruchom() {
		int[] odpowiednieKolory= {1,1,1,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/pierwszyLevel.png");
	    Bunny5 moje=new Bunny5(odpowiednieKolory, 33, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
