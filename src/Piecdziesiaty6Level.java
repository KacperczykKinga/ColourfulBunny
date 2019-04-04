import javax.swing.ImageIcon;

public class Piecdziesiaty6Level {
	public void uruchom() {
		int[] odpowiednieKolory= {0,3,3,0};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty8Level.png");
	    Bunny6 moje=new Bunny6(odpowiednieKolory, 56, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
