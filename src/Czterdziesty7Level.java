import javax.swing.ImageIcon;

public class Czterdziesty7Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,0,0,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty7Level.png");
	    Bunny7 moje=new Bunny7(odpowiednieKolory, 47, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
