import javax.swing.ImageIcon;

public class Szescdziesiaty3Level {
	public void uruchom() {
		int[] odpowiednieKolory= {2,1,1,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/piateLev.png");
		ImageIcon koniec=new ImageIcon("data/szescdziesiaty3Level.png");
	    Bunny8 moje=new Bunny8(odpowiednieKolory, 63, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
