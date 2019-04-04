import javax.swing.ImageIcon;

public class OsmyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {0,0,1,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/pierwszeLev.png");
		ImageIcon koniec=new ImageIcon("data/osmyLevel.png");
	    Bunny moje=new Bunny(odpowiednieKolory, 8, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
