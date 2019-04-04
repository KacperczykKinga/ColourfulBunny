import javax.swing.ImageIcon;

public class CzwartyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {2,0,0,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/pierwszeLev.png");
		ImageIcon koniec=new ImageIcon("data/czwartyLevel.png");
	    Bunny moje=new Bunny(odpowiednieKolory, 4, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
