import javax.swing.ImageIcon;

public class Czterdziesty6Level {
	public void uruchom() {
		int[] odpowiednieKolory= {3,3,5,5};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/piecdziesiaty2Level.png");
	    Bunny7 moje=new Bunny7(odpowiednieKolory, 46, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
