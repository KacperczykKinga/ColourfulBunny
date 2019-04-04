import javax.swing.ImageIcon;

public class Szescdziesiaty4Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,5,5,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/piateLev.png");
		ImageIcon koniec=new ImageIcon("data/szescdziesiaty4Level.png");
	    Bunny8 moje=new Bunny8(odpowiednieKolory, 64, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
