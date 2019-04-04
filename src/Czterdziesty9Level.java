import javax.swing.ImageIcon;

public class Czterdziesty9Level {
	public void uruchom() {
		int[] odpowiednieKolory= {0,0,0,0};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/trzydziesty4Level.png");
	    Bunny6 moje=new Bunny6(odpowiednieKolory, 49, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
