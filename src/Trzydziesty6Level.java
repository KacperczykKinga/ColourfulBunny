import javax.swing.ImageIcon;

public class Trzydziesty6Level {
	public void uruchom() {
		int[] odpowiednieKolory= {1,5,1,5};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/dwudziesty2Level.png");
	    Bunny5 moje=new Bunny5(odpowiednieKolory, 36, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
