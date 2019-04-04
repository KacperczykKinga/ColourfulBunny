import javax.swing.ImageIcon;

public class Czterdziesty4Level {
	public void uruchom() {
		int[] odpowiednieKolory= {0,1,0,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/dwudziesty7Level.png");
	    Bunny7 moje=new Bunny7(odpowiednieKolory, 44, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
