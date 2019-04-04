import javax.swing.ImageIcon;

public class Dwudziesty9Level {
	public void uruchom() {
		int[] odpowiednieKolory= {3,3,2,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/siodmyLevel.png");
	    Bunny4 moje=new Bunny4(odpowiednieKolory, 29, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
