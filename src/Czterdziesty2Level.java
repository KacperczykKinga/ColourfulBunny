import javax.swing.ImageIcon;

public class Czterdziesty2Level {
	public void uruchom() {
		int[] odpowiednieKolory= {3,3,3,3};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty2Level.png");
	    Bunny7 moje=new Bunny7(odpowiednieKolory, 42, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
