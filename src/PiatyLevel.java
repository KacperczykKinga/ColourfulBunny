import javax.swing.ImageIcon;

public class PiatyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {2,0,2,0};
		ImageIcon zmianyKolorow=new ImageIcon("data/pierwszeLev.png");
		ImageIcon koniec=new ImageIcon("data/piatyLevel.png");
	    Bunny moje=new Bunny(odpowiednieKolory, 5, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
