import javax.swing.ImageIcon;

public class Trzydziesty5Level {
	public void uruchom() {
		int[] odpowiednieKolory= {3,1,3,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/szostyLevel.png");
	    Bunny5 moje=new Bunny5(odpowiednieKolory, 35, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
