import javax.swing.ImageIcon;

public class Czterdziesty5Level {
	public void uruchom() {
		int[] odpowiednieKolory= {0,0,2,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty5Level.png");
	    Bunny7 moje=new Bunny7(odpowiednieKolory, 45, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
