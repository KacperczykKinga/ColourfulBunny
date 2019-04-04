import javax.swing.ImageIcon;

public class TrzeciLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {1,3,3,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/pierwszeLev.png");
		ImageIcon koniec=new ImageIcon("data/trzeciLevel.png");
	    Bunny moje=new Bunny(odpowiednieKolory, 3,zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
