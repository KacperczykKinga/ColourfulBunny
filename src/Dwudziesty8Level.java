import javax.swing.ImageIcon;

public class Dwudziesty8Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,2,4,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/czternastyLevel.png");
	    Bunny4 moje=new Bunny4(odpowiednieKolory, 28, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
