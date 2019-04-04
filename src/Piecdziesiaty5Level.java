import javax.swing.ImageIcon;

public class Piecdziesiaty5Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,0,0,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty7Level.png");
	    Bunny6 moje=new Bunny6(odpowiednieKolory, 55, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
