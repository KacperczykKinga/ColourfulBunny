import javax.swing.ImageIcon;

public class Piecdziesiaty3Level {
	public void uruchom() {
		int[] odpowiednieKolory= {0,0,2,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty5Level.png");
	    Bunny6 moje=new Bunny6(odpowiednieKolory, 53, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
