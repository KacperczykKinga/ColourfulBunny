import javax.swing.ImageIcon;

public class Dwudziesty3Level {
	public void uruchom() {
		int[] odpowiednieKolory= {1,3,3,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/trzeciLevel.png");
	    Bunny3 moje=new Bunny3(odpowiednieKolory, 23, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
