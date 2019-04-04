import javax.swing.ImageIcon;

public class Trzydziesty8Level {
	public void uruchom() {
		int[] odpowiednieKolory= {5,5,3,3};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/dziesiatyLevel.png");
	    Bunny5 moje=new Bunny5(odpowiednieKolory, 38, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
