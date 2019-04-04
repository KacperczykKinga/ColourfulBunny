import javax.swing.ImageIcon;

public class Piecdziesiaty8Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,4,4,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/piateLev.png");
		ImageIcon koniec=new ImageIcon("data/piecdziesiaty8Level.png");
	    Bunny8 moje=new Bunny8(odpowiednieKolory, 58, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
