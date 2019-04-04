import javax.swing.ImageIcon;

public class Czterdziesty8Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,5,5,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/piecdziesiaty6Level.png");
	    Bunny7 moje=new Bunny7(odpowiednieKolory, 48, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
