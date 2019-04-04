import javax.swing.ImageIcon;

public class Piecdziesiaty9Level {
	public void uruchom() {
		int[] odpowiednieKolory= {2,2,4,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/piateLev.png");
		ImageIcon koniec=new ImageIcon("data/piecdziesiaty2Level.png");
	    Bunny8 moje=new Bunny8(odpowiednieKolory, 59, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
