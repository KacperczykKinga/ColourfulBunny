import javax.swing.ImageIcon;

public class Dwudziesty5Level {
	public void uruchom() {
		int[] odpowiednieKolory= {4,4,4,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/dziewiatyLevel.png");
	    Bunny4 moje=new Bunny4(odpowiednieKolory, 25, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
