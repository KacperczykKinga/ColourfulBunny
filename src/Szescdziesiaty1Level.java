import javax.swing.ImageIcon;

public class Szescdziesiaty1Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,1,4,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/piateLev.png");
		ImageIcon koniec=new ImageIcon("data/szescdziesiaty1Level.png");
	    Bunny8 moje=new Bunny8(odpowiednieKolory, 61, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
