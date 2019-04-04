import javax.swing.ImageIcon;

public class Trzydziesty1Level {
	public void uruchom() {
		int[] odpowiednieKolory= {3,2,2,3};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/trzydziesty1Level.png");
	    Bunny4 moje=new Bunny4(odpowiednieKolory, 31, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
