import javax.swing.ImageIcon;

public class Piecdziesiaty7Level {
	public void uruchom() {
		int[] odpowiednieKolory= {2,2,2,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/piateLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty2Level.png");
	    Bunny8 moje=new Bunny8(odpowiednieKolory, 57, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
