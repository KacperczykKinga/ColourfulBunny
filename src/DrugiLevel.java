import javax.swing.ImageIcon;

public class DrugiLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {0,0,0,0};
		ImageIcon zmianyKolorow=new ImageIcon("data/pierwszeLev.png");
		ImageIcon koniec=new ImageIcon("data/drugiLevel.png");
	    Bunny moje=new Bunny(odpowiednieKolory, 2, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
