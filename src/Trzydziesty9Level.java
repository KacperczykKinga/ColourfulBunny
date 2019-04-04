import javax.swing.ImageIcon;

public class Trzydziesty9Level {
	public void uruchom() {
		int[] odpowiednieKolory= {3,0,0,3};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/pietnastyLevel.png");
	    Bunny5 moje=new Bunny5(odpowiednieKolory, 39, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
