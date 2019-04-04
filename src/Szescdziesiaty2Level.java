import javax.swing.ImageIcon;

public class Szescdziesiaty2Level {
	public void uruchom() {
		int[] odpowiednieKolory= {0,4,0,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/piateLev.png");
		ImageIcon koniec=new ImageIcon("data/szescdziesiaty2Level.png");
	    Bunny8 moje=new Bunny8(odpowiednieKolory, 62, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
