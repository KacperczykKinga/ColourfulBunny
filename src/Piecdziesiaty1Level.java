import javax.swing.ImageIcon;

public class Piecdziesiaty1Level {
	public void uruchom() {
		int[] odpowiednieKolory= {0,5,0,5};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty3Level.png");
	    Bunny6 moje=new Bunny6(odpowiednieKolory, 51, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
