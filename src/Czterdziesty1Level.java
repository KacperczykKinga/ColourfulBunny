import javax.swing.ImageIcon;

public class Czterdziesty1Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,4,4,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/dwudziesty6Level.png");
	    Bunny7 moje=new Bunny7(odpowiednieKolory, 41, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
