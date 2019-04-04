import javax.swing.ImageIcon;

public class SzesnastyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {4,1,1,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/szesnastyLevel.png");
	    Bunny2 moje=new Bunny2(odpowiednieKolory, 16, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
