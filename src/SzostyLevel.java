import javax.swing.ImageIcon;

public class SzostyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {3,1,3,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/pierwszeLev.png");
		ImageIcon koniec=new ImageIcon("data/szostyLevel.png");
	    Bunny moje=new Bunny(odpowiednieKolory, 6, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
