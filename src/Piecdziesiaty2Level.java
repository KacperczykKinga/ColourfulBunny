import javax.swing.ImageIcon;

public class Piecdziesiaty2Level {
	public void uruchom() {
		int[] odpowiednieKolory= {3,1,3,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty4Level.png");
	    Bunny6 moje=new Bunny6(odpowiednieKolory, 52, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
