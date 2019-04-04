import javax.swing.ImageIcon;

public class Dwudziesty4Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,1,1,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/szesnastyLevel.png");
	    Bunny3 moje=new Bunny3(odpowiednieKolory, 24, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
