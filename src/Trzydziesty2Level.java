import javax.swing.ImageIcon;

public class Trzydziesty2Level {
	public void uruchom() {
		int[] odpowiednieKolory= {5,6,6,5};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/trzydziesty2Level.png");
	    Bunny4 moje=new Bunny4(odpowiednieKolory, 32, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
